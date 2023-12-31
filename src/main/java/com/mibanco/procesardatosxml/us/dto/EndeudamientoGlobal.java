package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class EndeudamientoGlobal {

    @XmlAttribute(name = "calificacion")
    private String calificacion;

    @XmlAttribute(name = "fuente")
    private String fuente;

    @XmlAttribute(name = "saldoPendiente")
    private long saldoPendiente;

    @XmlAttribute(name = "tipoCredito")
    private String tipoCredito;

    @XmlAttribute(name = "moneda")
    private String moneda;

    @XmlAttribute(name = "numeroCreditos")
    private int numeroCreditos;

    @XmlAttribute(name = "independiente")
    private String independiente;

    @XmlAttribute(name = "fechaReporte")
    private String fechaReporte;

    @XmlElement(name = "Entidad")
    private Entidad entidad;

    @XmlElement(name = "Garantia")
    private Garantia garantia;

    @XmlElement(name = "Llave")
    private String llave;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "Entidad", namespace = "http://www.mibanco.com/Entidad")
    public static class Entidad {
        @XmlAttribute(name = "nombre")
        private String nombre;

        @XmlAttribute(name = "nit")
        private String nit;

        @XmlAttribute(name = "sector")
        private int sector;

        // Getters y setters...
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "Garantia", namespace = "http://www.mibanco.com/Garantia")
    public static class Garantia {
        @XmlAttribute(name = "tipo")
        private String tipo;

        @XmlAttribute(name = "valor")
        private double valor;

        // Getters y setters...
    }
}

