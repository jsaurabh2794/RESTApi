package com.saurabh.springboot.cruddemo.entity;

public class EmployeeErrorHandler {

	private int status;
	private String message;
	private long timeStamp;
	
	public EmployeeErrorHandler() {
		
	}

	public EmployeeErrorHandler(int status, String message, int timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long l) {
		this.timeStamp = l;
	}

	@Override
	public String toString() {
		return "StudentErrorHandler [status=" + status + ", message=" + message + ", timeStamp=" + timeStamp + "]";
	}
	
	
	
}
