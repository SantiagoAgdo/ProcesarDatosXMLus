package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoAgregada {
    @XmlElement(name = "Resumen")
    private Resumen resumen;

    @XmlElement(name = "Totales")
    private Totales totales;

    @XmlElement(name = "ComposicionPortafolio")
    private ComposicionPortafolio composicionPortafolio;

    @XmlElement(name = "Cheques")
    private Cheques cheques;

    @XmlElement(name = "EvolucionDeuda")
    private EvolucionDeuda evolucionDeuda;

    @XmlElement(name = "HistoricoSaldos")
    private HistoricoSaldos historicoSaldos;

    @XmlElement(name = "ResumenEndeudamiento")
    private ResumenEndeudamiento resumenEndeudamiento;

    // Getters y setters
}

