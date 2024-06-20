package uy.edu.ctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uy.edu.ctc.entity.ElectrodomesticoLineaBlanca;
import uy.edu.ctc.repository.ElectrodomesticoLineaBlancaRepository;

import java.util.Optional;


@Service
public class ElectrodomesticoLineaBlancaServiceImpl implements ElectrodomesticoLineaBlancaService{
    @Autowired
    private ElectrodomesticoLineaBlancaRepository electrodomesticoRepository;

    @Override
    public Iterable<ElectrodomesticoLineaBlanca> findAll() {
        return electrodomesticoRepository.findAll();
    }

    @Override
    public Page<ElectrodomesticoLineaBlanca> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<ElectrodomesticoLineaBlanca> findById(Long id) {
        return electrodomesticoRepository.findById(id);
    }

    @Override
    public ElectrodomesticoLineaBlanca save(ElectrodomesticoLineaBlanca electrodomestico) {
        return electrodomesticoRepository.save(electrodomestico);
    }

    @Override
    public void deleteById(Long id) {
        electrodomesticoRepository.deleteById(id);
    }
}
