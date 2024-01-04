package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Valores", namespace = "http://www.mibanco.com/Valores")
public class Valores {
    @XmlElement(name = "Valor")
    private List<Valor> valores;

    // Getters y setters...
}

