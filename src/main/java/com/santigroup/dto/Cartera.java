package com.santigroup.dto;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cartera", namespace = "http://www.mibanco.com/Cartera")
public class Cartera {
    @XmlAttribute(name = "tipo")
    private String tipo;
    @XmlAttribute(name = "numeroCuentas")
    private int numeroCuentas;
    @XmlAttribute(name = "valor")
    private double valor;

    // Getters y setters
}