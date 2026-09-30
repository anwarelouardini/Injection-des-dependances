package net.anwar.metier;

import net.anwar.dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp * Math.sin(temp) * Math.cos(temp);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
