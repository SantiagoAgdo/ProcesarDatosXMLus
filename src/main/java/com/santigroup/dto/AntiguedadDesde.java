package com.santigroup.dto;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
class AntiguedadDesde {
    @XmlAttribute(name = "sectorFinanciero")
    private String sectorFinanciero;

    @XmlAttribute(name = "sectorTelcos")
    private String sectorTelcos;

    // Getters y setters
}
