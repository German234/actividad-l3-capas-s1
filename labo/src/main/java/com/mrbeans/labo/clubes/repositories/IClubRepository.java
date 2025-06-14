package com.mrbeans.labo.clubes.repositories;

import com.mrbeans.labo.clubes.entities.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClubRepository extends JpaRepository<ClubEntity, Long> {
    List<ClubEntity> findByCountry(String country);
}
