package com.workshop.workshop_server.workshops;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Workshop {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String subject;
    private String description;
    private Long lead_id;

    public Workshop() {
        this.name = "Workshop Name";
        this.subject = "None";
        this.description = "None";
        this.lead_id = -1L;
    }

    public Workshop(String name, String subject, String description, Long lead_id) {
        this.name = name;
        this.subject = subject;
        this.description = description;
        this.lead_id = lead_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getDescription() {
        return this.description;
    }

    public Long getLeadId() {
        return this.lead_id;
    }
}
