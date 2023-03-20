package com.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "admins")
/**
 * Această clasă reprezintă o entitate în cadrul aplicației,
 * care va fi mapată într-o tabelă din baza de date.
 * Ea este folosită pentru a reprezenta obiecte de tip Admin,
 * care conțin informații despre un administrator în aplicație.
 * Clasa Admin are o relație de tip many-to-many cu clasa Role,
 * reprezentând relația dintre administratori și rolurile acestora în cadrul aplicației.
 */
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long id;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "admins_roles", joinColumns = @JoinColumn(name = "admin_id", referencedColumnName = "admin_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
    private Collection<Role> roles;
}