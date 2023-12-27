package com.santigroup.dto;

import javax.xml.bind.annotation.*;

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

