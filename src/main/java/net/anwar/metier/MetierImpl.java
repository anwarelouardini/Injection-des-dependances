package net.anwar.metier;

import net.anwar.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{
    @Autowired
    @Qualifier("d2")
    private IDao dao;

    public MetierImpl(@Qualifier("d2") IDao dao) {
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
