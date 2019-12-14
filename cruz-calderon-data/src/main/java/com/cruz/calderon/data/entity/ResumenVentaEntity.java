package com.cruz.calderon.data.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author jesusc
 * 11 dic. 2019
 *
 */
@Data
@Entity
@Table(name = "resumen_venta")
public class ResumenVentaEntity {

	@Id
	@Column(name = "id_venta_playera")
	private Long idVentaPlayera;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_playera", updatable = false, insertable = false)
	private PlayeraEntity playera;
	private int cantidad;
	@Column(columnDefinition = "decimal")
	private BigDecimal total;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_venta", updatable = false, insertable = false)
	private VentaEntity venta;
	
}
