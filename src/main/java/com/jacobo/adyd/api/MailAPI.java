package com.jacobo.adyd.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jacobo.adyd.model.MailInput;
import com.jacobo.adyd.model.ResponseMail;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public interface MailAPI {
	
	@PostMapping(path = "/mail", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseMail> sendMailRegister(@RequestBody MailInput input);
	

}
