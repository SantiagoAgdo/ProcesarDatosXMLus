package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class IdentificacionDemografica {

    @XmlAttribute(name = "idRegistro")
    private int idRegistro;

    @XmlAttribute(name = "lugarExpedicion")
    private String lugarExpedicion;

    @XmlAttribute(name = "nitReporta")
    private String nitReporta;

    @XmlAttribute(name = "razonSocial")
    private String razonSocial;

    // Getters y setters...
}

