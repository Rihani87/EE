package com.ourProject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {
	private int ticketNumber;
	private int seatNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String hallName;
	private String partyName;
	private BigDecimal Price;
	private String paymentMethod;
	private LocalDate date;
	private LocalTime time;

}
