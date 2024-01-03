package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaPersonalizada {
    @XmlElement(name = "Linea")
    private List<LineaRespuestaPersonalizada> lineas;

    // Getters y setters
}
