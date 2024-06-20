package uy.edu.ctc.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uy.edu.ctc.entity.Electrodomestico;
import uy.edu.ctc.entity.ElectrodomesticoUsoPersonal;

import java.util.Optional;

public interface ElectrodomesticoUsoPersonalService {
    public Iterable<ElectrodomesticoUsoPersonal> findAll();
    public Page<ElectrodomesticoUsoPersonal> findAll(Pageable pageable);
    public Optional<ElectrodomesticoUsoPersonal> findById(Long id);
    public ElectrodomesticoUsoPersonal save(ElectrodomesticoUsoPersonal electrodomestico);
    public void deleteById(Long id);
}
