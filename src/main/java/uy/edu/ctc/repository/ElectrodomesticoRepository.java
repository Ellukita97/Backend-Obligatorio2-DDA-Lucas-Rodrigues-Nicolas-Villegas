package uy.edu.ctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.edu.ctc.entity.Electrodomestico;


@Repository
public interface ElectrodomesticoRepository extends JpaRepository<Electrodomestico, Long> {
}
