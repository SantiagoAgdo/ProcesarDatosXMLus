package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
class AntiguedadDesde {
    @XmlAttribute(name = "sectorFinanciero")
    private String sectorFinanciero;

    @XmlAttribute(name = "sectorTelcos")
    private String sectorTelcos;

    // Getters y setters
}
