package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class OperacionesInternacionales {

    @XmlAttribute(name = "idRegistro")
    private int idRegistro;

    @XmlAttribute(name = "operaInt")
    private boolean operaInt;

    @XmlAttribute(name = "fecha")
    private String fecha;

    @XmlAttribute(name = "nitReporta")
    private String nitReporta;

    @XmlAttribute(name = "razonSocial")
    private String razonSocial;

    // Getters y setters...
}

