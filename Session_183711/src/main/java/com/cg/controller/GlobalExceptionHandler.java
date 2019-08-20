package com.cg.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.exception.SessionException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = {SessionException.class,Exception.class})
	protected ModelAndView handleConflict(Exception exception) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("errorPage",exception.getMessage());
		return modelAndView;
	}
	
	
}
