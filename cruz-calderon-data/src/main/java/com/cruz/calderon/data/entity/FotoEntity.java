package com.cruz.calderon.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author jesusc
 * 11 dic. 2019
 *
 */
@Data
@Entity
@Table(name = "foto")
public class FotoEntity {

	@Id
	@Column(name = "id_foto")
	private Long idFoto;
	private String nombre;
	private String foto;
	private int prioridad;
	private Double tamanio;
	private String extension;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "playera", updatable = false, insertable = false)
	private PlayeraEntity status;
	
}
