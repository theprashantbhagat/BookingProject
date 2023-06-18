package com.BikkadIT.TicketBookingApp.ticketService;

import com.BikkadIT.TicketBookingApp.RequestBinding.Passenger;
import com.BikkadIT.TicketBookingApp.ResponseBinding.Ticket;

public interface TicketServiceI {

	public Ticket bookTicket(Passenger psg);
}
