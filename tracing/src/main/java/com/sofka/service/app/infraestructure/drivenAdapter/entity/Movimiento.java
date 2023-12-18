package com.sofka.service.app.infraestructure.drivenAdapter.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("movimientos")
public class Movimiento {

	@Id
	private String id;

	private String idProducto;

	private String idVenta;

	private String idLote;

	private Integer cantidad;

	private BigDecimal precio;

	private TipoMovimiento tipo;

	private TipoVenta tipoVenta;

	private TipoSeguimiento tipoSeguimiento;

	public Movimiento(String id, String idProducto, String idVenta, String idLote, Integer cantidad, BigDecimal precio,
			TipoMovimiento tipo, TipoVenta tipoVenta, TipoSeguimiento tipoSeguimiento) {
		this.id = id;
		this.idProducto = idProducto;
		this.idVenta = idVenta;
		this.idLote = idLote;
		this.cantidad = cantidad;
		this.precio = precio;
		this.tipo = tipo;
		this.tipoVenta = tipoVenta;
		this.tipoSeguimiento = tipoSeguimiento;
	}

	public Movimiento() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public TipoMovimiento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimiento tipo) {
		this.tipo = tipo;
	}

	public TipoVenta getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(TipoVenta tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public TipoSeguimiento getTipoSeguimiento() {
		return tipoSeguimiento;
	}

	public void setTipoSeguimiento(TipoSeguimiento tipoSeguimiento) {
		this.tipoSeguimiento = tipoSeguimiento;
	}

}
