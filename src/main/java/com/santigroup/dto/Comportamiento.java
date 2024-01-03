package com.santigroup.dto;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Comportamiento {
    @XmlElement(name = "Mes")
    private List<MesComportamiento> meses;

    // Getters y setters
}

