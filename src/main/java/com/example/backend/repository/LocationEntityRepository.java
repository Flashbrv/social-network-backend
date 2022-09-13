package com.example.backend.repository;

import com.example.backend.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationEntityRepository extends JpaRepository<Location, Long> {

}
