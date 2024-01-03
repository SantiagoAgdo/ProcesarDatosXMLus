package com.santigroup;

import com.santigroup.dto.Informes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws Exception {
        parse();
        return "Hello from RESTEasy Reactive";
    }

    public void parse() throws Exception {
        String xmlContent = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Informes>\n" +
                "    <Informe fechaConsulta=\"2023-10-02T15:48:06\" respuesta=\"13\" codSeguridad=\"8BIBzCF\"\n" +
                "        tipoIdDigitado=\"1\" identificacionDigitada=\"14862817\" apellidoDigitado=\"ACOSTA\">\n" +
                "        <NaturalNacional nombres=\"YIMY ANGELINO\" primerApellido=\"ACOSTA\" segundoApellido=\"RUIZ\"\n" +
                "            nombreCompleto=\"ACOSTA RUIZ YIMY ANGELINO\" validada=\"true\" rut=\"false\" genero=\"4\">\n" +
                "            <Identificacion estado=\"00\" fechaExpedicion=\"1999-03-25\" ciudad=\"FUSAGASUGA\"\n" +
                "                departamento=\"CUNDINAMAR\" genero=\"4\" numero=\"00014862817\" />\n" +
                "            <Edad min=\"36\" max=\"45\" />\n" +
                "            <InfoDemografica />\n" +
                "        </NaturalNacional>\n" +
                "        <Score tipo=\"10\" puntaje=\"0.0\" clasificacion=\"N\" fecha=\"2023-10-02\" poblacion=\"0\">\n" +
                "            <Razon codigo=\"466\" />\n" +
                "        </Score>\n" +
                "        <CuentaAhorro bloqueada=\"false\" entidad=\"BBVA           COLOMBIA\" numero=\"611612212\"\n" +
                "            fechaApertura=\"2015-07-28\" situacionTitular=\"0\" oficina=\"AVENIDA EL DORADO\"\n" +
                "            ciudad=\"BOGOTA\" codigoDaneCiudad=\"00000000\" tipoIdentificacion=\"2\"\n" +
                "            identificacion=\"00860003020\" sector=\"1\">\n" +
                "            <Caracteristicas clase=\"0\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-07-31\" calificacion=\"-\" />\n" +
                "            </Valores>\n" +
                "            <Estado codigo=\"09\" fecha=\"2022-07-31\" />\n" +
                "            <Llave>10001486281751005001611612212000000000</Llave>\n" +
                "        </CuentaAhorro>\n" +
                "        <CuentaAhorro bloqueada=\"false\" entidad=\"CUENTA         NEQUI\" numero=\"174111116\"\n" +
                "            fechaApertura=\"2021-06-23\" calificacion=\"1\" situacionTitular=\"0\" oficina=\"Banca Digital\"\n" +
                "            ciudad=\"Medellin\" codigoDaneCiudad=\"00000000\" tipoIdentificacion=\"2\"\n" +
                "            identificacion=\"00890903938\" sector=\"1\">\n" +
                "            <Caracteristicas clase=\"4\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-06-30\" calificacion=\"1\" />\n" +
                "            </Valores>\n" +
                "            <Estado codigo=\"01\" fecha=\"2022-06-30\" />\n" +
                "            <Llave>10001486281751002101174111116000000000</Llave>\n" +
                "        </CuentaAhorro>\n" +
                "        <CuentaCartera bloqueada=\"false\" entidad=\"Bancompartir   Finamerica\" numero=\"122785662\"\n" +
                "            fechaApertura=\"2022-01-20\" fechaVencimiento=\"2022-07-21\"\n" +
                "            comportamiento=\"NNNNN------------------------------------------ \" formaPago=\"0\"\n" +
                "            probabilidadIncumplimiento=\"0.0\" calificacion=\"1\" situacionTitular=\"0\"\n" +
                "            oficina=\"FUSAGASUGA\" ciudad=\"FUSAGASUGA\" codigoDaneCiudad=\"00000000\"\n" +
                "            codSuscriptor=\"050127\" tipoIdentificacion=\"2\" identificacion=\"00860025971\" sector=\"1\"\n" +
                "            calificacionHD=\"true\">\n" +
                "            <Caracteristicas tipoCuenta=\"CAB\" tipoObligacion=\"5\" tipoContrato=\"1\"\n" +
                "                ejecucionContrato=\"5\" mesesPermanencia=\"0\" calidadDeudor=\"00\" garantia=\"Q\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-06-30\" calificacion=\"-\" saldoActual=\"219000.0\"\n" +
                "                    saldoMora=\"0.0\" disponible=\"-1\" cuota=\"239000.0\" cuotasMora=\"0\" diasMora=\"0\"\n" +
                "                    periodicidad=\"1\" totalCuotas=\"6\" valorInicial=\"1200000.0\" cuotasCanceladas=\"5\" />\n" +
                "            </Valores>\n" +
                "            <Estados>\n" +
                "                <EstadoCuenta codigo=\"01\" fecha=\"2022-06-30\" />\n" +
                "                <EstadoOrigen codigo=\"0\" fecha=\"2022-01-20\" />\n" +
                "                <EstadoPago codigo=\"01\" meses=\"48\" fecha=\"2022-06-30\" />\n" +
                "            </Estados>\n" +
                "            <Llave>10001486281705012705122785662000000000</Llave>\n" +
                "        </CuentaCartera>\n" +
                "        <EndeudamientoGlobal calificacion=\"A\" fuente=\"S\" saldoPendiente=\"1923000\" tipoCredito=\"MIC\"\n" +
                "            moneda=\"ML\" numeroCreditos=\"1\" independiente=\"\" fechaReporte=\"2022-06-30\">\n" +
                "            <Entidad nombre=\"BCSC S.A.                    0\" nit=\"00860007335\" sector=\"1\" />\n" +
                "            <Garantia tipo=\"9\" valor=\"914583.0\" fecha=\"2022-02-24\" />\n" +
                "            <Llave>1000148628172022063001000030LCAA</Llave>\n" +
                "        </EndeudamientoGlobal>\n" +
                "        <EndeudamientoGlobal calificacion=\"A\" fuente=\"S\" saldoPendiente=\"222000\" tipoCredito=\"MIC\"\n" +
                "            moneda=\"ML\" numeroCreditos=\"1\" independiente=\"\" fechaReporte=\"2022-06-30\">\n" +
                "            <Entidad nombre=\"BANCO COMPARTIR S.A          0\" nit=\"00860025971\" sector=\"1\" />\n" +
                "            <Garantia tipo=\"7\" valor=\"109458.0\" fecha=\"2022-06-30\" />\n" +
                "            <Llave>1000148628172022063001000062LCAA</Llave>\n" +
                "        </EndeudamientoGlobal>\n" +
                "        <Consulta fecha=\"2023-08-22\" tipoCuenta=\"CCF\" entidad=\"FINAMERICA     C.F.C.\"\n" +
                "            oficina=\"------------------\" ciudad=\"------------\" razon=\"00\" cantidad=\"01\"\n" +
                "            nitSuscriptor=\"00860025971\" sector=\"1\">\n" +
                "            <Llave>10001486281716</Llave>\n" +
                "        </Consulta>\n" +
                "        <Consulta fecha=\"2023-07-19\" tipoCuenta=\"CCF\" entidad=\"FINAMERICA     C.F.C.\"\n" +
                "            oficina=\"------------------\" ciudad=\"------------\" razon=\"00\" cantidad=\"01\"\n" +
                "            nitSuscriptor=\"00860025971\" sector=\"1\">\n" +
                "            <Llave>10001486281715</Llave>\n" +
                "        </Consulta>\n" +
                "        <Consulta fecha=\"2022-02-21\" tipoCuenta=\"CAB\" entidad=\"BC CAJA SOCIAL BCSC DEMO\"\n" +
                "            oficina=\"------------------\" ciudad=\"------------\" razon=\"00\" cantidad=\"01\"\n" +
                "            nitSuscriptor=\"00860007335\" sector=\"1\">\n" +
                "            <Llave>10001486281704</Llave>\n" +
                "        </Consulta>\n" +
                "        <RespuestaPersonalizada>\n" +
                "            <Linea consecutivo=\"01\">[ACIERTA_MASTER][466][TIPO_CONSULTA][1]</Linea>\n" +
                "            <Linea consecutivo=\"02\">[MONTO_MINIMO][200000][TIPO_ID][1]</Linea>\n" +
                "            <Linea consecutivo=\"03\">[ENDEUDAMIENTO][0][SALDO_MORA_SF][0]</Linea>\n" +
                "            <Linea consecutivo=\"04\">[PORCENTAJE_END_DESEMBOLSOS_3M][0][CREDITOS_ULTIMO_TRIM][0]</Linea>\n" +
                "        </RespuestaPersonalizada>\n" +
                "        <InfoAgregada>\n" +
                "            <Resumen>\n" +
                "                <Principales creditoVigentes=\"4\" creditosCerrados=\"0\" creditosActualesNegativos=\"1\"\n" +
                "                    histNegUlt12Meses=\"1\" cuentasAbiertasAHOCCB=\"1\" cuentasCerradasAHOCCB=\"1\"\n" +
                "                    consultadasUlt6meses=\"4\" desacuerdosALaFecha=\"0\" antiguedadDesde=\"2015-07-28\"\n" +
                "                    reclamosVigentes=\"0\" />\n" +
                "                <Saldos saldoTotalEnMora=\"177.0\" saldoM30=\"0.0\" saldoM60=\"0.0\" saldoM90=\"177.0\"\n" +
                "                    cuotaMensual=\"524.0\" saldoCreditoMasAlto=\"1829.0\" saldoTotal=\"3479.0\">\n" +
                "                    <Sector sector=\"1\" saldo=\"3085.0\" participacion=\"88.67490658235126\" />\n" +
                "                    <Sector sector=\"2\" saldo=\"0.0\" participacion=\"0.0\" />\n" +
                "                    <Sector sector=\"3\" saldo=\"0.0\" participacion=\"0.0\" />\n" +
                "                    <Sector sector=\"4\" saldo=\"394.0\" participacion=\"11.32509341764875\" />\n" +
                "                    <Mes fecha=\"2022-10-31\" saldoTotalMora=\"0\" saldoTotal=\"1037000\" />\n" +
                "                    <Mes fecha=\"2022-09-30\" saldoTotalMora=\"0\" saldoTotal=\"1120000\" />\n" +
                "                    <Mes fecha=\"2022-08-30\" saldoTotalMora=\"0\" saldoTotal=\"1200000\" />\n" +
                "                    <Mes fecha=\"2022-07-30\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2022-06-30\" saldoTotalMora=\"177000\" saldoTotal=\"2442000\" />\n" +
                "                    <Mes fecha=\"2022-05-30\" saldoTotalMora=\"177000\" saldoTotal=\"2652000\" />\n" +
                "                    <Mes fecha=\"2022-04-30\" saldoTotalMora=\"0\" saldoTotal=\"2548000\" />\n" +
                "                    <Mes fecha=\"2022-03-30\" saldoTotalMora=\"0\" saldoTotal=\"2964000\" />\n" +
                "                    <Mes fecha=\"2022-02-28\" saldoTotalMora=\"0\" saldoTotal=\"3087000\" />\n" +
                "                    <Mes fecha=\"2022-01-28\" saldoTotalMora=\"0\" saldoTotal=\"1200000\" />\n" +
                "                    <Mes fecha=\"2021-12-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-11-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-10-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-09-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-08-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-07-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-06-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-05-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-04-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-03-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-02-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2021-01-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2020-12-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                    <Mes fecha=\"2020-11-28\" saldoTotalMora=\"0\" saldoTotal=\"0\" />\n" +
                "                </Saldos>\n" +
                "                <Comportamiento>\n" +
                "                    <Mes fecha=\"2022-10-31\" comportamiento=\"N\" cantidad=\"0\" />\n" +
                "                    <Mes fecha=\"2022-09-30\" comportamiento=\"N\" cantidad=\"0\" />\n" +
                "                    <Mes fecha=\"2022-08-30\" comportamiento=\"N\" cantidad=\"0\" />\n" +
                "                </Comportamiento>\n" +
                "            </Resumen>\n" +
                "            <Totales>\n" +
                "                <TipoCuenta codigoTipo=\"CAB\" tipo=\"Cartera bancaria\" calidadDeudor=\"Principal\"\n" +
                "                    cupo=\"2400.0\" saldo=\"1256.0\" saldoMora=\"0.0\" cuota=\"376.0\" />\n" +
                "                <TipoCuenta codigoTipo=\"MCR\" tipo=\"Cartera Microcrédito\" calidadDeudor=\"Principal\"\n" +
                "                    cupo=\"2000.0\" saldo=\"1829.0\" saldoMora=\"0.0\" cuota=\"148.0\" />\n" +
                "                <TipoCuenta codigoTipo=\"CTC\" tipo=\"Cartera telefonía celular\"\n" +
                "                    calidadDeudor=\"Principal\" cupo=\"0.0\" saldo=\"394.0\" saldoMora=\"177.0\" cuota=\"0.0\" />\n" +
                "                <Total calidadDeudor=\"Principal\" participacion=\"100.0\" cupo=\"4400.0\" saldo=\"3479.0\"\n" +
                "                    saldoMora=\"177.0\" cuota=\"524.0\" />\n" +
                "                <Total calidadDeudor=\"Codeudor\" participacion=\"0.0\" cupo=\"0.0\" saldo=\"0.0\"\n" +
                "                    saldoMora=\"0.0\" cuota=\"0.0\" />\n" +
                "            </Totales>\n" +
                "            <ComposicionPortafolio>\n" +
                "                <TipoCuenta tipo=\"AHO\" calidadDeudor=\"Principal\" porcentaje=\"1.0\" cantidad=\"1\">\n" +
                "                    <Estado codigo=\"Activa\" cantidad=\"1\" />\n" +
                "                </TipoCuenta>\n" +
                "                <TipoCuenta tipo=\"CAB\" calidadDeudor=\"Principal\" porcentaje=\"1.0\" cantidad=\"2\">\n" +
                "                    <Estado codigo=\"Al dia\" cantidad=\"2\" />\n" +
                "                </TipoCuenta>\n" +
                "            </ComposicionPortafolio>\n" +
                "            <Cheques />\n" +
                "            <EvolucionDeuda>\n" +
                "                <Trimestre fecha=\"2022-09-01\" cuota=\"139000\" cupoTotal=\"1200000\" saldo=\"1120000\"\n" +
                "                    porcentajeUso=\"0.9333333333333333\" score=\"0.0\" calificacion=\"C\"\n" +
                "                    aperturaCuentas=\"0\" cierreCuentas=\"0\" totalAbiertas=\"5\" totalCerradas=\"1\"\n" +
                "                    moraMaxima=\"M 0\" mesesMoraMaxima=\"0\" />\n" +
                "                <Trimestre fecha=\"2022-06-01\" cuota=\"386000\" cupoTotal=\"3200000\" saldo=\"2547333\"\n" +
                "                    porcentajeUso=\"0.7960416666666668\" score=\"0.0\" calificacion=\"C\"\n" +
                "                    aperturaCuentas=\"1\" cierreCuentas=\"1\" totalAbiertas=\"5\" totalCerradas=\"1\"\n" +
                "                    moraMaxima=\"M 90\" mesesMoraMaxima=\"3\" />\n" +
                "                <AnalisisPromedio cuota=\"-63.9\" cupoTotal=\"-62.5\" saldo=\"-63.4\"\n" +
                "                    porcentajeUso=\"-2.2135416666666714\" score=\"0.0\" calificacion=\"0\"\n" +
                "                    aperturaCuentas=\"0.0\" cierreCuentas=\"0.0\" totalAbiertas=\"0.0\"\n" +
                "                    totalCerradas=\"0.0\" moraMaxima=\"0\" />\n" +
                "            </EvolucionDeuda>\n" +
                "            <HistoricoSaldos>\n" +
                "                <TipoCuenta tipo=\"CAB\">\n" +
                "                    <Trimestre fecha=\"2022-09-01\" totalCuentas=\"2\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"1120000\" />\n" +
                "                    <Trimestre fecha=\"2022-06-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"427000\" />\n" +
                "                    <Trimestre fecha=\"2022-03-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"924500\" />\n" +
                "                    <Trimestre fecha=\"2021-12-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-09-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-06-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-03-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2020-12-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                </TipoCuenta>\n" +
                "                <TipoCuenta tipo=\"CTC\">\n" +
                "                    <Trimestre fecha=\"2022-09-01\" totalCuentas=\"1\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2022-06-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"262666\" />\n" +
                "                    <Trimestre fecha=\"2022-03-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"133000\" />\n" +
                "                    <Trimestre fecha=\"2021-12-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-09-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-06-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-03-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2020-12-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                </TipoCuenta>\n" +
                "                <TipoCuenta tipo=\"MCR\">\n" +
                "                    <Trimestre fecha=\"2022-09-01\" totalCuentas=\"1\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2022-06-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"1857666\" />\n" +
                "                    <Trimestre fecha=\"2022-03-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"2000000\" />\n" +
                "                    <Trimestre fecha=\"2021-12-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-09-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-06-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2021-03-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                    <Trimestre fecha=\"2020-12-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0\" />\n" +
                "                </TipoCuenta>\n" +
                "                <Totales fecha=\"2022-09-01\" totalCuentas=\"4\" cuentasConsideradas=\"1\"\n" +
                "                    saldo=\"1120000.0\" />\n" +
                "                <Totales fecha=\"2022-06-01\" totalCuentas=\"3\" cuentasConsideradas=\"3\"\n" +
                "                    saldo=\"2547333.3\" />\n" +
                "                <Totales fecha=\"2021-12-01\" totalCuentas=\"0\" cuentasConsideradas=\"0\" saldo=\"0.0\" />\n" +
                "            </HistoricoSaldos>\n" +
                "            <ResumenEndeudamiento>\n" +
                "                <Trimestre fecha=\"2022-09-01\">\n" +
                "                    <Sector sector=\"Financiero\" codigoSector=\"1\" garantiaAdmisible=\"0\"\n" +
                "                        garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"2\" valor=\"2642.0\" />\n" +
                "                    </Sector>\n" +
                "                    <Sector sector=\"Cooperativo\" codigoSector=\"2\" garantiaAdmisible=\"0\"\n" +
                "                        garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                    </Sector>\n" +
                "                    <Sector sector=\"Real\" codigoSector=\"3\" garantiaAdmisible=\"0\" garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                    </Sector>\n" +
                "                    <Sector sector=\"Telcos\" codigoSector=\"4\" garantiaAdmisible=\"0\" garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                    </Sector>\n" +
                "                </Trimestre>\n" +
                "                <Trimestre fecha=\"2022-03-01\">\n" +
                "                    <Sector sector=\"Financiero\" codigoSector=\"1\" garantiaAdmisible=\"0\"\n" +
                "                        garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"2\" valor=\"2918.0\" />\n" +
                "                    </Sector>\n" +
                "                    <Sector sector=\"Cooperativo\" codigoSector=\"2\" garantiaAdmisible=\"0\"\n" +
                "                        garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                    </Sector>\n" +
                "                    <Sector sector=\"Real\" codigoSector=\"3\" garantiaAdmisible=\"0\" garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                    </Sector>\n" +
                "                    <Sector sector=\"Telcos\" codigoSector=\"4\" garantiaAdmisible=\"0\" garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                    </Sector>\n" +
                "                </Trimestre>\n" +
                "            </ResumenEndeudamiento>\n" +
                "        </InfoAgregada>\n" +
                "        <InfoAgregadaMicrocredito>\n" +
                "            <Resumen>\n" +
                "                <PerfilGeneral>\n" +
                "                    <CreditosVigentes sectorFinanciero=\"3\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"1\" totalComoPrincipal=\"4\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <CreditosCerrados sectorFinanciero=\"0\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"0\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <CreditosReestructurados sectorFinanciero=\"0\" sectorCooperativo=\"0\"\n" +
                "                        sectorReal=\"0\" sectorTelcos=\"0\" totalComoPrincipal=\"0\"\n" +
                "                        totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <CreditosRefinanciados sectorFinanciero=\"0\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"0\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <ConsultaUlt6Meses sectorFinanciero=\"15\" sectorCooperativo=\"0\" sectorReal=\"1\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"0\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <Desacuerdos sectorFinanciero=\"0\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"0\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <AntiguedadDesde sectorFinanciero=\"2015-07-28\" sectorTelcos=\"2022-02-14\" />\n" +
                "                </PerfilGeneral>\n" +
                "                <VectorSaldosYMoras poseeSectorCooperativo=\"false\" poseeSectorFinanciero=\"true\"\n" +
                "                    poseeSectorReal=\"false\" poseeSectorTelcos=\"true\">\n" +
                "                    <SaldosYMoras fecha=\"2022-10-31\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"1037.0\" morasMaxSectorFinanciero=\"N\" morasMaximas=\"N\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-09-30\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"1120.0\" morasMaxSectorFinanciero=\"N\" morasMaximas=\"N\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-08-30\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"1200.0\" morasMaxSectorFinanciero=\"N\" morasMaximas=\"N\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-07-30\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"0.0\" numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-06-30\" totalCuentasMora=\"1\"\n" +
                "                        saldoDeudaTotalMora=\"177.0\" saldoDeudaTotal=\"2442.0\"\n" +
                "                        morasMaxSectorFinanciero=\"N\" morasMaxSectorTelcos=\"4\" morasMaximas=\"4\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"1\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-05-30\" totalCuentasMora=\"1\"\n" +
                "                        saldoDeudaTotalMora=\"177.0\" saldoDeudaTotal=\"2652.0\"\n" +
                "                        morasMaxSectorFinanciero=\"N\" morasMaxSectorTelcos=\"3\" morasMaximas=\"3\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"1\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-04-30\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"2548.0\" morasMaxSectorFinanciero=\"N\"\n" +
                "                        morasMaxSectorTelcos=\"N\" morasMaximas=\"N\" numCreditos30=\"0\"\n" +
                "                        numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-03-30\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"2964.0\" morasMaxSectorFinanciero=\"N\"\n" +
                "                        morasMaxSectorTelcos=\"-\" morasMaximas=\"N\" numCreditos30=\"0\"\n" +
                "                        numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-02-28\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"3087.0\" morasMaxSectorFinanciero=\"N\"\n" +
                "                        morasMaxSectorTelcos=\"N\" morasMaximas=\"N\" numCreditos30=\"0\"\n" +
                "                        numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-01-28\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"1200.0\" morasMaxSectorFinanciero=\"N\" morasMaximas=\"N\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2021-12-28\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"0.0\" numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2021-11-28\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"0.0\" numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                </VectorSaldosYMoras>\n" +
                "                <EndeudamientoActual>\n" +
                "                    <Sector codSector=\"1\">\n" +
                "                        <TipoCuenta tipoCuenta=\"CAB\">\n" +
                "                            <Usuario tipoUsuario=\"Principal\">\n" +
                "                                <Cuenta estadoActual=\"Al día\" calificacion=\"A\" valorInicial=\"1200.0\"\n" +
                "                                    saldoActual=\"219.0\" saldoMora=\"0.0\" cuotaMes=\"239.0\"\n" +
                "                                    comportamientoNegativo=\"false\" totalDeudaCarteras=\"3479.0\" />\n" +
                "                                <Cuenta estadoActual=\"Al día\" calificacion=\"A\" valorInicial=\"1200.0\"\n" +
                "                                    saldoActual=\"1037.0\" saldoMora=\"0.0\" cuotaMes=\"137.0\"\n" +
                "                                    comportamientoNegativo=\"false\" totalDeudaCarteras=\"3479.0\" />\n" +
                "                            </Usuario>\n" +
                "                        </TipoCuenta>\n" +
                "                        <TipoCuenta tipoCuenta=\"MCR\">\n" +
                "                            <Usuario tipoUsuario=\"Principal\">\n" +
                "                                <Cuenta estadoActual=\"Al día\" calificacion=\"A\" valorInicial=\"2000.0\"\n" +
                "                                    saldoActual=\"1829.0\" saldoMora=\"0.0\" cuotaMes=\"148.0\"\n" +
                "                                    comportamientoNegativo=\"false\" totalDeudaCarteras=\"3479.0\" />\n" +
                "                            </Usuario>\n" +
                "                        </TipoCuenta>\n" +
                "                    </Sector>\n" +
                "                    <Sector codSector=\"4\">\n" +
                "                        <TipoCuenta tipoCuenta=\"CTC\">\n" +
                "                            <Usuario tipoUsuario=\"Principal\">\n" +
                "                                <Cuenta estadoActual=\"Esta en mora 120\" calificacion=\"C\"\n" +
                "                                    valorInicial=\"0.0\" saldoActual=\"394.0\" saldoMora=\"177.0\"\n" +
                "                                    cuotaMes=\"0.0\" comportamientoNegativo=\"true\"\n" +
                "                                    totalDeudaCarteras=\"3479.0\" />\n" +
                "                            </Usuario>\n" +
                "                        </TipoCuenta>\n" +
                "                    </Sector>\n" +
                "                </EndeudamientoActual>\n" +
                "                <ImagenTendenciaEndeudamiento>\n" +
                "                    <Series serie=\"Cartera bancaria\">\n" +
                "                        <Valores>\n" +
                "                            <Valor valor=\"86.4\" fecha=\"2022-10-31\" />\n" +
                "                            <Valor valor=\"93.3\" fecha=\"2022-09-30\" />\n" +
                "                            <Valor valor=\"100.0\" fecha=\"2022-08-31\" />\n" +
                "                            <Valor valor=\"18.2\" fecha=\"2022-06-30\" />\n" +
                "                            <Valor valor=\"35.8\" fecha=\"2022-05-31\" />\n" +
                "                            <Valor valor=\"52.8\" fecha=\"2022-04-30\" />\n" +
                "                            <Valor valor=\"69.2\" fecha=\"2022-03-31\" />\n" +
                "                            <Valor valor=\"84.8\" fecha=\"2022-02-28\" />\n" +
                "                            <Valor valor=\"100.0\" fecha=\"2022-01-31\" />\n" +
                "                        </Valores>\n" +
                "                    </Series>\n" +
                "                    <Series serie=\"Cartera Microcrédito\">\n" +
                "                        <Valores>\n" +
                "                            <Valor valor=\"91.5\" fecha=\"2022-06-30\" />\n" +
                "                            <Valor valor=\"91.5\" fecha=\"2022-05-31\" />\n" +
                "                            <Valor valor=\"95.8\" fecha=\"2022-04-30\" />\n" +
                "                            <Valor valor=\"100.0\" fecha=\"2022-03-31\" />\n" +
                "                            <Valor valor=\"100.0\" fecha=\"2022-02-28\" />\n" +
                "                        </Valores>\n" +
                "                    </Series>\n" +
                "                </ImagenTendenciaEndeudamiento>\n" +
                "            </Resumen>\n" +
                "            <AnalisisVectores>\n" +
                "                <Sector nombreSector=\"Sector Financiero\">\n" +
                "                    <Cuenta entidad=\"Bancompartir   Finamerica\" numeroCuenta=\"122785662\"\n" +
                "                        tipoCuenta=\"CAB\" estado=\"Al día\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-10-31\" />\n" +
                "                        <CaracterFecha fecha=\"2022-09-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-08-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-07-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <Cuenta entidad=\"Bancompartir   Finamerica\" numeroCuenta=\"152788624\"\n" +
                "                        tipoCuenta=\"CAB\" estado=\"Al día\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-10-31\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-09-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-08-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-07-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <Cuenta entidad=\"BCSC\" numeroCuenta=\"996111119\" tipoCuenta=\"MCR\" estado=\"Al día\"\n" +
                "                        contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-10-31\" />\n" +
                "                        <CaracterFecha fecha=\"2022-09-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-08-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-07-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <MorasMaximas>\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-07-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-08-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-09-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-10-31\" saldoDeudaTotalMora=\"N\" />\n" +
                "                    </MorasMaximas>\n" +
                "                </Sector>\n" +
                "                <Sector nombreSector=\"Sector Telcos\">\n" +
                "                    <Cuenta entidad=\"COMCEL S.A.\" numeroCuenta=\"388957130\" tipoCuenta=\"CTC\"\n" +
                "                        estado=\"Esta en mora 120\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-10-31\" />\n" +
                "                        <CaracterFecha fecha=\"2022-09-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-08-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-07-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"4\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"3\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <MorasMaximas>\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"3\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"4\" />\n" +
                "                        <CaracterFecha fecha=\"2022-07-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-08-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-09-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-10-31\" />\n" +
                "                    </MorasMaximas>\n" +
                "                </Sector>\n" +
                "            </AnalisisVectores>\n" +
                "            <EvolucionDeuda>\n" +
                "                <Trimestres>\n" +
                "                    <Trimestre>2022/12</Trimestre>\n" +
                "                    <Trimestre>2022/09</Trimestre>\n" +
                "                    <Trimestre>2022/06</Trimestre>\n" +
                "                    <Trimestre>2022/03</Trimestre>\n" +
                "                    <Trimestre>2021/12</Trimestre>\n" +
                "                    <Trimestre>2021/09</Trimestre>\n" +
                "                </Trimestres>\n" +
                "                <EvolucionDeudaSector codSector=\"1\" nombreSector=\"Financiero\">\n" +
                "                    <EvolucionDeudaTipoCuenta tipoCuenta=\"CAB\">\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/12\" tipoCuenta=\"CAB\" num=\"2\"\n" +
                "                            cupoInicial=\"2400.0\" saldo=\"1256.0\" saldoMora=\"0.0\" cuota=\"376.0\"\n" +
                "                            porcentajeDeuda=\"52.3\" codMenorCalificacion=\"1\"\n" +
                "                            textoMenorCalificacion=\"A\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/09\" tipoCuenta=\"CAB\" num=\"2\"\n" +
                "                            cupoInicial=\"1200.0\" saldo=\"1120.0\" saldoMora=\"0.0\" cuota=\"139.0\"\n" +
                "                            porcentajeDeuda=\"93.3\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/06\" tipoCuenta=\"CAB\" num=\"1\"\n" +
                "                            cupoInicial=\"1200.0\" saldo=\"219.0\" saldoMora=\"0.0\" cuota=\"239.0\"\n" +
                "                            porcentajeDeuda=\"18.2\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/03\" tipoCuenta=\"CAB\" num=\"1\"\n" +
                "                            cupoInicial=\"1200.0\" saldo=\"831.0\" saldoMora=\"0.0\" cuota=\"237.0\"\n" +
                "                            porcentajeDeuda=\"69.2\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/12\" tipoCuenta=\"CAB\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/09\" tipoCuenta=\"CAB\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                    </EvolucionDeudaTipoCuenta>\n" +
                "                    <EvolucionDeudaTipoCuenta tipoCuenta=\"MCR\">\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/12\" tipoCuenta=\"MCR\" num=\"1\"\n" +
                "                            cupoInicial=\"2000.0\" saldo=\"1829.0\" saldoMora=\"0.0\" cuota=\"148.0\"\n" +
                "                            porcentajeDeuda=\"91.5\" codMenorCalificacion=\"1\"\n" +
                "                            textoMenorCalificacion=\"A\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/09\" tipoCuenta=\"MCR\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/06\" tipoCuenta=\"MCR\" num=\"1\"\n" +
                "                            cupoInicial=\"2000.0\" saldo=\"1829.0\" saldoMora=\"0.0\" cuota=\"148.0\"\n" +
                "                            porcentajeDeuda=\"91.5\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/03\" tipoCuenta=\"MCR\" num=\"1\"\n" +
                "                            cupoInicial=\"2000.0\" saldo=\"2000.0\" saldoMora=\"0.0\" cuota=\"148.0\"\n" +
                "                            porcentajeDeuda=\"100.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/12\" tipoCuenta=\"MCR\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/09\" tipoCuenta=\"MCR\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                    </EvolucionDeudaTipoCuenta>\n" +
                "                </EvolucionDeudaSector>\n" +
                "                <EvolucionDeudaSector codSector=\"4\" nombreSector=\"Telcos\">\n" +
                "                    <EvolucionDeudaTipoCuenta tipoCuenta=\"CTC\">\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/12\" tipoCuenta=\"CTC\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"394.0\" saldoMora=\"177.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"3\"\n" +
                "                            textoMenorCalificacion=\"C\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/09\" tipoCuenta=\"CTC\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/06\" tipoCuenta=\"CTC\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"394.0\" saldoMora=\"177.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/03\" tipoCuenta=\"CTC\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"133.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/12\" tipoCuenta=\"CTC\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/09\" tipoCuenta=\"CTC\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                    </EvolucionDeudaTipoCuenta>\n" +
                "                </EvolucionDeudaSector>\n" +
                "            </EvolucionDeuda>\n" +
                "        </InfoAgregadaMicrocredito>\n" +
                "    </Informe>\n" +
                "</Informes>";

        JAXBContext context = JAXBContext.newInstance(Informes.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        StringReader reader = new StringReader(xmlContent);
        Informes informes = (Informes) unmarshaller.unmarshal(reader);

        // Uso de los objetos Java...
        int x =1 ;
        System.out.println(informes);
    }
}
