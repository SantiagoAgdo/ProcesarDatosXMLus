package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class Saldos {
    @XmlAttribute(name = "saldoTotalEnMora")
    private double saldoTotalEnMora;

    @XmlAttribute(name = "saldoM30")
    private double saldoM30;

    @XmlAttribute(name = "saldoM60")
    private double saldoM60;

    @XmlAttribute(name = "saldoM90")
    private double saldoM90;

    @XmlAttribute(name = "cuotaMensual")
    private double cuotaMensual;

    @XmlAttribute(name = "saldoCreditoMasAlto")
    private double saldoCreditoMasAlto;

    @XmlAttribute(name = "saldoTotal")
    private double saldoTotal;

    @XmlElement(name = "SectorSaldos")
    private List<Sector> sectores;

    @XmlElement(name = "Mes")
    private List<MesSaldos> meses;

    // Getters y setters
}

