package com.mibanco.procesardatosxml.us.utils.validators;

import com.mibanco.procesardatosxml.us.constantes.Constants;
import com.mibanco.procesardatosxml.us.utils.exceptions.ApplicationExceptionValidation;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class ProcesarDatosValidator {

    public static final Logger logger = LoggerFactory.getLogger(ProcesarDatosValidator.class);


    public void validarXMl(String xml) throws ApplicationExceptionValidation {
        logger.info("Inicia Validaciones");
        if (xml == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.VALIDACION + " XML inválido"
            );
        }
    }


}
