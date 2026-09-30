package net.anwar.dao;

import org.springframework.stereotype.Repository;

@Repository("d")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de donnee");
        return 30;
    }
}
