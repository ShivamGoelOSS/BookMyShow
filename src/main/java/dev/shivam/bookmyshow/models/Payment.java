package dev.shivam.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}
