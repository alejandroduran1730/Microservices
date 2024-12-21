package com.microservice.student.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name") // Used to differentiate the syntax from Java and SQL
    private String lastName;
    private String mail;
    @Column(name = "course_id")
    private Long courseId;
}
