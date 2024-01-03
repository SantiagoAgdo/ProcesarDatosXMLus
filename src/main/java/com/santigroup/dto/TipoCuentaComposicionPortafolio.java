package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoCuentaComposicionPortafolio {

    @XmlAttribute(name = "tipo")
    private String tipo;

    @XmlAttribute(name = "calidadDeudor")
    private String calidadDeudor;

    @XmlAttribute(name = "porcentaje")
    private double porcentaje;

    @XmlAttribute(name = "cantidad")
    private int cantidad;

    @XmlElement(name = "Estado")
    private List<EstadoTipoCuenta> estados;

}

