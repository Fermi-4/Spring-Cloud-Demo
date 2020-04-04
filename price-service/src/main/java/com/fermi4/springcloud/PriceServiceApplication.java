package com.fermi4.springcloud;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.fermi4.springcloud.models.TicketPrice;
import com.fermi4.springcloud.repo.TicketPriceRepository;

@SpringBootApplication
@EnableEurekaClient
public class PriceServiceApplication implements CommandLineRunner {

	@Autowired
	TicketPriceRepository _repo;
	
	public static void main(String[] args) {
		SpringApplication.run(PriceServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// populate ticket repository with predefined types...
		
		
		//bus ticket
		TicketPrice busTicket = new TicketPrice();
		busTicket.setPrice(BigDecimal.valueOf(10.50));
		busTicket.setType("bus");
		
		//bus ticket
		TicketPrice planeTicket = new TicketPrice();
		planeTicket.setPrice(BigDecimal.valueOf(1000.00));
		planeTicket.setType("plane");
				
		//bus ticket
		TicketPrice edmTicket = new TicketPrice();
		edmTicket.setPrice(BigDecimal.valueOf(50.00));
		edmTicket.setType("edm");

		
		_repo.save(busTicket);
		_repo.save(planeTicket);
		_repo.save(edmTicket);
		
		
	}

}