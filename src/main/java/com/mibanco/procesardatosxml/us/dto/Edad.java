package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Edad {

    @XmlAttribute(name = "min")
    private int min;

    @XmlAttribute(name = "max")
    private int max;

    // Getters y setters...
}

