package com.fermi4.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fermi4.springcloud.models.TicketPrice;

public interface TicketPriceRepository extends JpaRepository<TicketPrice, Long>{
	TicketPrice findByType(String ticketType);
}
