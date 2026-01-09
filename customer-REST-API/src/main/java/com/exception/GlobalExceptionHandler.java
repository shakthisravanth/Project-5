package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

	// Handles CustomerNotFoundException globally or within controller

	// @ExceptionHandler maps this method to CustomerNotFoundException

	// Method to handle the exception
	// Accepts CustomerNotFoundException as parameter

	// Returns ResponseEntity with error message and HTTP 404 status

}
