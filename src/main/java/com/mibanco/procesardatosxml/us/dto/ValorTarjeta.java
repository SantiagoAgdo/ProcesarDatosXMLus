package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class ValorTarjeta {

    @XmlAttribute(name = "moneda")
    private int moneda;

    @XmlAttribute(name = "fecha")
    private String fecha;

    @XmlAttribute(name = "calificacion")
    private String calificacion;

    @XmlAttribute(name = "saldoActual")
    private double saldoActual;

    @XmlAttribute(name = "saldoMora")
    private double saldoMora;

    @XmlAttribute(name = "disponible")
    private double disponible;

    @XmlAttribute(name = "cuota")
    private double cuota;

    @XmlAttribute(name = "cuotasMora")
    private int cuotasMora;

    @XmlAttribute(name = "diasMora")
    private int diasMora;

    @XmlAttribute(name = "fechaPagoCuota")
    private String fechaPagoCuota;

    @XmlAttribute(name = "fechaLimitePago")
    private String fechaLimitePago;

    @XmlAttribute(name = "cupoTotal")
    private double cupoTotal;

    // Constructor vacío
    public ValorTarjeta() {}

    // Getters y setters

    // ...
}

