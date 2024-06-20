package uy.edu.ctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.edu.ctc.entity.ElectrodomesticoUsoPersonal;

@Repository
public interface ElectrodomesticoUsoPersonalRepository extends JpaRepository<ElectrodomesticoUsoPersonal,Long> {
}
