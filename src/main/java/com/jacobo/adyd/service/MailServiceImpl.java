package com.jacobo.adyd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.jacobo.adyd.model.ResponseMail;

import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MailServiceImpl implements MailService{
	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String de;
	
	
	@Override
	public ResponseMail sendMail(String para, String token) {
		log.info("servicio de mail");
		val mail = new SimpleMailMessage();
		mail.setFrom(de);
		mail.setTo(para);
		mail.setSubject("No Responder Bienvenido a Advanced Dungeons and Dragons");
		mail.setText("Para confirmar tu correo sigue este link https://129.151.225.83/login/confirm/" + token);
		sender.send(mail);
		return ResponseMail.builder().confirmacion("OK").para(para).build();	
	}

}
