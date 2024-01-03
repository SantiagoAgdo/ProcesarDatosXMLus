package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PerfilGeneral {

    @XmlElement(name = "CreditosVigentes")
    private Creditos creditosVigentes;

    @XmlElement(name = "CreditosCerrados")
    private Creditos creditosCerrados;

    @XmlElement(name = "CreditosReestructurados")
    private Creditos creditosReestructurados;

    @XmlElement(name = "CreditosRefinanciados")
    private Creditos creditosRefinanciados;

    @XmlElement(name = "ConsultaUlt6Meses")
    private Creditos consultaUlt6Meses;

    @XmlElement(name = "Desacuerdos")
    private Creditos desacuerdos;

    @XmlElement(name = "AntiguedadDesde")
    private AntiguedadDesde antiguedadDesde;

    // Getters y setters
}
