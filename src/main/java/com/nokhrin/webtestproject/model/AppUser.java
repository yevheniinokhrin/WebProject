package com.nokhrin.webtestproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    private boolean isEnabled;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppUserRole> appUserRoles = new HashSet<>();
}
