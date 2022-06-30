package com.example.sfgpetclinic.repositories;

import com.example.sfgpetclinic.Model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Integer> {

    Owner findByLastName(String name);

    List<Owner> findAllByLastName(String name);
}
