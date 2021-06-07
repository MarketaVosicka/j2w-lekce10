package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TridaService {
    private final TridaRepository tridaRepository;

    @Autowired
    public TridaService(TridaRepository tridaRepository) {
        this.tridaRepository = tridaRepository;
    }

    public List<Trida> seznamTrid() {
        return this.tridaRepository.findByOrderByNazevAsc();
    }

    public Trida detailTridy(String tridaNazev) {
        return this.tridaRepository.findByNazev(tridaNazev);
    }
}
