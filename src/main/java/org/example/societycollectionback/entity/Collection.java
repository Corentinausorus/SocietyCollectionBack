package org.example.societycollectionback.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "collection")
@Setter
@Getter
public class Collection {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_collection")
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToMany
    @JoinTable(
            name = "asso_boardgame_collection",
            joinColumns = @JoinColumn(name = "id_collection"),
            inverseJoinColumns = @JoinColumn(name = "id_boardgame")
    )
    private Set<BoardGame> boardgames = new HashSet<>();
}
