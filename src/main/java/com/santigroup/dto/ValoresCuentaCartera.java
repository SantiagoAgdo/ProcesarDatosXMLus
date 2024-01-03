package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValoresCuentaCartera", namespace = "http://www.mibanco.com/ValoresCuentaCartera")
public class ValoresCuentaCartera {
    @XmlElement(name = "Valor")
    private List<ValorCuentaCartera> valores;

    // Getters y setters...
}

