package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Rodic;
import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.repository.RodicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RodicService {
    private final RodicRepository rodicRepository;

    @Autowired
    public RodicService(RodicRepository rodicRepository) {
        this.rodicRepository = rodicRepository;
    }

    public List<Rodic> seznamRodicu(Student student) {
        return this.rodicRepository.findAllByDetiContainsOrderByPrijmeniAscJmenoAsc(student);
    }
}
