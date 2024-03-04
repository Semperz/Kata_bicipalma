package edu.badpals.domain.estacion;

import edu.badpals.domain.bicicleta.Movil;
import edu.badpals.domain.tarjetausuario.Autenticacion;

public class Estacion {

    private final int id;
    private final String direccion;

    private Anclajes anclajes;

    public Estacion(int id, String direccion, Integer numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }


    @Override
    public String toString() {
        return  "Id=" + id + '\'' +
                "Direccion: " + direccion + '\'' +
                "Anclajes: " + anclajes;
    }

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    public void consultarEstacion() {
        System.out.println(this);
    }

    public int anclajesLibres() {
        int numAnclajesLibres = 0;
        for (Anclaje anclaje : anclajes()) {
            numAnclajesLibres = anclaje.isOcupado() ? numAnclajesLibres : ++numAnclajesLibres;
        }
        return numAnclajesLibres;
    }

    public void anclarBicicleta(Movil bici){
        int posicion = 0;
        int numAnclaje = posicion + 1;
        for (Anclaje anclaje : anclajes()) {
            if (!anclaje.isOcupado()) {
                anclajes.ocuparAnclaje(posicion, bici);
                mostrarAnclaje(numAnclaje, bici);
            }else{
                posicion++;
            }
            numAnclaje++;
        }
    }
    public boolean leerTarjetaUsuario(Autenticacion tarjetaUsuario){
        return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjetaUsuario){
        if (leerTarjetaUsuario(tarjetaUsuario)){
            boolean biciRetirada = false;
            while (!biciRetirada){
            }
        }
    }

    private void mostrarAnclaje(int numeroAnclaje, Movil bici) {
        System.out.println("bicicleta " + bici.getId()
                + " anclada en el anclaje " + numeroAnclaje);
    }
}