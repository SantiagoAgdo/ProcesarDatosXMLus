package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ComposicionPortafolio {

    @XmlElement(name = "TipoCuentaComposicionPortafolio")
    private List<TipoCuentaComposicionPortafolio> tipoCuentas;

    // Constructor, Getters y Setters
    public ComposicionPortafolio() {}

    public List<TipoCuentaComposicionPortafolio> getTipoCuentas() {
        return tipoCuentas;
    }

    public void setTipoCuentas(List<TipoCuentaComposicionPortafolio> tipoCuentas) {
        this.tipoCuentas = tipoCuentas;
    }
}
