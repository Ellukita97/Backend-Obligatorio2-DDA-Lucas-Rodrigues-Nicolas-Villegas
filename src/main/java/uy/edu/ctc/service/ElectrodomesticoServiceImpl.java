package uy.edu.ctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uy.edu.ctc.entity.Electrodomestico;
import uy.edu.ctc.repository.ElectrodomesticoRepository;

import java.util.Optional;

@Service
public class ElectrodomesticoServiceImpl implements ElectrodomesticoService {

    @Autowired
    private ElectrodomesticoRepository electrodomesticoRepository;

    @Override
    @Transactional(readOnly = true)

    public Iterable<Electrodomestico> findAll() {
        return electrodomesticoRepository.findAll();
    }


    @Override
    @Transactional(readOnly=true)
    public Page<Electrodomestico> findAll(Pageable pageable) {
        return null;
    }

    @Override
    @Transactional(readOnly=true)
    public Optional<Electrodomestico> findById(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public Electrodomestico save(Electrodomestico elec) {
        return electrodomesticoRepository.save(elec);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        electrodomesticoRepository.deleteById(id);
    }
}
