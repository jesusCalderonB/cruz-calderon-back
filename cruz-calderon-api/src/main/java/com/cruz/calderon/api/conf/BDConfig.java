package com.cruz.calderon.api.conf;

import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author jesusc
 * 5 dic. 2019
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = "com.cruz.calderon.data.repository")
@EntityScan(basePackages = "com.cruz.calderon.data.entity")
public class BDConfig {

	/**
	 * 
	 */
	private static final String HIBERNATE_DEFAULT_SCHEMA = "spring.jpa.properties.hibernate.default_schema";
	
	@Autowired
	private Environment env;

	@Bean("dataSource")
	public DataSource getDataSource() {
		final HikariConfig dataSourceConfig = new HikariConfig();
		dataSourceConfig.setJdbcUrl(env.getProperty("spring.datasource.url"));
		dataSourceConfig.setUsername(env.getProperty("spring.datasource.username"));
		dataSourceConfig.setPassword(env.getProperty("spring.datasource.password"));
		dataSourceConfig.setDriverClassName(env.getProperty("spring.datasource.driver"));
		dataSourceConfig.setPoolName(env.getProperty("spring.datasource.poolName"));
		dataSourceConfig.setMaximumPoolSize(env.getProperty("spring.datasource.maximumPoolSize", Integer.class));
		dataSourceConfig.setMinimumIdle(env.getProperty("spring.datasource.minimumIdle", Integer.class));
//		dataSourceConfig.setConnectionTimeout(env.getProperty("spring.datasource.connectionTimeoutMs", Long.class));
//		dataSourceConfig.setIdleTimeout(env.getProperty("spring.datasource.idleTimeoutMs", Long.class));
		dataSourceConfig.addDataSourceProperty("cachePrepStmts", env.getProperty("spring.datasource.properties.cachePrepStmts", Boolean.class));
		dataSourceConfig.addDataSourceProperty("prepStmtCacheSize", env.getProperty("spring.datasource.properties.prepStmtCacheSize", Integer.class));
		dataSourceConfig.addDataSourceProperty("prepStmtCacheSqlLimit", env.getProperty("spring.datasource.properties.prepStmtCacheSqlLimit", Integer.class));
		dataSourceConfig.addDataSourceProperty("useServerPrepStmts", env.getProperty("spring.datasource.properties.useServerPrepStmts", Boolean.class));
		return new HikariDataSource(dataSourceConfig);
	}

	@Primary
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("dataSource") DataSource dataSource) {
		Builder persistenceUnit = builder.dataSource(dataSource).packages("com.cruz.calderon.data.entity").persistenceUnit("cruz-calderon");
		Map<String, Object> props = new TreeMap<>();
		props.put("hibernate.show_sql", env.getProperty("spring.jpa.properties.hibernate.show_sql"));
		props.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
		props.put("hibernate.temp.use_jdbc_metadata_defaults", env.getProperty("spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults"));
		if (env.getProperty(HIBERNATE_DEFAULT_SCHEMA) != null && !"".equals(env.getProperty(HIBERNATE_DEFAULT_SCHEMA).trim())) {
			props.put("hibernate.default_schema", env.getProperty(HIBERNATE_DEFAULT_SCHEMA).trim());
		}
		persistenceUnit.properties(props);
		return persistenceUnit.build();
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
	
}
