package com.codeclan.example.repositories;

import com.codeclan.example.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ShipRepository extends JpaRepository<Ship, Long> {
}
