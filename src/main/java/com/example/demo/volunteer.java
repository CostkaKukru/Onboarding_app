package com.example.demo;

import jakarta.persistence.*;

@Entity
public class volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String availability;
    private String skills;
    private int hoursVolunteered;


    public volunteer() {
    }

    public volunteer(String firstName, String lastName, String email, String availability, String skills, int hoursVolunteered) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.availability = availability;
        this.skills = skills;
        this.hoursVolunteered = hoursVolunteered;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getHoursVolunteered() {
        return hoursVolunteered;
    }

    public void setHoursVolunteered(int hoursVolunteered) {
        this.hoursVolunteered = hoursVolunteered;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", availability='" + availability + '\'' +
                ", skills='" + skills + '\'' +
                ", hoursVolunteered=" + hoursVolunteered +
                '}';
    }
}
