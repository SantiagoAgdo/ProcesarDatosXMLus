package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Score {

    @XmlAttribute(name = "tipo")
    private String tipo;

    @XmlAttribute(name = "puntaje")
    private double puntaje;

    @XmlAttribute(name = "clasificacion")
    private String clasificacion;

    @XmlAttribute(name = "fecha")
    private String fecha;

    @XmlAttribute(name = "poblacion")
    private int poblacion;

    @XmlElement(name = "Razon")
    private Razon razon;

    // Getters y setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Razon getRazon() {
        return razon;
    }

    public void setRazon(Razon razon) {
        this.razon = razon;
    }
}

