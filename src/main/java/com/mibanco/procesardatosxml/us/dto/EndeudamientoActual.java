package com.mibanco.procesardatosxml.us.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class EndeudamientoActual {

    @XmlElement(name = "SectorEndeudamientoActual")
    private List<Sector> sectores;

    // Constructor, getters y setters

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Sector {

        @XmlAttribute(name = "codSector")
        private String codSector;

        @XmlElement(name = "TipoCuentaSector")
        private List<TipoCuenta> tipoCuentas;

        // Constructor, getters y setters

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "TipoCuenta", namespace = "http://www.mibanco.com/TipoCuenta")
        public static class TipoCuenta {

            @XmlAttribute(name = "tipoCuenta")
            private String tipoCuenta;

            @XmlElement(name = "Usuario")
            private List<Usuario> usuarios;

            // Constructor, getters y setters

            @XmlAccessorType(XmlAccessType.FIELD)
            public static class Usuario {

                @XmlAttribute(name = "tipoUsuario")
                private String tipoUsuario;

                @XmlElement(name = "CuentaUsuario")
                private List<Cuenta> cuentas;

                // Constructor, getters y setters

                @XmlAccessorType(XmlAccessType.FIELD)
                public static class Cuenta {

                    @XmlAttribute(name = "estadoActual")
                    private String estadoActual;

                    @XmlAttribute(name = "calificacion")
                    private String calificacion;
                    @XmlAttribute(name = "valorInicial")
                    private String valorInicial;
                    @XmlAttribute(name = "saldoActual")
                    private String saldoActual;
                    @XmlAttribute(name = "saldoMora")
                    private String saldoMora;
                    @XmlAttribute(name = "cuotaMes")
                    private String cuotaMes;
                    @XmlAttribute(name = "comportamientoNegativo")
                    private String comportamientoNegativo;
                    @XmlAttribute(name = "totalDeudaCarteras")
                    private String totalDeudaCarteras;

                }
            }
        }
    }
}

