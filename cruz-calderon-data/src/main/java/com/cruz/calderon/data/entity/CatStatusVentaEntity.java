package com.cruz.calderon.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author jesusc
 * 11 dic. 2019
 *
 */
@Getter
@Setter
@Entity
@Table(name = "cat_status_venta")
@ToString
public class CatStatusVentaEntity {

	@Id
	@JoinColumn(name = "id_status_venta")
	private Long idStatusVenta;
	@Column(name = "key")
	private String key;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	
}
