package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> seznamStudentuTridy(Trida trida) {
        return this.studentRepository.findByTridaOrderByPrijmeniAscJmenoAsc(trida);
    }

    public Student detailStudenta(Integer id, Trida trida) {
        return this.studentRepository.findByIdAndTrida(id, trida);
    }

}
