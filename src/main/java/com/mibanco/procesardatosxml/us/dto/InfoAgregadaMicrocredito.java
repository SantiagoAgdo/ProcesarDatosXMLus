package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoAgregadaMicrocredito {

    @XmlElement(name = "Resumen")
    private ResumenInfoAgregadaMicrocredito resumen;

    @XmlElement(name = "AnalisisVectores")
    private AnalisisVectores analisisVectores;

    @XmlElement(name = "EvolucionDeuda")
    private EvolucionDeudaInfoAgregadaMicrocredito evolucionDeuda;

}

