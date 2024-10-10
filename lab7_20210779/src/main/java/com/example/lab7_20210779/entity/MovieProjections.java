package com.example.lab7_20210779.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "movieprojections")
public class MovieProjections {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "movieId", nullable = true)
    private Movies movies;

    @ManyToOne
    @JoinColumn(name = "roomId", nullable = true)
    private Rooms rooms;

    @Column(name = "projectionDate", nullable = false)
    private LocalDateTime projectionDate;

    @Column(name = "availableSeats", nullable = false)
    private Integer availableSeats;
}
