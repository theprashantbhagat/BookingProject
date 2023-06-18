package com.BikkadIT.TicketBookingApp.ResponseBinding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {

	private String pnrNo;
	private String TicketStatus;
	private Double TicketPrice;
	public final String getPnrNo() {
		return pnrNo;
	}
	public final void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	public final String getTicketStatus() {
		return TicketStatus;
	}
	public final void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}
	public final Double getTicketPrice() {
		return TicketPrice;
	}
	public final void setTicketPrice(Double ticketPrice) {
		TicketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Ticket [pnrNo=" + pnrNo + ", TicketStatus=" + TicketStatus + ", TicketPrice=" + TicketPrice + "]";
	}
	
	
}
