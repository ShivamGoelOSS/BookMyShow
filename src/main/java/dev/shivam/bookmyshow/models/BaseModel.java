package dev.shivam.bookmyshow.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
/*
    MappedSuperClass Annotation
    - It does not create a table for the parent class.
    - All the attributes of the parent class will be present as columns
      in the child class tables.
*/
@MappedSuperclass
public class BaseModel {
    @Id // Identity/PrimaryKey column
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremented 
    private Long id;

    //Auditing Attributes
    private Date createdAt;
    private Date lastModifiedAt;
}
