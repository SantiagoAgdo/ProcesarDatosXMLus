package com.mibanco.procesardatosxml.us.service.contract;

import com.mibanco.procesardatosxml.us.dto.Informes;

public interface ProcesarDatosService {

    Informes procesarDatosXml(String xml) throws Exception;
}
