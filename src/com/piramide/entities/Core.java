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

    }

}
