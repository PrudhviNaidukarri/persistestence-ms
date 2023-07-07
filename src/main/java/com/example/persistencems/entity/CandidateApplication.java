package com.example.persistencems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateApplication {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int applicationId;
    @ManyToOne(targetEntity = Candidate.class)
    @JoinColumn(name = "candidate_id")
    private int candidateId;    // foreign key
    @Temporal(TemporalType.DATE)
    private Date applicationDate;
    private String applicationStatus;

    @ManyToOne
    @JoinColumn(name = "internship_id")
    private Internship internship;  // foreign key
}
