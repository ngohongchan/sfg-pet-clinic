package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.Model.Speciality;
import com.example.sfgpetclinic.services.SpecialityService;

import java.util.Set;

public class SpecialityMapService extends AbstractMapService<Speciality, Integer> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Integer id) {
        return super.findById(id);
    }

    @Override
    void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }
}
