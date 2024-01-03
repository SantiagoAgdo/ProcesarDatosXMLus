package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Informe {
    @XmlAttribute(name = "fechaConsulta")
    private String fechaConsulta;

    @XmlAttribute(name = "respuesta")
    private int respuesta;

    @XmlAttribute(name = "codSeguridad")
    private String codSeguridad;

    @XmlAttribute(name = "tipoIdDigitado")
    private int tipoIdDigitado;

    @XmlAttribute(name = "identificacionDigitada")
    private String identificacionDigitada;

    @XmlAttribute(name = "apellidoDigitado")
    private String apellidoDigitado;

    @XmlElement(name = "NaturalNacional")
    private NaturalNacional naturalNacional;

    @XmlElement(name = "Score")
    private Score score;

    @XmlElement(name = "CuentaAhorro")
    private List<CuentaAhorro> cuentasAhorro;

    @XmlElement(name = "TarjetaCredito")
    private List<TarjetaCredito> tarjetasCredito;

    @XmlElement(name = "CuentaCartera")
    private List<CuentaCartera> cuentasCartera;

    @XmlElement(name = "EndeudamientoGlobal")
    private List<EndeudamientoGlobal> endeudamientosGlobales;

    @XmlElement(name = "Consulta")
    private List<Consulta> consultas;

    @XmlElement(name = "RespuestaPersonalizada")
    private RespuestaPersonalizada respuestaPersonalizada;

    @XmlElement(name = "InfoAgregada")
    private List<InfoAgregada> infoAgregada;

    @XmlElement(name = "InfoAgregadaMicrocredito")
    private List<InfoAgregadaMicrocredito> infoAgregadaMicrocredito;

}

