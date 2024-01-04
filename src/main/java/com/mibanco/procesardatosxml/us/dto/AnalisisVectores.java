package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class AnalisisVectores {

    @XmlElement(name = "SectorAnalisisVectores")
    private List<SectorAnalisisVectores> sectores;

    // Constructor, getters y setters

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "SectorAnalisisVectores", namespace = "http://www.mibanco.com/SectorAnalisisVectores")
    public static class SectorAnalisisVectores {

        @XmlAttribute(name = "nombreSector")
        private String nombreSector;

        @XmlElement(name = "Cuenta")
        private List<Cuenta> cuentas;

        @XmlElement(name = "MorasMaximas")
        private MorasMaximas morasMaximas;

        // Constructor, getters y setters

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "CuentaSectorAnalisisVectores", namespace = "http://www.mibanco.com/CuentaSectorAnalisisVectores")
        public static class Cuenta {

            @XmlAttribute(name = "entidad")
            private String entidad;

            @XmlAttribute(name = "numeroCuenta")
            private String numeroCuenta;

            @XmlAttribute(name = "tipoCuenta")
            private String tipoCuenta;

            @XmlAttribute(name = "estado")
            private String estado;

            @XmlAttribute(name = "contieneDatos")
            private boolean contieneDatos;

            @XmlElement(name = "CaracterFecha")
            private List<CaracterFecha> caracterFechas;

            // Constructor, getters y setters
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class CaracterFecha {

            @XmlAttribute(name = "fecha")
            private String fecha;

            @XmlAttribute(name = "saldoDeudaTotalMora")
            private String saldoDeudaTotalMora;

            // Constructor, getters y setters
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class MorasMaximas {

            @XmlElement(name = "CaracterFecha")
            private List<CaracterFecha> caracterFechas;

            // Constructor, getters y setters
        }
    }
}

