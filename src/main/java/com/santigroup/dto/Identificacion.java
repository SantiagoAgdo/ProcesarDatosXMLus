package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Identificacion {

    @XmlAttribute(name = "estado")
    private String estado;

    @XmlAttribute(name = "fechaExpedicion")
    private String fechaExpedicion;

    @XmlAttribute(name = "ciudad")
    private String ciudad;

    @XmlAttribute(name = "departamento")
    private String departamento;

    @XmlAttribute(name = "genero")
    private int genero;

    @XmlAttribute(name = "numero")
    private String numero;

    // Getters y setters...
}

