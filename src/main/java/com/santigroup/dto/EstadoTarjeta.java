package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class EstadoTarjeta {

    @XmlElement(name = "EstadoPlastico")
    private EstadoPlastico estadoPlastico;

    @XmlElement(name = "EstadoCuenta")
    private EstadoCuenta estadoCuenta;

    @XmlElement(name = "EstadoOrigen")
    private EstadoOrigen estadoOrigen;

    @XmlElement(name = "EstadoPago")
    private EstadoPago estadoPago;

    // Getters y setters...
}

