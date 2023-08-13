package com.BikkadIT.TicketBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.BikkadIT.TicketBookingApp.RequestBinding.Passenger;
import com.BikkadIT.TicketBookingApp.ResponseBinding.Ticket;
import com.BikkadIT.TicketBookingApp.ticketService.TicketServiceI;

@RestController
public class TicketController {

	@Autowired
	private TicketServiceI ticketServiceI;
	
	@PostMapping(value = "/bookTicket",consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg){
		
		Ticket bookTicket = ticketServiceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.OK);
		
		
	}
	@GetMapping(value = "/test",consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"})
	public ResponseEntity<String> bookTicket( ){
		
		
		return new ResponseEntity<String>("this is bikkad it",HttpStatus.OK);
		
		
	}
	
}
