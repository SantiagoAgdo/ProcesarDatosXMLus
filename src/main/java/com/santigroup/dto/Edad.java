package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Edad {

    @XmlAttribute(name = "min")
    private int min;

    @XmlAttribute(name = "max")
    private int max;

    // Getters y setters...
}

