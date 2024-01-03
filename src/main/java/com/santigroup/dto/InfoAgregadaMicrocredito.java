package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoAgregadaMicrocredito {

    @XmlElement(name = "Resumen")
    private ResumenInfoAgregadaMicrocredito resumen;

    @XmlElement(name = "AnalisisVectores")
    private AnalisisVectores analisisVectores;

    @XmlElement(name = "EvolucionDeuda")
    private EvolucionDeudaInfoAgregadaMicrocredito evolucionDeuda;

}

