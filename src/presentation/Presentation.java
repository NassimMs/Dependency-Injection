package presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {

    public static void main(String[] args) {
        /*
            Injection des dépendances par
            Instanciation statique => new
         */
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        // Injection de dependance en utilisant le setter
        metier.setDao(dao);
        System.out.println("Resultats :"+metier.calcul());
    }
}
