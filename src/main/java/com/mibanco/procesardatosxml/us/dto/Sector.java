package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sector", namespace = "http://www.mibanco.com/Sector")
public class Sector {
    @XmlAttribute(name = "sector")
    private int sector;

    @XmlAttribute(name = "saldo")
    private double saldo;

    @XmlAttribute(name = "participacion")
    private double participacion;

    // Getters y setters
}

