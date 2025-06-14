package com.mrbeans.labo.clubes.service;

import com.mrbeans.labo.clubes.dtos.ClubResponseDto;
import com.mrbeans.labo.clubes.repositories.IClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    private IClubRepository Clubrepository;

    public List<ClubResponseDto> findByCountry(String country) {
        return Clubrepository.findByCountry(country)
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

}
