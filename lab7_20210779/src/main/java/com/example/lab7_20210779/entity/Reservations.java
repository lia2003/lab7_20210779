package com.example.lab7_20210779.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = true)
    private Users users;

    @ManyToOne
    @JoinColumn(name = "movieProjectionId", nullable = true)
    private MovieProjections movieProjections;

    @ManyToOne
    @JoinColumn(name = "roomSeatId", nullable = true)
    private RoomSeats roomSeats;

    @Column(name = "startDatetime", nullable = false)
    private LocalDateTime startDatetime;

    @Column(name = "endDatetime", nullable = false)
    private LocalDateTime endDatetime;
}
