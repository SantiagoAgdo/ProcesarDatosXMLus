package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Valores {
    @XmlElement(name = "Valor")
    private List<Valor> valores;

    // Getters y setters...
}

