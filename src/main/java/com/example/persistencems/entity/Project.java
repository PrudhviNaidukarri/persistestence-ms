package com.example.persistencems.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;
    private String projectTitle;
    private String projectDescription;
    private String requiredSkills;
    private String location;
    private String startDate;
    private String endDate;
    @ManyToOne
    @JoinColumn(name = "internship_id")
    private Internship internship;
}
