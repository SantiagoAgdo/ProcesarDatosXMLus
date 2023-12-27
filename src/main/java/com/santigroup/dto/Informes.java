package com.santigroup.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Informes")
public class Informes {
    private List<Informe> informes;

    @XmlElement(name = "Informe")
    public List<Informe> getInformes() {
        return informes;
    }

    public void setInformes(List<Informe> informes) {
        this.informes = informes;
    }
}
