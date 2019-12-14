package com.cruz.calderon.data.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "venta")
public class VentaEntity {

	@Id
	@Column(name = "id_venta")
	private Long id_venta;
	@Column(name = "fecha_venta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaVenta;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tipo_pago", updatable = false, insertable = false)
	private CatTipoPagoEntity tipoPago;
	@Column(name = "cantidad_total", columnDefinition = "decimal")
	private BigDecimal total;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_status_venta", updatable = false, insertable = false)
	private List<ResumenVentaEntity> listArticulosComprados;
	
}
