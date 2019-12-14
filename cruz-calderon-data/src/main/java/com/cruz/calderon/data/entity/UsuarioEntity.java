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
@Table(name = "usuario")
public class UsuarioEntity {

	@Id
	@Column(name = "id_usuario")
	private Long idUsuario;
	private String nombre;
	private String apellido;
	private String alias;
	@Column(name = "correo_electronico")
	private String mail;
	private String contrasena;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_rol", updatable = false, insertable = false)
	private CatRolEntity rol;
	//
	
}
