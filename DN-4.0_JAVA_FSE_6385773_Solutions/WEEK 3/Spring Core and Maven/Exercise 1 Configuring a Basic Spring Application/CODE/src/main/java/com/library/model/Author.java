package com.library.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Author extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nationality;
}