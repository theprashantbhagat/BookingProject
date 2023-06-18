package com.BikkadIT.TicketBookingApp.ticketService;
import org.springframework.stereotype.Service;

import com.BikkadIT.TicketBookingApp.RequestBinding.Passenger;
import com.BikkadIT.TicketBookingApp.ResponseBinding.Ticket;

@Service
public class TicketServiceImpl implements TicketServiceI {

	@Override
	public Ticket bookTicket(Passenger psg) {
		// TODO Auto-generated method stub
		if(psg !=null) {
			Ticket tkt=new Ticket();
			tkt.setPnrNo("1234");
			tkt.setTicketStatus("Confirmed");
			tkt.setTicketPrice(855.00);
			return tkt;
		}
		return null;
	}

	
}
