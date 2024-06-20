package uy.edu.ctc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ElectrodomesticosUsoPersonal")
public class ElectrodomesticoUsoPersonal extends Electrodomestico{

    private int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
