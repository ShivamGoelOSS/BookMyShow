package dev.shivam.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //Creates a table
public class Seat extends BaseModel{
    private String name;
    private int row;
    private int col;
    private SeatType seatType;
}
