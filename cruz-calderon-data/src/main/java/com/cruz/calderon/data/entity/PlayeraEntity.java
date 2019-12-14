package com.cruz.calderon.data.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


/**
 * @author jesusc
 * 11 dic. 2019
 *
 */
@Data
@Entity
@Table(name = "playera")
public class PlayeraEntity {

	@Id
	@Column(name = "id_playera")
	private Long idPlayera;
	private String nombre;
	private String descripcion;
	private int stock;
	@Column(columnDefinition = "decimal")
	private BigDecimal precio;
	private int prioridad;
	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_talla", updatable = false, insertable = false)
	private CatTallaEntity talla;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_color", updatable = false, insertable = false)
	private CatColorEntity color;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_categoria", updatable = false, insertable = false)
	private CatCategoriaEntity categoria;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tipo", updatable = false, insertable = false)
	private CatTipoEntity tipo;
	
}
