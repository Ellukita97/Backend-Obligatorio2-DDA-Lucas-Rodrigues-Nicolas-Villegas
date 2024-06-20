package uy.edu.ctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.edu.ctc.entity.ElectrodomesticoLineaBlanca;

@Repository
public interface ElectrodomesticoLineaBlancaRepository extends JpaRepository<ElectrodomesticoLineaBlanca, Long> {
}
