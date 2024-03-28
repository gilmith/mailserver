package com.jacobo.adyd.api;

import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jacobo.adyd.model.ResponseMail;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class MailAdvice {
	
	@ExceptionHandler(MailException.class)
    public ResponseEntity<ResponseMail> handleMyCustomException(MailException ex) {
		log.error("Error enviado correo {} ", ex.getMessage());
		return ResponseEntity.status(500).body(ResponseMail.builder().errorMessage("error enviando mensaje").build());
    }

}
