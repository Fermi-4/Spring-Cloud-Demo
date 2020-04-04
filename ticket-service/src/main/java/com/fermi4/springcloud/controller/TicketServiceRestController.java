package com.fermi4.springcloud.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketServiceRestController {
	
	@GetMapping("/{type}/{number}")
	public BigDecimal getTotalTicketPrice(@PathVariable String type, @PathVariable int number) {
		return null;
	}
	
	
	
}
