package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class CuentaAhorro {
    @XmlAttribute(name = "bloqueada")
    private boolean bloqueada;

    @XmlAttribute(name = "entidad")
    private String entidad;

    @XmlAttribute(name = "numero")
    private String numero;

    @XmlAttribute(name = "fechaApertura")
    private String fechaApertura;

    @XmlAttribute(name = "situacionTitular")
    private int situacionTitular;

    @XmlAttribute(name = "oficina")
    private String oficina;

    @XmlAttribute(name = "ciudad")
    private String ciudad;

    @XmlAttribute(name = "codigoDaneCiudad")
    private String codigoDaneCiudad;

    @XmlAttribute(name = "tipoIdentificacion")
    private int tipoIdentificacion;

    @XmlAttribute(name = "identificacion")
    private String identificacion;

    @XmlAttribute(name = "sectorCuentaAhorro")
    private int sector;

    // Atributos adicionales según el XML (como calificacion, etc.)

    @XmlElement(name = "Caracteristicas")
    private Caracteristicas caracteristicas;

    @XmlElement(name = "ValoresCuentaAhorro")
    private Valores valores;

    @XmlElement(name = "Estado")
    private Estado estado;

    @XmlElement(name = "Llave")
    private String llave;

    // Getters y setters...
}


