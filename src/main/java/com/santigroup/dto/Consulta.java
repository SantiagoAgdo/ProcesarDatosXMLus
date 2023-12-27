package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Consulta {

    @XmlAttribute(name = "fecha")
    private String fecha;

    @XmlAttribute(name = "tipoCuenta")
    private String tipoCuenta;

    @XmlAttribute(name = "entidad")
    private String entidad;

    @XmlAttribute(name = "oficina")
    private String oficina;

    @XmlAttribute(name = "ciudad")
    private String ciudad;

    @XmlAttribute(name = "razon")
    private String razon;

    @XmlAttribute(name = "cantidad")
    private String cantidad;

    @XmlAttribute(name = "nitSuscriptor")
    private String nitSuscriptor;

    @XmlAttribute(name = "sector")
    private String sector;

    @XmlElement(name = "Llave")
    private String llave;

    // Getters y setters para cada campo...
}

