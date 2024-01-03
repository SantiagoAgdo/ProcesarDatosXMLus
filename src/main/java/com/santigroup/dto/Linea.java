package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Linea {

    @XmlAttribute(name = "consecutivo")
    private String consecutivo;

    @XmlValue
    private String valor;

    // Getters y setters
}

