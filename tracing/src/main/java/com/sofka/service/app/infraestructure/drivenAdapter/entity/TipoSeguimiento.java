package com.sofka.service.app.infraestructure.drivenAdapter.entity;

public enum TipoSeguimiento {

	ERROR, SUCCESS;

	public String value() {
		String tipo = "";

		switch (this) {
		case ERROR:
			tipo = "ERROR";
			break;
		case SUCCESS:
			tipo = "SUCCESS";
			break;
		}

		return tipo;
	}

}
