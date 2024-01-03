package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Resumen {
    @XmlElement(name = "Principales")
    private Principales principales;

    @XmlElement(name = "Saldos")
    private Saldos saldos;

    @XmlElement(name = "Comportamiento")
    private Comportamiento comportamiento;

    // Getters y setters
}
