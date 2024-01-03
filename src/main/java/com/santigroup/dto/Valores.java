package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Valores", namespace = "http://www.mibanco.com/Valores")
public class Valores {
    @XmlElement(name = "Valor")
    private List<Valor> valores;

    // Getters y setters...
}

