package com.spring.JWT.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "kisi_roller", joinColumns = @JoinColumn(name = "kisi_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<KisiRole> roller = new HashSet<>();

}
