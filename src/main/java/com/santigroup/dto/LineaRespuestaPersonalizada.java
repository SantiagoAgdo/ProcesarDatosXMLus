package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class LineaRespuestaPersonalizada {
    @XmlAttribute(name = "consecutivo")
    private String consecutivo;
    @XmlValue
    private String valor;


}

