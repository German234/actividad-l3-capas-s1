package com.mrbeans.labo.clubes.service;

import com.mrbeans.labo.clubes.dtos.ClubResponseDto;
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

    public List<ClubResponseDto> findByCountry(String country) {
        return clubRepository.findByCountry(country)
                .stream()
                .map(club -> {
                    ClubResponseDto ClubResponseDto = new ClubResponseDto();
                    ClubResponseDto.setId(club.getId());
                    ClubResponseDto.setName(club.getName());
                    ClubResponseDto.setCountry(club.getCountry());
                    ClubResponseDto.setCoach(club.getCoach());
                    ClubResponseDto.setTitles(club.getTitles());

                    return ClubResponseDto;
                }).toList();
    }

    public List<ClubResponseDto> findByName(String name) {
        return clubRepository.findByName(name)
                .stream()
                .map(club -> {
                    ClubResponseDto ClubResponseDto = new ClubResponseDto();
                    ClubResponseDto.setId(club.getId());
                    ClubResponseDto.setName(club.getName());
                    ClubResponseDto.setCountry(club.getCountry());
                    ClubResponseDto.setCoach(club.getCoach());
                    ClubResponseDto.setTitles(club.getTitles());

                    return ClubResponseDto;
                }).toList();
    }

    public void createClub(CreateClubDto createClubDto) {

        ClubEntity clubEntity = new ClubEntity();
        clubEntity.setName(createClubDto.getName());
        clubEntity.setCoach(createClubDto.getCoach());
        clubEntity.setCountry(createClubDto.getCountry());
        clubEntity.setTitles(createClubDto.getTitles());

        clubRepository.save(clubEntity);
    }





}
