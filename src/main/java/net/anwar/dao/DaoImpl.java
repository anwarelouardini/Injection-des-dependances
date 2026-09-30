package net.anwar.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de donnee");
        return 30;
    }
}
