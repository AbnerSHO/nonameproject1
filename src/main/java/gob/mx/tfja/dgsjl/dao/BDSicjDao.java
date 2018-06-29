package gob.mx.tfja.dgsjl.dao;

import gob.mx.tfja.dgsjl.dao.exception.BdSicDaoException;
import gob.mx.tfja.dgsjl.dto.ClacHost;
import java.util.ArrayList;

/**
 * 
 * @created 28-06-2018 
 * @author aosanchez
 */
public interface BDSicjDao {
    public ClacHost getHostbyCve(int cveRegion, int cveSala)throws BdSicDaoException;
    public ArrayList<ClacHost> getHosts()throws BdSicDaoException;
}
