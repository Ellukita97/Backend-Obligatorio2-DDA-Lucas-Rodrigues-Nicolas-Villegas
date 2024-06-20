package uy.edu.ctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uy.edu.ctc.entity.ElectrodomesticoUsoPersonal;
import uy.edu.ctc.repository.ElectrodomesticoUsoPersonalRepository;

import java.util.Optional;

@Service
public class ElectrodomesticoUsoPersonalServiceImpl implements ElectrodomesticoUsoPersonalService{
    @Autowired
    private ElectrodomesticoUsoPersonalRepository electrodomesticoRepository;

    @Override
    public Iterable<ElectrodomesticoUsoPersonal> findAll() {
        return electrodomesticoRepository.findAll();
    }

    @Override
    public Page<ElectrodomesticoUsoPersonal> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<ElectrodomesticoUsoPersonal> findById(Long id) {
        return electrodomesticoRepository.findById(id);
    }

    @Override
    public ElectrodomesticoUsoPersonal save(ElectrodomesticoUsoPersonal electrodomestico) {
        return electrodomesticoRepository.save(electrodomestico);
    }

    @Override
    public void deleteById(Long id) {
        electrodomesticoRepository.deleteById(id);
    }
}
