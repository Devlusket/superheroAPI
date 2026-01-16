package com.lucas.superhero.repositories;
import com.lucas.superhero.entities.Adventure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdventureRepository extends JpaRepository <Adventure, Integer> {

  public List<Adventure> findByCountry(String country);
  public List<Adventure> findByState(String state);
}
