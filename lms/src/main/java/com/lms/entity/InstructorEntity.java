package com.lms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Instructor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InstructorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
