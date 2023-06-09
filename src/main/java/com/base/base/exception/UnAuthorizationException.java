package com.base.base.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnAuthorizationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UnAuthorizationException(String message) {
		super(message);
	}

	public UnAuthorizationException(String message, Throwable cause) {
		super(message, cause);
	}
}
