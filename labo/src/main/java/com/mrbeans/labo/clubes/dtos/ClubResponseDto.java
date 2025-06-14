package com.mrbeans.labo.clubes.dtos;

import lombok.Data;

@Data
public class ClubResponseDto {
    private Long id;
    private String name;
    private String country;
    private String coach;
    private int titles;
}
