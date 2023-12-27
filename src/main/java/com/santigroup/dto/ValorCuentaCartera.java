package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ValorCuentaCartera {
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

    @XmlAttribute(name = "periodicidad")
    private int periodicidad;

    @XmlAttribute(name = "totalCuotas")
    private int totalCuotas;

    @XmlAttribute(name = "valorInicial")
    private double valorInicial;

    @XmlAttribute(name = "cuotasCanceladas")
    private int cuotasCanceladas;

    @XmlAttribute(name = "fechaLimitePago", required = false)
    private String fechaLimitePago;

    // Getters y setters...
}

