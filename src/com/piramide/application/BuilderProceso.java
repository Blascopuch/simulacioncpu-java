package com.piramide.application;

import com.piramide.entities.Prioridad;
import com.piramide.entities.Proceso;

import java.util.Random;

public class BuilderProceso {

    public static Proceso generaProceso(){
        Random random = new Random();
        int pNum = random.nextInt(3);
        if(pNum == 0){
            return new Proceso(1000,"Chrome", Prioridad.MEDIA,3);
        }
        else if(pNum == 1){
            return new Proceso(1001,"Discord", Prioridad.ALTA,1);
        }
        else {
            return new Proceso(50,"Actualización SO", Prioridad.BAJA,5);
        }
    }

}
