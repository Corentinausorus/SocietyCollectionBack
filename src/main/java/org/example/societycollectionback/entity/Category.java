package org.example.societycollectionback.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id_category")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "asso_boardgame_category",
            joinColumns = @JoinColumn(name = "id_category"),
            inverseJoinColumns = @JoinColumn(name = "id_boardgame")
    )
    private Set<BoardGame> boardGames = new HashSet<>();
}
