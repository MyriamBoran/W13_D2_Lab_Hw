package com.codeclan.example.repositories;

import com.codeclan.example.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RaidsRepository extends JpaRepository<Raid, Long> {
}
