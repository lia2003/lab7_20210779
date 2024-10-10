package com.example.lab7_20210779.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "roomseats")
public class RoomSeats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "roomId", nullable = true)
    private Rooms rooms;

    @Column(name = "seatNumber", length = 10, nullable = false)
    private String seatNumber;

    @Column(name = "rowNumber", length = 2, nullable = false)
    private String rowNumber;

    @Column(name = "isAvailable", nullable = false)
    private Boolean isAvailable;
}
