package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class TipoCuenta {
    @XmlAttribute(name = "codigoTipo")
    private String codigoTipo;

    @XmlAttribute(name = "tipo")
    private String tipo;

    @XmlAttribute(name = "calidadDeudor")
    private String calidadDeudor;

    @XmlAttribute(name = "cupo")
    private double cupo;

    @XmlAttribute(name = "saldo")
    private double saldo;

    @XmlAttribute(name = "saldoMora")
    private double saldoMora;

    @XmlAttribute(name = "cuota")
    private double cuota;

    // Getters y setters
    // ...
}
