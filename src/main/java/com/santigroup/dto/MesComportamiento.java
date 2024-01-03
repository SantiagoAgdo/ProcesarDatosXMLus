package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class MesComportamiento {
    @XmlAttribute(name = "fecha")
    private String fecha;
    // Atributos para uso en `Comportamiento`
    @XmlAttribute(name = "comportamiento")
    private String comportamiento;

    @XmlAttribute(name = "cantidad")
    private Integer cantidad;

    // Getters y setters
}

