package com.piramide;

import com.piramide.application.BuilderProceso;
import com.piramide.entities.Core;
import com.piramide.entities.Proceso;

public class Main {

    public static void main(String[] args) {

        Core core1 = new Core();

        for (int i = 0; i < 500; i++) {
            if(i%2 == 0){
                Proceso p = BuilderProceso.generaProceso();
                core1.add(p);
            }
            System.out.println("Ejecutando "+i+":");
            System.out.println(core1);
            core1.consume();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
