package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResumenEndeudamiento {
    @XmlElement(name = "Trimestre")
    private List<TrimestreResumenEndeudamiento> trimestres;

    // Getters y setters
}
