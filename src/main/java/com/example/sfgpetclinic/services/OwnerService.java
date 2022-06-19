package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.Model.Owner;

public interface OwnerService extends CrudService<Owner, Integer> {
    Owner findByLastName(String lastName);
}
