package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResumenEndeudamiento {
    @XmlElement(name = "Trimestre")
    private List<TrimestreResumenEndeudamiento> trimestres;

    // Getters y setters
}
