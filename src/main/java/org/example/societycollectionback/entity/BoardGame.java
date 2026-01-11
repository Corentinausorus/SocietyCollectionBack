package org.example.societycollectionback.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
@Entity
@Table(name = "boardgame")
public class BoardGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToMany(mappedBy = "boardgames")
    private Set<Collection> collections = new HashSet<>();
}
