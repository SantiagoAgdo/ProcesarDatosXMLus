package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrimestreResumenEndeudamiento", namespace = "http://www.mibanco.com/TrimestreResumenEndeudamiento")
public class TrimestreResumenEndeudamiento {
    @XmlAttribute(name = "fecha")
    private String fecha;
    @XmlElement(name = "Sector")
    private List<SectorTrimestreResumenEndeudamiento> sectores;

    // Getters y setters
}