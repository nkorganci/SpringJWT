package com.spring.JWT.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "personal")
public class Kisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank // Comes from java validation( spring boot)
    @Size(min=6, max = 120)
    private String username;

    @NotBlank
    @Size(min=6,max = 120)
    private String password;

    @NotBlank
    @Email
    private String email;
}
