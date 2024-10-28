package dev.shivam.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private String ticketNumber;
    private Date timestamp;
    private int amount;
    private Payment payment;
    private User user;
    private List<ShowSeat> showSeats;
    private TicketStatus ticketStatus;
}
