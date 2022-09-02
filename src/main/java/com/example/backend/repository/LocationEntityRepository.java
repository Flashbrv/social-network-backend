package com.example.backend.repository;

import com.example.backend.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationEntityRepository extends JpaRepository<LocationEntity, Long> {

}
