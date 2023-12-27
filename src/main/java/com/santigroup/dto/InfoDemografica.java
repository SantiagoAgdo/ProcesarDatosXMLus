package com.santigroup.dto;

import javax.xml.bind.annotation.*;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoDemografica {

    @XmlElement(name = "OperacionesInternacionales")
    private OperacionesInternacionales operacionesInternacionales;

    @XmlElement(name = "Identificacion")
    private IdentificacionDemografica identificacionDemografica;

    // Getters y setters...

    // Clases anidadas para OperacionesInternacionales e IdentificacionDemografica...
}


