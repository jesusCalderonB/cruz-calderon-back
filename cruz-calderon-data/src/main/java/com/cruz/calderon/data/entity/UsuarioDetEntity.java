package com.cruz.calderon.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "usuario_det")
public class UsuarioDetEntity {

	@Id
	@Column(name = "id_usuario_det")
	private Long id_usuario_det;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario", updatable = false, insertable = false)
	private UsuarioEntity usuario;
	@Column(name = "numero_telefono")
	private String numeroTelefono;
	private String calle;
	@Column(name = "numInt")
	private String numeroInt;
	@Column(name = "numero_ext")
	private String numExt;
	@Column(name = "codigo_postal")
	private String codPostal;
	private String estado;
	
}
