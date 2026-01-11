package org.example.societycollectionback.entity;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "boardgame")
public class BoardGame {
    @Id
    @Column(name = "id_boardgame")
    private Long id;

    private String name;
    private String description;

    @Column(name = "min_players")
    private Integer minPlayers;

    @Column(name = "max_players")
    private Integer maxPlayers;

    @Column(name = "playing_time")
    private Integer playingTime;

    @Column(name = "year_published")
    private Integer yearPublished;

    private String notes;
    private Integer popularity;

    @ManyToMany
    @JoinTable(
            name = "asso_boardgame_category",
            joinColumns = @JoinColumn(name = "id_boardgame"),
            inverseJoinColumns = @JoinColumn(name = "id_category")
    )
    private Set<Category> categories = new HashSet<>();
}
