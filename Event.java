package com.example.ngonew;

public class Event {
    private String email;
    private String description;
    private String eventDescription;
    private String ngoName;

    public Event() {
        // Default constructor required for Firebase
    }

    public Event(String email, String description, String eventDescription, String ngoName) {
        this.email = email;
        this.description = description;
        this.eventDescription = eventDescription;
        this.ngoName = ngoName;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getNgoName() {
        return ngoName;
    }
}
