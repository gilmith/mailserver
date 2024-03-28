package com.jacobo.adyd.service;

import com.jacobo.adyd.model.ResponseMail;

public interface MailService {
	
	public ResponseMail sendMail(String de, String token);

}
