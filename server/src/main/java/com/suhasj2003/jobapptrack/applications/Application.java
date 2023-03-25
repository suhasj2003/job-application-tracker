package com.suhasj2003.jobapptrack.applications;

import java.sql.Timestamp;
import java.time.Instant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "application")
public class Application {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long applicationID;

    private String company;
    private String title;
    private String jobID;
    private Timestamp universalTimestamp;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "userID")
    private Long userID;


    public Application(Long applicationID, String company, String title, String jobID) {
        this.applicationID = applicationID;
        this.company = company;
        this.title = title;
        this.jobID = jobID;

        this.universalTimestamp = Timestamp.from(Instant.now());
    }

    public Application(String company, String title, String jobID) {
        this.company = company;
        this.title = title;
        this.jobID = jobID;

        this.universalTimestamp = Timestamp.from(Instant.now());
    }

    public Application() {
    }

    public Long getApplicationID() {
        return this.applicationID;
    }

    public void setApplicationID(Long applicationID) {
        this.applicationID = applicationID;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobID() {
        return this.jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public Timestamp getUniversalTimestamp() {
        return this.universalTimestamp;
    }

    public void setUniversalTimestamp(Timestamp universalTimestamp) {
        this.universalTimestamp = universalTimestamp;
    }


}