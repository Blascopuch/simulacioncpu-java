package com.piramide.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Core {

    private HashMap<Prioridad, List<Proceso>> colaProcesos;

    public Core(){
        colaProcesos = new HashMap<>();
        colaProcesos.put(Prioridad.ALTA, new ArrayList<>());
        colaProcesos.put(Prioridad.MEDIA, new ArrayList<>());
        colaProcesos.put(Prioridad.BAJA, new ArrayList<>());
    }

    public void add(Proceso p){
        if(p.getPrioridad() == Prioridad.ALTA){
            colaProcesos.get(Prioridad.ALTA).add(p);
        }
        else if(p.getPrioridad() == Prioridad.MEDIA){
            colaProcesos.get(Prioridad.MEDIA).add(p);
        }
        else if(p.getPrioridad() == Prioridad.BAJA){
            colaProcesos.get(Prioridad.BAJA).add(p);
        }
    }

    public void consume(){
        List<Proceso> procesos = null;
        if(colaProcesos.get(Prioridad.ALTA).size()>0){
            procesos = colaProcesos.get(Prioridad.ALTA);
        }
        else if(colaProcesos.get(Prioridad.MEDIA).size()>0){
            procesos = colaProcesos.get(Prioridad.MEDIA);
        }
        else if(colaProcesos.get(Prioridad.BAJA).size()>0){
            procesos = colaProcesos.get(Prioridad.BAJA);
        }
        if(procesos != null){
            Proceso proceso = procesos.get(0);
            System.out.println("Consumiendo proceso "+proceso);
            //consumo el proceso que primero entró con esa prioridad
            proceso.consume();
            //compruebo si ya no tiene ciclos pendientes
            if(proceso.getNumCiclos()==0){
                //lo elimino de la lista de ejecución
                procesos.remove(0);
            }
        }
        else{
            System.out.println("No tengo procesos pendientes");
        }
    }

    @Override
    public String toString() {
        return "Core{" +
                "colaProcesos=" + colaProcesos +
                '}';
    }
}
