package com.unaux.dairo.api.domain.hairsalon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "hair_salon")
public class HairSalon {

  public HairSalon(@Valid HairSalonCreateDto hairSalonCreateDto) {
    setName(hairSalonCreateDto.name());
    setPhone(hairSalonCreateDto.phone());
    setAddress(hairSalonCreateDto.address());
    setNeighborhood(hairSalonCreateDto.neighborhood());
    setCity(hairSalonCreateDto.city());
    setCountry(hairSalonCreateDto.country());
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String phone;
  private String address;
  private String neighborhood;
  private String city;
  private String country;
}