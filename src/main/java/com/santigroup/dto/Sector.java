package com.santigroup.dto;

import javax.xml.bind.annotation.*;

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

