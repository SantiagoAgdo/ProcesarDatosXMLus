package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class TipoCuentaHistorico {

    @XmlAttribute(name = "tipo")
    private String tipo;

    @XmlElement(name = "Trimestre")
    private List<TrimestreTipoCuentaHistorico> trimestres;

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<TrimestreTipoCuentaHistorico> getTrimestres() {
        return trimestres;
    }

    public void setTrimestres(List<TrimestreTipoCuentaHistorico> trimestres) {
        this.trimestres = trimestres;
    }
}

