package uy.edu.ctc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ElectrodomesticosLineaBlanca")
public class ElectrodomesticoLineaBlanca extends Electrodomestico{

    private double capacidad;


    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
