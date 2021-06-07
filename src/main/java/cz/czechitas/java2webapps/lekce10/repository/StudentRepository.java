package cz.czechitas.java2webapps.lekce10.repository;

import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 */
@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer> {
    List<Student> findByTridaOrderByPrijmeniAscJmenoAsc(Trida trida);

    Student findByIdAndTrida(Integer id, Trida trida);
}
