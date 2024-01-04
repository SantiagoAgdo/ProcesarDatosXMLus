package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
