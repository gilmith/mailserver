package com.jacobo.adyd.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.jacobo.adyd.model.MailInput;
import com.jacobo.adyd.model.ResponseMail;
import com.jacobo.adyd.service.MailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MailAPIImpl implements MailAPI {
	
	private final MailService mailService;

	@Override
	public ResponseEntity<ResponseMail> sendMailRegister(MailInput input) {
		log.info("enviando mail de registro");
		return ResponseEntity.ok(mailService.sendMail(input.getPara(), input.getToken()));
	}

}
