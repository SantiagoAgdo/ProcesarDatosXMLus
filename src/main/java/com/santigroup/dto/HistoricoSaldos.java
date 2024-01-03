package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class HistoricoSaldos {

    @XmlElement(name = "TipoCuentaHistoricoSaldos")
    private List<TipoCuentaHistorico> tipoCuentas;

    @XmlElement(name = "Totales")
    private List<TotalesHistoricoSaldos> totales;

    // Getters y setters
    public List<TipoCuentaHistorico> getTipoCuentas() {
        return tipoCuentas;
    }

    public void setTipoCuentas(List<TipoCuentaHistorico> tipoCuentas) {
        this.tipoCuentas = tipoCuentas;
    }
}
