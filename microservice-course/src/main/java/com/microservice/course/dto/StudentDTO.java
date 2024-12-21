package com.microservice.course.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String name;
    private String lastName;
    private String mail;
    private Long courseId;
}
