package com.ing.tech.data;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String details;
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public ExceptionResponse(Date timestamp, String message) {
		super();
		this.timestamp = timestamp;
		this.message = message;
	}
}
