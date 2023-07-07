package com.example.persistencems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateQualification {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int qualificationId;
    private String qualificationName;
    private String institutionName;
    private String completionYear;

    @ManyToOne(targetEntity = Candidate.class)
    @JoinColumn(name = "candidate_id")
    private int candidateId;

}
