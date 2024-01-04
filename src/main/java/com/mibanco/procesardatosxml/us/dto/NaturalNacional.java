package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class NaturalNacional {

    @XmlAttribute(name = "nombres")
    private String nombres;

    @XmlAttribute(name = "primerApellido")
    private String primerApellido;

    @XmlAttribute(name = "segundoApellido")
    private String segundoApellido;

    @XmlAttribute(name = "nombreCompleto")
    private String nombreCompleto;

    @XmlAttribute(name = "validada")
    private boolean validada;

    @XmlAttribute(name = "rut")
    private boolean rut;

    @XmlAttribute(name = "genero")
    private int genero;

    @XmlElement(name = "Identificacion")
    private Identificacion identificacion;

    @XmlElement(name = "Edad")
    private Edad edad;

    @XmlElement(name = "InfoDemografica")
    private InfoDemografica infoDemografica;

    // Getters y setters...

    // Clases anidadas para Identificacion, Edad, InfoDemografica...
}


