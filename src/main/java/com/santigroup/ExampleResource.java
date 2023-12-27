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
                "    <Informe fechaConsulta=\"2023-09-19T11:09:53\" respuesta=\"13\" codSeguridad=\"92W4290\"\n" +
                "             tipoIdDigitado=\"1\" identificacionDigitada=\"19028171\" apellidoDigitado=\"ARIAS\">\n" +
                "        <NaturalNacional nombres=\"EDISON PAUL\" primerApellido=\"ARIAS\" segundoApellido=\"ARIAS\"\n" +
                "                         nombreCompleto=\"ARIAS ARIAS EDISON PAUL\" validada=\"true\" rut=\"false\" genero=\"4\">\n" +
                "            <Identificacion estado=\"00\" fechaExpedicion=\"1998-11-04\" ciudad=\"LA VIRGINIA\"\n" +
                "                            departamento=\"RISARALDA\" genero=\"4\" numero=\"00019028171\" />\n" +
                "            <Edad min=\"36\" max=\"45\" />\n" +
                "            <InfoDemografica>\n" +
                "                <OperacionesInternacionales idRegistro=\"0\" operaInt=\"false\" fecha=\"2014-01-31\"\n" +
                "                                            nitReporta=\"00811007713\"\n" +
                "                                            razonSocial=\"SISTECREDITO S.A.S                                                                                  \" />\n" +
                "                <Identificacion idRegistro=\"0\" lugarExpedicion=\"00000000\" nitReporta=\"00811007713\"\n" +
                "                                razonSocial=\"SISTECREDITO S.A.S                                                                                  \" />\n" +
                "            </InfoDemografica>\n" +
                "        </NaturalNacional>\n" +
                "        <Score tipo=\"10\" puntaje=\"0.0\" clasificacion=\"Z\" fecha=\"2023-09-19\" poblacion=\"0\">\n" +
                "            <Razon codigo=\"745\" />\n" +
                "        </Score>\n" +
                "        <CuentaAhorro bloqueada=\"false\" entidad=\"BANCOLOMBIA\" numero=\"172711111\"\n" +
                "                      fechaApertura=\"2005-11-30\" situacionTitular=\"0\" oficina=\"PLAZA DE BOLIVA\"\n" +
                "                      ciudad=\"PEREIR\" codigoDaneCiudad=\"00000000\" tipoIdentificacion=\"2\"\n" +
                "                      identificacion=\"00890903938\" sector=\"1\">\n" +
                "            <Caracteristicas clase=\"0\" />\n" +
                "            <Valores />\n" +
                "            <Estado codigo=\"05\" fecha=\"2010-06-30\" />\n" +
                "            <Llave>10001902817151023201172711111000000000</Llave>\n" +
                "        </CuentaAhorro>\n" +
                "        <CuentaAhorro bloqueada=\"false\" entidad=\"BANCOLOMBIA\" numero=\"507111116\"\n" +
                "                      fechaApertura=\"2016-09-29\" calificacion=\"1\" situacionTitular=\"0\"\n" +
                "                      oficina=\"VICTORIA PLAZA\" ciudad=\"PEREIRA\" codigoDaneCiudad=\"66001000\"\n" +
                "                      tipoIdentificacion=\"2\" identificacion=\"00890903938\" sector=\"1\">\n" +
                "            <Caracteristicas clase=\"0\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2021-10-31\" calificacion=\"1\" />\n" +
                "            </Valores>\n" +
                "            <Estado codigo=\"05\" fecha=\"2021-10-31\" />\n" +
                "            <Llave>10001902817151023201507111116000000000</Llave>\n" +
                "        </CuentaAhorro>\n" +
                "        <TarjetaCredito bloqueada=\"false\" entidad=\"BANCOLOMBIA    MASTERCARD\" numero=\"530621075\"\n" +
                "                        fechaApertura=\"2018-08-29\" fechaVencimiento=\"2024-07-30\"\n" +
                "                        comportamiento=\"NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN-- \" formaPago=\"0\"\n" +
                "                        probabilidadIncumplimiento=\"0.0\" calificacion=\"1\" situacionTitular=\"0\"\n" +
                "                        oficina=\"30 DE AGOSTO\" ciudad=\"PEREIRA\" codigoDaneCiudad=\"00000000\"\n" +
                "                        tipoIdentificacion=\"2\" identificacion=\"00890903938\" sector=\"1\" calificacionHD=\"true\">\n" +
                "            <Caracteristicas franquicia=\"3\" clase=\"4\" marca=\"000\" amparada=\"false\"\n" +
                "                             codigoAmparada=\"00\" garantia=\"2\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-06-30\" calificacion=\"-\" saldoActual=\"409000.0\"\n" +
                "                       saldoMora=\"0.0\" disponible=\"390000.0\" cuota=\"59000.0\" cuotasMora=\"0\"\n" +
                "                       diasMora=\"0\" fechaPagoCuota=\"2022-06-30\" fechaLimitePago=\"2022-07-18\"\n" +
                "                       cupoTotal=\"800000.0\" />\n" +
                "            </Valores>\n" +
                "            <Estados>\n" +
                "                <EstadoPlastico codigo=\"1\" fecha=\"2023-09-19\" />\n" +
                "                <EstadoCuenta codigo=\"01\" fecha=\"2022-06-30\" />\n" +
                "                <EstadoOrigen codigo=\"0\" fecha=\"2018-08-29\" />\n" +
                "                <EstadoPago codigo=\"01\" meses=\"48\" fecha=\"2022-06-30\" />\n" +
                "            </Estados>\n" +
                "            <Llave>10001902817102023302530621075000000000</Llave>\n" +
                "        </TarjetaCredito>\n" +
                "        <TarjetaCredito bloqueada=\"false\" entidad=\"BANCOLOMBIA    MASTERCARD\" numero=\"530621014\"\n" +
                "                        fechaApertura=\"2018-01-17\" fechaVencimiento=\"2024-06-30\"\n" +
                "                        comportamiento=\"NN--------------------------------------------- \" formaPago=\"1\"\n" +
                "                        probabilidadIncumplimiento=\"0.0\" calificacion=\"1\" situacionTitular=\"7\"\n" +
                "                        oficina=\"UNICENTRO PEREIRA\" ciudad=\"PEREIRA\" codigoDaneCiudad=\"00000000\"\n" +
                "                        tipoIdentificacion=\"2\" identificacion=\"00890903938\" sector=\"1\" calificacionHD=\"true\">\n" +
                "            <Caracteristicas franquicia=\"3\" clase=\"4\" marca=\"000\" amparada=\"false\"\n" +
                "                             codigoAmparada=\"00\" garantia=\"2\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2018-03-31\" calificacion=\"-\" saldoActual=\"0.0\"\n" +
                "                       saldoMora=\"0.0\" disponible=\"700000.0\" cuota=\"0.0\" cuotasMora=\"0\" diasMora=\"0\"\n" +
                "                       fechaLimitePago=\"2018-03-31\" cupoTotal=\"700000.0\" />\n" +
                "            </Valores>\n" +
                "            <Estados>\n" +
                "                <EstadoPlastico codigo=\"8\" fecha=\"2018-03-31\" />\n" +
                "                <EstadoCuenta codigo=\"08\" fecha=\"2018-03-31\" />\n" +
                "                <EstadoOrigen codigo=\"0\" fecha=\"2018-01-17\" />\n" +
                "                <EstadoPago codigo=\"05\" meses=\"48\" fecha=\"2018-03-31\" />\n" +
                "            </Estados>\n" +
                "            <Llave>10001902817102023302530621014000000000</Llave>\n" +
                "        </TarjetaCredito>\n" +
                "        <CuentaCartera bloqueada=\"false\" entidad=\"Bancompartir   Finamerica\" numero=\"182802661\"\n" +
                "                       fechaApertura=\"2021-04-23\" fechaVencimiento=\"2023-05-11\"\n" +
                "                       comportamiento=\"NNNNNNNNNNNNNN--------------------------------- \" formaPago=\"0\"\n" +
                "                       probabilidadIncumplimiento=\"0.0\" calificacion=\"1\" situacionTitular=\"0\" oficina=\"CUBA\"\n" +
                "                       ciudad=\"PEREIRA\" codigoDaneCiudad=\"00000000\" codSuscriptor=\"050127\"\n" +
                "                       tipoIdentificacion=\"2\" identificacion=\"00860025971\" sector=\"1\" calificacionHD=\"true\">\n" +
                "            <Caracteristicas tipoCuenta=\"CAB\" tipoObligacion=\"5\" tipoContrato=\"1\"\n" +
                "                             ejecucionContrato=\"5\" mesesPermanencia=\"0\" calidadDeudor=\"00\" garantia=\"Q\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-06-30\" calificacion=\"-\" saldoActual=\"1726000.0\"\n" +
                "                       saldoMora=\"0.0\" disponible=\"-1\" cuota=\"210000.0\" cuotasMora=\"0\" diasMora=\"0\"\n" +
                "                       fechaPagoCuota=\"2021-09-28\" periodicidad=\"1\" totalCuotas=\"24\"\n" +
                "                       valorInicial=\"3030000.0\" cuotasCanceladas=\"13\" />\n" +
                "            </Valores>\n" +
                "            <Estados>\n" +
                "                <EstadoCuenta codigo=\"01\" fecha=\"2022-06-30\" />\n" +
                "                <EstadoOrigen codigo=\"0\" fecha=\"2021-04-23\" />\n" +
                "                <EstadoPago codigo=\"01\" meses=\"48\" fecha=\"2022-06-30\" />\n" +
                "            </Estados>\n" +
                "            <Llave>10001902817105012705182802661000000000</Llave>\n" +
                "        </CuentaCartera>\n" +
                "        <CuentaCartera bloqueada=\"false\" entidad=\"COMCEL         FINANCIAEQUIPO\" numero=\"507761621\"\n" +
                "                       fechaApertura=\"2021-01-09\" fechaVencimiento=\"2025-01-31\"\n" +
                "                       comportamiento=\"NNNNNNNNNNNN----------------------------------- \" formaPago=\"1\"\n" +
                "                       probabilidadIncumplimiento=\"0.0\" calificacion=\"1\" situacionTitular=\"0\" oficina=\"PEREIRA\"\n" +
                "                       ciudad=\"PEREIRA\" codigoDaneCiudad=\"00000000\" codSuscriptor=\"340118\"\n" +
                "                       tipoIdentificacion=\"2\" identificacion=\"00800153993\" sector=\"4\" calificacionHD=\"true\">\n" +
                "            <Caracteristicas tipoCuenta=\"COM\" tipoObligacion=\"2\" tipoContrato=\"1\"\n" +
                "                             ejecucionContrato=\"2\" mesesPermanencia=\"0\" calidadDeudor=\"00\" garantia=\"2\" />\n" +
                "            <Valores>\n" +
                "                <Valor moneda=\"1\" fecha=\"2022-01-31\" calificacion=\"-\" saldoActual=\"0.0\"\n" +
                "                       saldoMora=\"0.0\" disponible=\"-1\" cuota=\"0.0\" cuotasMora=\"0\" diasMora=\"0\"\n" +
                "                       fechaPagoCuota=\"2021-12-27\" fechaLimitePago=\"2022-01-24\" periodicidad=\"1\"\n" +
                "                       totalCuotas=\"12\" valorInicial=\"-1\" cuotasCanceladas=\"0\" />\n" +
                "            </Valores>\n" +
                "            <Estados>\n" +
                "                <EstadoCuenta codigo=\"03\" fecha=\"2022-01-31\" />\n" +
                "                <EstadoOrigen codigo=\"0\" fecha=\"2021-01-09\" />\n" +
                "                <EstadoPago codigo=\"08\" meses=\"48\" fecha=\"2022-01-31\" />\n" +
                "            </Estados>\n" +
                "            <Llave>10001902817134011834507761621000000000</Llave>\n" +
                "        </CuentaCartera>\n" +
                "        <EndeudamientoGlobal calificacion=\"A\" fuente=\"S\" saldoPendiente=\"592000\" tipoCredito=\"CNS\"\n" +
                "                             moneda=\"ML\" numeroCreditos=\"1\" independiente=\"\" fechaReporte=\"2022-03-31\">\n" +
                "            <Entidad nombre=\"BANCOLOMBIA-BC               0\" nit=\"00890903938\" sector=\"1\" />\n" +
                "            <Garantia tipo=\"0\" valor=\"0.0\" />\n" +
                "            <Llave>1000190281712022033101000007LSAO</Llave>\n" +
                "        </EndeudamientoGlobal>\n" +
                "        <EndeudamientoGlobal calificacion=\"A\" fuente=\"S\" saldoPendiente=\"2605000\" tipoCredito=\"MIC\"\n" +
                "                             moneda=\"ML\" numeroCreditos=\"1\" independiente=\"\" fechaReporte=\"2021-09-30\">\n" +
                "            <Entidad nombre=\"BANCO COMPARTIR S.A          0\" nit=\"00860025971\" sector=\"1\" />\n" +
                "            <Garantia tipo=\"0\" valor=\"0.0\" />\n" +
                "            <Llave>1000190281712021093001000062LCAO</Llave>\n" +
                "        </EndeudamientoGlobal>\n" +
                "        <Consulta fecha=\"2023-09-12\" tipoCuenta=\"CCF\" entidad=\"FINAMERICA     C.F.C.\"\n" +
                "                  oficina=\"------------------\" ciudad=\"------------\" razon=\"00\" cantidad=\"01\"\n" +
                "                  nitSuscriptor=\"00860025971\" sector=\"1\">\n" +
                "            <Llave>10001902817115</Llave>\n" +
                "        </Consulta>\n" +
                "        <Consulta fecha=\"2022-03-17\" tipoCuenta=\"CAB\" entidad=\"BANCOLOMBIA\"\n" +
                "                  oficina=\"------------------\" ciudad=\"------------\" razon=\"00\" cantidad=\"01\"\n" +
                "                  nitSuscriptor=\"00890903938\" sector=\"1\">\n" +
                "            <Llave>10001902817102</Llave>\n" +
                "        </Consulta>\n" +
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
