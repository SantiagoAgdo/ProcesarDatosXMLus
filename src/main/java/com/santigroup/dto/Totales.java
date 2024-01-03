package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Totales", namespace = "http://www.mibanco.com/Totales")
public class Totales {
    @XmlElement(name = "TipoCuenta")
    private List<TipoCuenta> tipoCuentas;

    // Getters y setters
    public List<TipoCuenta> getTipoCuentas() {
        return tipoCuentas;
    }

    public void setTipoCuentas(List<TipoCuenta> tipoCuentas) {
        this.tipoCuentas = tipoCuentas;
    }
}

