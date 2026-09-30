package net.anwar.pres;

import net.anwar.dao.IDao;
import net.anwar.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();

        Class cDao = Class.forName(daoClassName);
        Class cMetier = Class.forName(metierClassName);

        IDao dao = (IDao) cDao.newInstance();
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);


        System.out.println(metier.calcul());

    }
}
