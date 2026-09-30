package net.anwar.ext;

import net.anwar.dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("d2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 20;
    }
}
