package com.mibanco.procesardatosxml.us.utils.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mibanco.procesardatosxml.us.dto.Informes;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesarDatosMapperGrpc {

    @Inject
    ObjectMapper objectMapper;

    public String objToJson(Informes obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
