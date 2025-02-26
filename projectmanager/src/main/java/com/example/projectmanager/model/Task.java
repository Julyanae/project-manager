package com.example.projectmanager.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private String status;
    private LocalDate dueDate;


    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
