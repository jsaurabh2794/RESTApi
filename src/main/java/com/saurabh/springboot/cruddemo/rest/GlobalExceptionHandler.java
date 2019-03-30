package com.saurabh.springboot.cruddemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.saurabh.springboot.cruddemo.entity.EmployeeErrorHandler;


@ControllerAdvice //global handler
public class GlobalExceptionHandler {

	//Add Exception handler
		@ExceptionHandler
		public ResponseEntity<EmployeeErrorHandler> errorHandler(EmployeeNotFoundException ex)
		{
			EmployeeErrorHandler errorHandler=new EmployeeErrorHandler();
			errorHandler.setStatus(HttpStatus.NOT_FOUND.value());
			errorHandler.setMessage(ex.getMessage());
			errorHandler.setTimeStamp(System.currentTimeMillis());
			
			return new ResponseEntity<EmployeeErrorHandler>(errorHandler,HttpStatus.NOT_FOUND);
			
		}
		
		@ExceptionHandler
		public ResponseEntity<EmployeeErrorHandler> errorHandlerAllTypeException(Exception ex)
		{
			EmployeeErrorHandler errorHandler=new EmployeeErrorHandler();
			errorHandler.setStatus(HttpStatus.BAD_REQUEST.value());
			errorHandler.setMessage("Invalid Employee Id");
			errorHandler.setTimeStamp(System.currentTimeMillis());
			
			return new ResponseEntity<EmployeeErrorHandler>(errorHandler,HttpStatus.BAD_REQUEST);
			
		}
	
}
