package uy.edu.ctc.service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uy.edu.ctc.entity.Electrodomestico;
import java.util.Optional;

public interface ElectrodomesticoService {
    public Iterable<Electrodomestico> findAll();
    public Page<Electrodomestico> findAll(Pageable pageable);
    public Optional<Electrodomestico> findById(Long id);
    public Electrodomestico save(Electrodomestico electrodomestico);
    public void deleteById(Long id);
}
