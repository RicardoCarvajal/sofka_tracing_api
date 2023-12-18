package com.sofka.service.app.infraestructure.drivenAdapter.entity;

public enum TipoMovimiento {

	ENTRADA, SALIDA;

	public String value() {
		String tipo = "";

		switch (this) {
		case ENTRADA:
			tipo = "ENTRADA";
			break;
		case SALIDA:
			tipo = "SALIDA";
			break;
		}

		return tipo;
	}

}
