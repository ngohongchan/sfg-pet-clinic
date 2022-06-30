package com.example.sfgpetclinic.repositories;

import com.example.sfgpetclinic.Model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Integer> {
}
