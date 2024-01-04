package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
class Creditos {
    @XmlAttribute(name = "sectorFinanciero")
    private int sectorFinanciero;

    @XmlAttribute(name = "sectorCooperativo")
    private int sectorCooperativo;

    @XmlAttribute(name = "sectorReal")
    private int sectorReal;

    @XmlAttribute(name = "sectorTelcos")
    private int sectorTelcos;

    @XmlAttribute(name = "totalComoPrincipal")
    private int totalComoPrincipal;

    @XmlAttribute(name = "totalComoCodeudorYOtros")
    private int totalComoCodeudorYOtros;

    // Getters y setters
}
