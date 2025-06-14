package com.mrbeans.labo.clubes.controller;

import com.mrbeans.labo.clubes.dtos.ClubResponseDto;
import com.mrbeans.labo.clubes.dtos.CreateClubDto;
import com.mrbeans.labo.clubes.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {
    @Autowired
    private ClubService clubService;

    @PostMapping
    public ResponseEntity<Object> createClub(@RequestBody CreateClubDto createClubDto) {
        clubService.createClub(createClubDto);
        return ResponseEntity.ok("Created club successfully");
    }

    @GetMapping("country/{country}")
    public List<ClubResponseDto> getClubsByCountry(@PathVariable String country) {
        return clubService.findByCountry(country);
    }

    @GetMapping("search")
    public List<ClubResponseDto> getClubsByName(@RequestParam(value = "name", defaultValue = "Real Madrid") String name) {
        return clubService.findByName(name);
    }
}
