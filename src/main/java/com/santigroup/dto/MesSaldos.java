package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class MesSaldos {
    @XmlAttribute(name = "fecha")
    private String fecha;
    @XmlAttribute(name = "saldoTotalMora")
    private Double saldoTotalMora;

    @XmlAttribute(name = "saldoTotal")
    private Double saldoTotal;
}

