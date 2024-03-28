package com.jacobo.adyd.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@AllArgsConstructor
@Value
@Builder
public class ResponseMail {
	
	private String confirmacion;
	private String para;
	private String errorMessage;

}
