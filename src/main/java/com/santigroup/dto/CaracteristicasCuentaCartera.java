package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class CaracteristicasCuentaCartera {
    @XmlAttribute(name = "tipoCuenta")
    private String tipoCuenta;

    @XmlAttribute(name = "tipoObligacion")
    private String tipoObligacion;

    @XmlAttribute(name = "tipoContrato")
    private String tipoContrato;

    @XmlAttribute(name = "ejecucionContrato")
    private String ejecucionContrato;

    @XmlAttribute(name = "mesesPermanencia")
    private int mesesPermanencia;

    @XmlAttribute(name = "calidadDeudor")
    private String calidadDeudor;

    @XmlAttribute(name = "garantia")
    private String garantia;

    // Getters y setters...
}
