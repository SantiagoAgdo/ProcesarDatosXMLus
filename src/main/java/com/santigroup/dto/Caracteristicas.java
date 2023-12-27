package com.santigroup.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Caracteristicas {
    @XmlAttribute(name = "clase")
    private String clase;

    // Atributos adicionales basados en el XML
    @XmlAttribute(name = "franquicia")
    private String franquicia;

    @XmlAttribute(name = "marca")
    private String marca;

    @XmlAttribute(name = "amparada")
    private boolean amparada;

    @XmlAttribute(name = "codigoAmparada")
    private String codigoAmparada;

    @XmlAttribute(name = "garantia")
    private String garantia;

    // Otros atributos que puedan aparecer en otras instancias del XML

    // Getters y setters

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAmparada() {
        return amparada;
    }

    public void setAmparada(boolean amparada) {
        this.amparada = amparada;
    }

    public String getCodigoAmparada() {
        return codigoAmparada;
    }

    public void setCodigoAmparada(String codigoAmparada) {
        this.codigoAmparada = codigoAmparada;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    // Métodos para otros atributos...
}


