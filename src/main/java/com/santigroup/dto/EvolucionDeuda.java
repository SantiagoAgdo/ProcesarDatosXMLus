package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class EvolucionDeuda {
    @XmlElement(name = "Trimestre")
    private List<Trimestre> trimestres;

    @XmlElement(name = "AnalisisPromedio")
    private AnalisisPromedio analisisPromedio;

    // Getters y setters
}
