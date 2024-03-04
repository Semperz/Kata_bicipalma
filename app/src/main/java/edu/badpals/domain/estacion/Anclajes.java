package edu.badpals.domain.estacion;
import edu.badpals.domain.bicicleta.Movil;
import java.util.concurrent.ThreadLocalRandom;

public class Anclajes {

    private Integer numAnclajes = 0;
    private final Anclaje[] anclajes;

    Anclajes(Integer numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        for (int i = 0; i < numAnclajes; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    public void setNumAnclajes(Integer numAnclajes) {
        this.numAnclajes = numAnclajes;
    }

    public Integer getNumAnclajes() {
        return this.numAnclajes;
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

    int seleccionarAnlcaje(){
        Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, numAnclajes());
        return idAnclaje;
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + Integer.toString(getNumAnclajes());
    }
}
