package com.es.diecines.error;

public class BaseDeDatosException extends RuntimeException {

    private static final String DESCRIPCION = "Error en la Base de Datos";

    public BaseDeDatosException(String detalles) {
        super(DESCRIPCION+". "+detalles);
    }
}
