package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ValoresCuentaCartera {
    @XmlElement(name = "Valor")
    private List<ValorCuentaCartera> valores;

    // Getters y setters...
}

