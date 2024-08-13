package com.max.quizspring.model;




import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventName;
    private LocalDate eventDate;
    private String eventLocation;
    
    @Column(length = 1000)
    private String eventRequirements;
    
    @Column(length = 1000)
    private String desiredServices;
    private String message;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
    public String getEventRequirements() {
        return eventRequirements;
    }
    public void setEventRequirements(String eventRequirements) {
        this.eventRequirements = eventRequirements;
    }
    public String getDesiredServices() {
        return desiredServices;
    }
    public void setDesiredServices(String desiredServices) {
        this.desiredServices = desiredServices;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    
}