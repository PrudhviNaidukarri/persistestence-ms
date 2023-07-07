package com.example.persistencems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int candidate_id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @OneToMany(mappedBy = "candidateId")
    private Set<CandidateQualification> qualificationList;
    @OneToMany(mappedBy = "candidateId")
    private Set<CandidateApplication> candidateApplicationList;
    @OneToOne(targetEntity = CandidateOffer.class)
    @JoinColumn(name = "offer_id")
    private CandidateOffer candidateOffer;
}
