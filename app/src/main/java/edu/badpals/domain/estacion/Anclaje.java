package edu.badpals.domain.estacion;

import edu.badpals.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado = false;

    private Movil bici;

    Anclaje() {};

    boolean isOcupado(){
        return this.ocupado;
    }

    Movil getBici(){
        return this.bici;
    }

    void anclarBici(Movil bici) {
        this.ocupado = true;
    }

    void liberarBici(){
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "Estado anclaje:" + Boolean.toString(isOcupado());
    }
}
