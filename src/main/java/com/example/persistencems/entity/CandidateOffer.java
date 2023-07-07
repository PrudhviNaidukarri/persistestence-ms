package com.example.persistencems.entity;

import jakarta.persistence.*;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class CandidateOffer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int offerId;
    private String offerStatus;
    @Temporal(TemporalType.DATE)
    private Date offerAcceptanceDate;
    @OneToOne(targetEntity = CandidateApplication.class)
    @JoinColumn(name = "candidate_id")
    private Candidate candidate; // foreign key

}
