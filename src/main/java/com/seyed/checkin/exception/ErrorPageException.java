package com.seyed.checkin.exception;


import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.InputMismatchException;

@ControllerAdvice
public class ErrorPageException {

    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView handleExceptionTMM(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("errorPage");
        modelAndView.addObject("errorMessage", "Please Enter valid data!");
        return modelAndView;
    }
}