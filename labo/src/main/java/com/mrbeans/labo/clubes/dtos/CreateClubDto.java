package com.mrbeans.labo.clubes.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateClubDto {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Country is required")
    private String country;

    @NotBlank(message = "Coach is required")
    private String coach;

    @NotBlank(message = "Titles is required")
    private int titles;

}
