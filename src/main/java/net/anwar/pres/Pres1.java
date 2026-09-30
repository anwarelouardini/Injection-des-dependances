package net.anwar.pres;

import net.anwar.dao.DaoImpl;
import net.anwar.metier.MetierImpl;

public class Pres1 {
    static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());
    }
}
