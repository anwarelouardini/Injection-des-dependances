package net.anwar.ext;

import net.anwar.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 20;
    }
}
