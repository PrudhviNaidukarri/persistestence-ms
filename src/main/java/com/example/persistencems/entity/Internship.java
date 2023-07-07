package com.example.persistencems.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int internshipId;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private String internshipStatus;

    @OneToMany(mappedBy = "internship")
    private Set<CandidateApplication> applications;

    @OneToMany(mappedBy = "internship")
    private Set<Project> projects;
}
