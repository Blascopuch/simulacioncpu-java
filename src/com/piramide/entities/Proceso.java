package com.piramide.entities;

public class Proceso {

    private Integer PID;
    private String nombre;
    private Prioridad prioridad;
    private Integer numCiclos;

    public Proceso(Integer PID, String nombre, Prioridad prioridad, Integer numCiclos) {
        this.PID = PID;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.numCiclos = numCiclos;
    }

    public Integer getPID() {
        return PID;
    }

    public String getNombre() {
        return nombre;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public Integer getNumCiclos() {
        return numCiclos;
    }

    public void consume(){
        this.numCiclos--;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "PID=" + PID +
                ", nombre='" + nombre + '\'' +
                ", prioridad=" + prioridad +
                ", numCiclos=" + numCiclos +
                '}';
    }
}
