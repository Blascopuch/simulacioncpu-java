package com.piramide;

import com.piramide.entities.Core;
import com.piramide.entities.Prioridad;
import com.piramide.entities.Proceso;

public class Main {

    public static void main(String[] args) {

        Core core1 = new Core();
        Proceso p1 = new Proceso(1000,"Chrome", Prioridad.MEDIA,3);
        Proceso p2 = new Proceso(1001,"Discord", Prioridad.ALTA,1);
        Proceso p3 = new Proceso(50,"Actualización SO", Prioridad.BAJA,5);

        core1.add(p1);
        core1.add(p2);
        core1.add(p3);

    }
}
