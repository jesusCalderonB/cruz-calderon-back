package com.cruz.calderon.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @author jesusc
 * 10 dic. 2019
 *
 */
@Getter
@Setter
@Entity
@Table(name = "cat_tipo")
@ToString
public class CatTipoEntity {
	
	@Id
	@Column(name = "id_tipo")
	private Long idTipo;
	@Column(name = "key")
	private String key;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	
}
