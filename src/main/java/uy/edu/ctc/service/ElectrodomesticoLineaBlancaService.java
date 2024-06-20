package uy.edu.ctc.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uy.edu.ctc.entity.ElectrodomesticoLineaBlanca;

import java.util.Optional;

public interface ElectrodomesticoLineaBlancaService {
    public Iterable<ElectrodomesticoLineaBlanca> findAll();
    public Page<ElectrodomesticoLineaBlanca> findAll(Pageable pageable);
    public Optional<ElectrodomesticoLineaBlanca> findById(Long id);
    public ElectrodomesticoLineaBlanca save(ElectrodomesticoLineaBlanca electrodomestico);
    public void deleteById(Long id);
}
