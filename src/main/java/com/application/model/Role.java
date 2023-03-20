package com.application.model;
/**
 *Această clasă reprezintă o entitate JPA pentru  tabelă "roles" din baza de date. Clasa are următoarele atribute:
 *
 * id: reprezintă cheia primară a tabelului și este generată automat cu ajutorul anotării @GeneratedValue.
 *
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    private String name;
}