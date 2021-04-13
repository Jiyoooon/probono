package kr.ac.kopo.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ApplicationException.class)
	public String applicationException(ApplicationException e, Model model) {
		model.addAttribute("error", e.getMessage());
		return "error/error";
	}

	@ExceptionHandler(Exception.class)
	public String ServerException(Exception e, Model model) {
		model.addAttribute("error", "Server Error");
		e.printStackTrace();
		return "error/error";
	}
	
}
