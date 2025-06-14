package com.mrbeans.labo.clubes.service;

import com.mrbeans.labo.clubes.dtos.CreateClubDto;
import com.mrbeans.labo.clubes.entities.ClubEntity;
import com.mrbeans.labo.clubes.repositories.IClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    private IClubRepository clubRepository;

    public void createClub(CreateClubDto createClubDto) {

        ClubEntity clubEntity = new ClubEntity();
        clubEntity.setName(createClubDto.getName());
        clubEntity.setCoach(createClubDto.getCoach());
        clubEntity.setCountry(createClubDto.getCountry());
        clubEntity.setTitles(createClubDto.getTitles());

        clubRepository.save(clubEntity);
    }



}
