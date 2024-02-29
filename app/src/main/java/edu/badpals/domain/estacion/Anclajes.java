package edu.badpals.domain.estacion;
import edu.badpals.domain.bicicleta.Movil;

public class Anclajes {

    private Short numAnclajes = 0;
    private final Anclaje[] anclajes;

    Anclajes(short numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        for (int i = 0; i < numAnclajes; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    public void setNumAnclajes(short numAnclajes) {
        this.numAnclajes = numAnclajes;
    }

    public Short getNumAnclajes() {
        return numAnclajes;
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes() {
        return this.numAnclajes;
    }

    void ocuparAnclaje(int posicion, Movil bici) {
        this.anclajes[posicion].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion){
        return this.anclajes[posicion].isOcupado();
    }

    void liberarAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
    }

    Movil getBiciAt(int posicion) {
        return this.anclajes[posicion].getBici();
    }

    @Override
    public String toString() {
        return "Numero de anclajes" + Short.toString(getNumAnclajes());
    }
}
