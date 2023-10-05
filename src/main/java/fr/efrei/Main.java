// mettre toutes les classes dans un package
// mettre le main à l'extérieur du package mais juste à côté dans l'arbre
package fr.efrei;
import fr.efrei.Domain.Entitlement;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Entitlement entitlement = new Entitlement.Builder().setEID("111")
                .setStartDate(new Date("03/10/2023"))
                .setComments("Best lecturer not Rothman")
                .build();
        System.out.println(entitlement.toString());





    }

}