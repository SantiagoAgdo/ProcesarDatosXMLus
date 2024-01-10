package com.mibanco.procesardatosxml.us;

import com.mibanco.procesardatosxml.us.dto.Informes;
import com.mibanco.procesardatosxml.us.service.impl.ProcesarDatosXMLImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.nio.charset.StandardCharsets;

@Path("/hello")
public class ExampleResource {

    //CLASE DE PRUEBAS TEMPORAL

    @Inject
    ProcesarDatosXMLImpl service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Informes hello() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Informes>\n" +
                "    <Informe fechaConsulta=\"2023-09-19T11:09:53\" respuesta=\"13\" codSeguridad=\"92W4290\"\n" +
                "        tipoIdDigitado=\"1\" identificacionDigitada=\"19028171\" apellidoDigitado=\"ARIAS\">\n" +
                "        <NaturalNacional nombres=\"EDISON PAUL\" primerApellido=\"ARIAS\" segundoApellido=\"ARIAS\"\n" +
                "            nombreCompleto=\"ARIAS ARIAS EDISON PAUL\" validada=\"true\" rut=\"false\" genero=\"4\">\n" +
                "            <Identificacion estado=\"00\" fechaExpedicion=\"1998-11-04\" ciudad=\"LA VIRGINIA\"\n" +
                "                departamento=\"RISARALDA\" genero=\"4\" numero=\"00019028171\" />\n" +
                "            <Edad min=\"36\" max=\"45\" />\n" +
                "            <InfoDemografica>\n" +
                "                <OperacionesInternacionales idRegistro=\"0\" operaInt=\"false\" fecha=\"2014-01-31\"\n" +
                "                    nitReporta=\"00811007713\"\n" +
                "                    razonSocial=\"SISTECREDITO S.A.S                                                                                  \" />\n" +
                "                <Identificacion idRegistro=\"0\" lugarExpedicion=\"00000000\" nitReporta=\"00811007713\"\n" +
                "                    razonSocial=\"SISTECREDITO S.A.S                                                                                  \" />\n" +
                "            </InfoDemografica>\n" +
                "        </NaturalNacional>\n" +
                "        <Score tipo=\"10\" puntaje=\"0.0\" clasificacion=\"Z\" fecha=\"2023-09-19\" poblacion=\"0\">\n" +
                "            <Razon codigo=\"745\" />\n" +
                "        </Score>\n" +
                "        <CuentaAhorro bloqueada=\"false\" entidad=\"BANCOLOMBIA\" numero=\"172711111\"\n" +
                "            fechaApertura=\"2005-11-30\" situacionTitular=\"0\" oficina=\"PLAZA DE BOLIVA\"\n" +
                "            ciudad=\"PEREIR\" codigoDaneCiudad=\"00000000\" tipoIdentificacion=\"2\"\n" +
                "            identificacion=\"00890903938\" sector=\"1\">\n" +
                "            <Caracteristicas clase=\"0\" />\n" +
                "            <Valores />\n" +
                "            <Estado codigo=\"05\" fecha=\"2010-06-30\" />\n" +
                "            <Llave>10001902817151023201172711111000000000</Llave>\n" +
                "        </CuentaAhorro>\n" +
                "        <TarjetaCredito bloqueada=\"false\" entidad=\"BANCOLOMBIA    MASTERCARD\" numero=\"530621075\"\n" +
                "            fechaApertura=\"2018-08-29\" fechaVencimiento=\"2024-07-30\"\n" +
                "            comportamiento=\"NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN-- \" formaPago=\"0\"\n" +
                "            probabilidadIncumplimiento=\"0.0\" calificacion=\"1\" situacionTitular=\"0\"\n" +
                "            oficina=\"30 DE AGOSTO\" ciudad=\"PEREIRA\" codigoDaneCiudad=\"00000000\"\n" +
                "            tipoIdentificacion=\"2\" identificacion=\"00890903938\" sector=\"1\" calificacionHD=\"true\">\n" +
                "            <Caracteristicas franquicia=\"3\" clase=\"4\" marca=\"000\" amparada=\"false\"\n" +
                "                codigoAmparada=\"00\" garantia=\"2\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-06-30\" calificacion=\"-\" saldoActual=\"409000.0\"\n" +
                "                    saldoMora=\"0.0\" disponible=\"390000.0\" cuota=\"59000.0\" cuotasMora=\"0\"\n" +
                "                    diasMora=\"0\" fechaPagoCuota=\"2022-06-30\" fechaLimitePago=\"2022-07-18\"\n" +
                "                    cupoTotal=\"800000.0\" />\n" +
                "            </Valores>\n" +
                "            <Estados>\n" +
                "                <EstadoPlastico codigo=\"1\" fecha=\"2023-09-19\" />\n" +
                "                <EstadoCuenta codigo=\"01\" fecha=\"2022-06-30\" />\n" +
                "                <EstadoOrigen codigo=\"0\" fecha=\"2018-08-29\" />\n" +
                "                <EstadoPago codigo=\"01\" meses=\"48\" fecha=\"2022-06-30\" />\n" +
                "            </Estados>\n" +
                "            <Llave>10001902817102023302530621075000000000</Llave>\n" +
                "        </TarjetaCredito>\n" +
                "        <CuentaCartera bloqueada=\"false\" entidad=\"Bancompartir   Finamerica\" numero=\"182802661\"\n" +
                "            fechaApertura=\"2021-04-23\" fechaVencimiento=\"2023-05-11\"\n" +
                "            comportamiento=\"NNNNNNNNNNNNNN--------------------------------- \" formaPago=\"0\"\n" +
                "            probabilidadIncumplimiento=\"0.0\" calificacion=\"1\" situacionTitular=\"0\" oficina=\"CUBA\"\n" +
                "            ciudad=\"PEREIRA\" codigoDaneCiudad=\"00000000\" codSuscriptor=\"050127\"\n" +
                "            tipoIdentificacion=\"2\" identificacion=\"00860025971\" sector=\"1\" calificacionHD=\"true\">\n" +
                "            <Caracteristicas tipoCuenta=\"CAB\" tipoObligacion=\"5\" tipoContrato=\"1\"\n" +
                "                ejecucionContrato=\"5\" mesesPermanencia=\"0\" calidadDeudor=\"00\" garantia=\"Q\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-06-30\" calificacion=\"-\" saldoActual=\"1726000.0\"\n" +
                "                    saldoMora=\"0.0\" disponible=\"-1\" cuota=\"210000.0\" cuotasMora=\"0\" diasMora=\"0\"\n" +
                "                    fechaPagoCuota=\"2021-09-28\" periodicidad=\"1\" totalCuotas=\"24\"\n" +
                "                    valorInicial=\"3030000.0\" cuotasCanceladas=\"13\" />\n" +
                "            </Valores>\n" +
                "            <Estados>\n" +
                "                <EstadoCuenta codigo=\"01\" fecha=\"2022-06-30\" />\n" +
                "                <EstadoOrigen codigo=\"0\" fecha=\"2021-04-23\" />\n" +
                "                <EstadoPago codigo=\"01\" meses=\"48\" fecha=\"2022-06-30\" />\n" +
                "            </Estados>\n" +
                "            <Llave>10001902817105012705182802661000000000</Llave>\n" +
                "        </CuentaCartera>\n" +
                "        <EndeudamientoGlobal calificacion=\"A\" fuente=\"S\" saldoPendiente=\"592000\" tipoCredito=\"CNS\"\n" +
                "            moneda=\"ML\" numeroCreditos=\"1\" independiente=\"\" fechaReporte=\"2022-03-31\">\n" +
                "            <Entidad nombre=\"BANCOLOMBIA-BC               0\" nit=\"00890903938\" sector=\"1\" />\n" +
                "            <Garantia tipo=\"0\" valor=\"0.0\" />\n" +
                "            <Llave>1000190281712022033101000007LSAO</Llave>\n" +
                "        </EndeudamientoGlobal>\n" +
                "        <Consulta fecha=\"2023-09-12\" tipoCuenta=\"CCF\" entidad=\"FINAMERICA     C.F.C.\"\n" +
                "            oficina=\"------------------\" ciudad=\"------------\" razon=\"00\" cantidad=\"01\"\n" +
                "            nitSuscriptor=\"00860025971\" sector=\"1\">\n" +
                "            <Llave>10001902817115</Llave>\n" +
                "        </Consulta>\n" +
                "        <Consulta fecha=\"2022-03-17\" tipoCuenta=\"CAB\" entidad=\"BANCOLOMBIA\"\n" +
                "            oficina=\"------------------\" ciudad=\"------------\" razon=\"00\" cantidad=\"01\"\n" +
                "            nitSuscriptor=\"00890903938\" sector=\"1\">\n" +
                "            <Llave>10001902817102</Llave>\n" +
                "        </Consulta>\n" +
                "        <RespuestaPersonalizada>\n" +
                "            <Linea consecutivo=\"01\">[ACIERTA_MASTER][745][TIPO_CONSULTA][1]</Linea>\n" +
                "            <Linea consecutivo=\"02\">[MONTO_MINIMO][200000][TIPO_ID][1]</Linea>\n" +
                "            <Linea consecutivo=\"03\">[ENDEUDAMIENTO][0][SALDO_MORA_SF][0]</Linea>\n" +
                "        </RespuestaPersonalizada>\n" +
                "        <InfoAgregada>\n" +
                "            <Resumen>\n" +
                "                <Principales creditoVigentes=\"2\" creditosCerrados=\"6\" creditosActualesNegativos=\"0\"\n" +
                "                    histNegUlt12Meses=\"0\" cuentasAbiertasAHOCCB=\"0\" cuentasCerradasAHOCCB=\"2\"\n" +
                "                    consultadasUlt6meses=\"5\" desacuerdosALaFecha=\"0\" antiguedadDesde=\"2005-11-30\"\n" +
                "                    reclamosVigentes=\"0\" />\n" +
                "                <Saldos saldoTotalEnMora=\"0.0\" saldoM30=\"0.0\" saldoM60=\"0.0\" saldoM90=\"0.0\"\n" +
                "                    cuotaMensual=\"269.0\" saldoCreditoMasAlto=\"1726.0\" saldoTotal=\"2135.0\">\n" +
                "                    <Sector sector=\"1\" saldo=\"2135.0\" participacion=\"100.0\" />\n" +
                "                    <Sector sector=\"2\" saldo=\"0.0\" participacion=\"0.0\" />\n" +
                "                    <Mes fecha=\"2022-06-30\" saldoTotalMora=\"0\" saldoTotal=\"2135000\" />\n" +
                "                    <Mes fecha=\"2022-05-30\" saldoTotalMora=\"0\" saldoTotal=\"2193000\" />\n" +
                "                </Saldos>\n" +
                "                <Comportamiento>\n" +
                "                    <Mes fecha=\"2022-06-30\" comportamiento=\"N\" cantidad=\"0\" />\n" +
                "                    <Mes fecha=\"2022-05-30\" comportamiento=\"N\" cantidad=\"0\" />\n" +
                "                </Comportamiento>\n" +
                "            </Resumen>\n" +
                "            <Totales>\n" +
                "                <TipoCuenta codigoTipo=\"CAB\" tipo=\"Cartera bancaria\" calidadDeudor=\"Principal\"\n" +
                "                    cupo=\"3030.0\" saldo=\"1726.0\" saldoMora=\"0.0\" cuota=\"210.0\" />\n" +
                "                <Total calidadDeudor=\"Principal\" participacion=\"100.0\" cupo=\"3830.0\" saldo=\"2135.0\"\n" +
                "                    saldoMora=\"0.0\" cuota=\"269.0\" />\n" +
                "            </Totales>\n" +
                "            <ComposicionPortafolio>\n" +
                "                <TipoCuenta tipo=\"CAB\" calidadDeudor=\"Principal\" porcentaje=\"1.0\" cantidad=\"1\">\n" +
                "                    <Estado codigo=\"Al dia\" cantidad=\"1\" />\n" +
                "                </TipoCuenta>\n" +
                "            </ComposicionPortafolio>\n" +
                "            <Cheques />\n" +
                "            <EvolucionDeuda>\n" +
                "                <Trimestre fecha=\"2022-06-01\" cuota=\"277666\" cupoTotal=\"3830000\" saldo=\"2272333\"\n" +
                "                    porcentajeUso=\"0.5932985204525674\" score=\"0.0\" calificacion=\"A\"\n" +
                "                    aperturaCuentas=\"0\" cierreCuentas=\"0\" totalAbiertas=\"2\" totalCerradas=\"8\"\n" +
                "                    moraMaxima=\"M 0\" mesesMoraMaxima=\"0\" />\n" +
                "                <AnalisisPromedio cuota=\"0.0\" cupoTotal=\"0.0\" saldo=\"-31.3\"\n" +
                "                    porcentajeUso=\"-27.075718015665807\" score=\"0.0\" calificacion=\"0\"\n" +
                "                    aperturaCuentas=\"0.0\" cierreCuentas=\"-100.0\" totalAbiertas=\"0.0\"\n" +
                "                    totalCerradas=\"0.0\" moraMaxima=\"0\" />\n" +
                "            </EvolucionDeuda>\n" +
                "            <HistoricoSaldos>\n" +
                "                <TipoCuenta tipo=\"CAB\">\n" +
                "                    <Trimestre fecha=\"2022-06-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"1849333\" />\n" +
                "                    <Trimestre fecha=\"2022-03-01\" totalCuentas=\"1\" cuentasConsideradas=\"1\"\n" +
                "                        saldo=\"2197333\" />\n" +
                "                </TipoCuenta>\n" +
                "                <Totales fecha=\"2022-06-01\" totalCuentas=\"2\" cuentasConsideradas=\"2\"\n" +
                "                    saldo=\"2272333.3\" />\n" +
                "            </HistoricoSaldos>\n" +
                "            <ResumenEndeudamiento>\n" +
                "                <Trimestre fecha=\"2022-03-01\">\n" +
                "                    <Sector sector=\"Financiero\" codigoSector=\"1\" garantiaAdmisible=\"0\"\n" +
                "                        garantiaOtro=\"0\">\n" +
                "                        <Cartera tipo=\"Comercial\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Hipotecario\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Consumo\" numeroCuentas=\"1\" valor=\"592.0\" />\n" +
                "                        <Cartera tipo=\"Tarjeta de Crédito\" numeroCuentas=\"0\" valor=\"0.0\" />\n" +
                "                        <Cartera tipo=\"Microcrédito\" numeroCuentas=\"1\" valor=\"2137.0\" />\n" +
                "                    </Sector>\n" +
                "                </Trimestre>\n" +
                "            </ResumenEndeudamiento>\n" +
                "        </InfoAgregada>\n" +
                "        <InfoAgregadaMicrocredito>\n" +
                "            <Resumen>\n" +
                "                <PerfilGeneral>\n" +
                "                    <CreditosVigentes sectorFinanciero=\"2\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"2\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <CreditosCerrados sectorFinanciero=\"3\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"3\" totalComoPrincipal=\"6\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <CreditosReestructurados sectorFinanciero=\"0\" sectorCooperativo=\"0\"\n" +
                "                        sectorReal=\"0\" sectorTelcos=\"0\" totalComoPrincipal=\"0\"\n" +
                "                        totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <CreditosRefinanciados sectorFinanciero=\"0\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"0\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <ConsultaUlt6Meses sectorFinanciero=\"14\" sectorCooperativo=\"0\" sectorReal=\"1\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"0\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <Desacuerdos sectorFinanciero=\"0\" sectorCooperativo=\"0\" sectorReal=\"0\"\n" +
                "                        sectorTelcos=\"0\" totalComoPrincipal=\"0\" totalComoCodeudorYOtros=\"0\" />\n" +
                "                    <AntiguedadDesde sectorFinanciero=\"2005-11-30\" sectorTelcos=\"2008-01-01\" />\n" +
                "                </PerfilGeneral>\n" +
                "                <VectorSaldosYMoras poseeSectorCooperativo=\"false\" poseeSectorFinanciero=\"true\"\n" +
                "                    poseeSectorReal=\"false\" poseeSectorTelcos=\"true\">\n" +
                "                    <SaldosYMoras fecha=\"2022-06-30\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"2135.0\" morasMaxSectorFinanciero=\"N\" morasMaximas=\"N\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                    <SaldosYMoras fecha=\"2022-05-30\" totalCuentasMora=\"0\" saldoDeudaTotalMora=\"0.0\"\n" +
                "                        saldoDeudaTotal=\"2193.0\" morasMaxSectorFinanciero=\"N\" morasMaximas=\"N\"\n" +
                "                        numCreditos30=\"0\" numCreditosMayorIgual60=\"0\" />\n" +
                "                </VectorSaldosYMoras>\n" +
                "                <EndeudamientoActual>\n" +
                "                    <Sector codSector=\"1\">\n" +
                "                        <TipoCuenta tipoCuenta=\"CAB\">\n" +
                "                            <Usuario tipoUsuario=\"Principal\">\n" +
                "                                <Cuenta estadoActual=\"Al día\" calificacion=\"A\" valorInicial=\"3030.0\"\n" +
                "                                    saldoActual=\"1726.0\" saldoMora=\"0.0\" cuotaMes=\"210.0\"\n" +
                "                                    comportamientoNegativo=\"false\" totalDeudaCarteras=\"2135.0\" />\n" +
                "                            </Usuario>\n" +
                "                        </TipoCuenta>\n" +
                "                    </Sector>\n" +
                "                </EndeudamientoActual>\n" +
                "                <ImagenTendenciaEndeudamiento>\n" +
                "                    <Series serie=\"Cartera bancaria\">\n" +
                "                        <Valores>\n" +
                "                            <Valor valor=\"57.0\" fecha=\"2022-06-30\" />\n" +
                "                            <Valor valor=\"61.1\" fecha=\"2022-05-30\" />\n" +
                "                            <Valor valor=\"65.0\" fecha=\"2022-04-30\" />\n" +
                "                            <Valor valor=\"68.9\" fecha=\"2022-03-30\" />\n" +
                "                            <Valor valor=\"72.6\" fecha=\"2022-02-28\" />\n" +
                "                            <Valor valor=\"76.1\" fecha=\"2022-01-30\" />\n" +
                "                            <Valor valor=\"79.5\" fecha=\"2021-12-30\" />\n" +
                "                            <Valor valor=\"79.5\" fecha=\"2021-11-30\" />\n" +
                "                            <Valor valor=\"86.0\" fecha=\"2021-10-30\" />\n" +
                "                            <Valor valor=\"86.0\" fecha=\"2021-09-30\" />\n" +
                "                            <Valor valor=\"91.9\" fecha=\"2021-08-30\" />\n" +
                "                            <Valor valor=\"94.8\" fecha=\"2021-07-30\" />\n" +
                "                        </Valores>\n" +
                "                    </Series>\n" +
                "                    <Series serie=\"Tarjeta de crédito\">\n" +
                "                        <Valores>\n" +
                "                            <Valor valor=\"51.1\" fecha=\"2022-06-30\" />\n" +
                "                            <Valor valor=\"42.8\" fecha=\"2022-05-30\" />\n" +
                "                            <Valor valor=\"64.8\" fecha=\"2022-04-30\" />\n" +
                "                            <Valor valor=\"73.9\" fecha=\"2022-03-30\" />\n" +
                "                            <Valor valor=\"89.1\" fecha=\"2022-02-28\" />\n" +
                "                            <Valor valor=\"85.5\" fecha=\"2022-01-30\" />\n" +
                "                            <Valor valor=\"110.0\" fecha=\"2021-12-30\" />\n" +
                "                            <Valor valor=\"85.0\" fecha=\"2021-11-30\" />\n" +
                "                            <Valor valor=\"93.9\" fecha=\"2021-10-30\" />\n" +
                "                            <Valor valor=\"102.6\" fecha=\"2021-09-30\" />\n" +
                "                            <Valor valor=\"94.0\" fecha=\"2021-08-30\" />\n" +
                "                            <Valor valor=\"110.0\" fecha=\"2021-07-30\" />\n" +
                "                        </Valores>\n" +
                "                    </Series>\n" +
                "                </ImagenTendenciaEndeudamiento>\n" +
                "            </Resumen>\n" +
                "            <AnalisisVectores>\n" +
                "                <Sector nombreSector=\"Sector Financiero\">\n" +
                "                    <Cuenta entidad=\"Bancompartir   Finamerica\" numeroCuenta=\"182802661\"\n" +
                "                        tipoCuenta=\"CAB\" estado=\"Al día\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <Cuenta entidad=\"EDYFICAR       MIBANCO\" numeroCuenta=\"138273621\"\n" +
                "                        tipoCuenta=\"MCR\" estado=\"Pago Vol\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <Cuenta entidad=\"BANCOLOMBIA    MASTERCARD\" numeroCuenta=\"530621075\"\n" +
                "                        tipoCuenta=\"TDC\" estado=\"Al día\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-08-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-07-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                    </Cuenta>\n" +
                "                    <MorasMaximas>\n" +
                "                        <CaracterFecha fecha=\"2020-07-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-08-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" saldoDeudaTotalMora=\"N\" />\n" +
                "                    </MorasMaximas>\n" +
                "                </Sector>\n" +
                "                <Sector nombreSector=\"Sector Telcos\">\n" +
                "                    <Cuenta entidad=\"COMCEL         FINANCIAEQUIPO\" numeroCuenta=\"507761621\"\n" +
                "                        tipoCuenta=\"COM\" estado=\"Pago Vol\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <Cuenta entidad=\"COMCEL S.A.\" numeroCuenta=\"792941103\" tipoCuenta=\"CTC\"\n" +
                "                        estado=\"Pago Vol\" contieneDatos=\"true\">\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                    </Cuenta>\n" +
                "                    <MorasMaximas>\n" +
                "                        <CaracterFecha fecha=\"2020-07-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-08-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-09-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-10-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-11-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2020-12-28\" saldoDeudaTotalMora=\"-\" />\n" +
                "                        <CaracterFecha fecha=\"2021-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-02-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-03-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-04-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-05-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-06-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-07-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-08-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-09-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-10-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-11-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2021-12-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-01-28\" saldoDeudaTotalMora=\"N\" />\n" +
                "                        <CaracterFecha fecha=\"2022-02-28\" />\n" +
                "                        <CaracterFecha fecha=\"2022-03-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-04-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-05-30\" />\n" +
                "                        <CaracterFecha fecha=\"2022-06-30\" />\n" +
                "                    </MorasMaximas>\n" +
                "                </Sector>\n" +
                "            </AnalisisVectores>\n" +
                "            <EvolucionDeuda>\n" +
                "                <Trimestres>\n" +
                "                    <Trimestre>2022/06</Trimestre>\n" +
                "                    <Trimestre>2022/03</Trimestre>\n" +
                "                </Trimestres>\n" +
                "                <EvolucionDeudaSector codSector=\"1\" nombreSector=\"Financiero\">\n" +
                "                    <EvolucionDeudaTipoCuenta tipoCuenta=\"CAB\">\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/06\" tipoCuenta=\"CAB\" num=\"1\"\n" +
                "                            cupoInicial=\"3030.0\" saldo=\"1726.0\" saldoMora=\"0.0\" cuota=\"210.0\"\n" +
                "                            porcentajeDeuda=\"57.0\" codMenorCalificacion=\"1\"\n" +
                "                            textoMenorCalificacion=\"A\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/03\" tipoCuenta=\"CAB\" num=\"1\"\n" +
                "                            cupoInicial=\"3030.0\" saldo=\"2087.0\" saldoMora=\"0.0\" cuota=\"219.0\"\n" +
                "                            porcentajeDeuda=\"68.9\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/12\" tipoCuenta=\"CAB\" num=\"1\"\n" +
                "                            cupoInicial=\"3030.0\" saldo=\"2410.0\" saldoMora=\"0.0\" cuota=\"219.0\"\n" +
                "                            porcentajeDeuda=\"79.5\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/09\" tipoCuenta=\"CAB\" num=\"1\"\n" +
                "                            cupoInicial=\"3030.0\" saldo=\"2605.0\" saldoMora=\"0.0\" cuota=\"220.0\"\n" +
                "                            porcentajeDeuda=\"86.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/06\" tipoCuenta=\"CAB\" num=\"1\"\n" +
                "                            cupoInicial=\"3030.0\" saldo=\"2953.0\" saldoMora=\"0.0\" cuota=\"290.0\"\n" +
                "                            porcentajeDeuda=\"97.5\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/03\" tipoCuenta=\"CAB\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                    </EvolucionDeudaTipoCuenta>\n" +
                "                    <EvolucionDeudaTipoCuenta tipoCuenta=\"TDC\">\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/06\" tipoCuenta=\"TDC\" num=\"1\"\n" +
                "                            cupoInicial=\"800.0\" saldo=\"409.0\" saldoMora=\"0.0\" cuota=\"59.0\"\n" +
                "                            porcentajeDeuda=\"51.1\" codMenorCalificacion=\"1\"\n" +
                "                            textoMenorCalificacion=\"A\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/03\" tipoCuenta=\"TDC\" num=\"1\"\n" +
                "                            cupoInicial=\"800.0\" saldo=\"591.0\" saldoMora=\"0.0\" cuota=\"64.0\"\n" +
                "                            porcentajeDeuda=\"73.9\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/12\" tipoCuenta=\"TDC\" num=\"1\"\n" +
                "                            cupoInicial=\"800.0\" saldo=\"922.0\" saldoMora=\"0.0\" cuota=\"57.0\"\n" +
                "                            porcentajeDeuda=\"115.3\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/09\" tipoCuenta=\"TDC\" num=\"1\"\n" +
                "                            cupoInicial=\"800.0\" saldo=\"821.0\" saldoMora=\"0.0\" cuota=\"54.0\"\n" +
                "                            porcentajeDeuda=\"102.6\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/06\" tipoCuenta=\"TDC\" num=\"1\"\n" +
                "                            cupoInicial=\"800.0\" saldo=\"920.0\" saldoMora=\"0.0\" cuota=\"49.0\"\n" +
                "                            porcentajeDeuda=\"115.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/03\" tipoCuenta=\"TDC\" num=\"1\"\n" +
                "                            cupoInicial=\"800.0\" saldo=\"1532.0\" saldoMora=\"0.0\" cuota=\"22.0\"\n" +
                "                            porcentajeDeuda=\"191.5\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                    </EvolucionDeudaTipoCuenta>\n" +
                "                </EvolucionDeudaSector>\n" +
                "                <EvolucionDeudaSector codSector=\"4\" nombreSector=\"Telcos\">\n" +
                "                    <EvolucionDeudaTipoCuenta tipoCuenta=\"COM\">\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/06\" tipoCuenta=\"COM\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2022/03\" tipoCuenta=\"COM\" num=\"0\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/12\" tipoCuenta=\"COM\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"0.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/09\" tipoCuenta=\"COM\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"157.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/06\" tipoCuenta=\"COM\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"312.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                        <EvolucionDeudaValorTrimestre trimestre=\"2021/03\" tipoCuenta=\"COM\" num=\"1\"\n" +
                "                            cupoInicial=\"0.0\" saldo=\"456.0\" saldoMora=\"0.0\" cuota=\"0.0\"\n" +
                "                            porcentajeDeuda=\"0.0\" codMenorCalificacion=\"0\"\n" +
                "                            textoMenorCalificacion=\"-\" />\n" +
                "                    </EvolucionDeudaTipoCuenta>\n" +
                "                </EvolucionDeudaSector>\n" +
                "            </EvolucionDeuda>\n" +
                "        </InfoAgregadaMicrocredito>\n" +
                "    </Informe>\n" +
                "</Informes>";

        try {
            // Convertir el XML a un arreglo de bytes usando la codificación ISO-8859-1
            byte[] xmlBytes = xml.getBytes(StandardCharsets.ISO_8859_1);
            return service.procesarDatosXml(xmlBytes);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
