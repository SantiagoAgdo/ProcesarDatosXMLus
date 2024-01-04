package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class CaracteristicasTarjeta {
    @XmlAttribute(name = "franquicia")
    private int franquicia;

    @XmlAttribute(name = "clase")
    private int clase;

    @XmlAttribute(name = "marca")
    private String marca;

    @XmlAttribute(name = "amparada")
    private boolean amparada;

    @XmlAttribute(name = "codigoAmparada")
    private String codigoAmparada;

    @XmlAttribute(name = "garantia")
    private String garantia;

    // Getters y setters...
}

