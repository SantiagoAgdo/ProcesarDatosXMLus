package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class EstadoTarjeta {

    @XmlElement(name = "EstadoPlastico")
    private EstadoPlastico estadoPlastico;

    @XmlElement(name = "EstadoCuenta")
    private EstadoCuenta estadoCuenta;

    @XmlElement(name = "EstadoOrigen")
    private EstadoOrigen estadoOrigen;

    @XmlElement(name = "EstadoPago")
    private EstadoPago estadoPago;

    // Getters y setters...
}

