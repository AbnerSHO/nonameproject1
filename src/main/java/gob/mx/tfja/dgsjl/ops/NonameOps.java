/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.mx.tfja.dgsjl.ops;

import gob.mx.tfja.dgsjl.dao.BDSicjDao;
import gob.mx.tfja.dgsjl.dao.exception.BdSicDaoException;
import gob.mx.tfja.dgsjl.dto.ClacHost;
import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 
 * @created 28-06-2018 
 * @author aosanchez
 */
@Service("NonameOps")
@Scope("prototype")
public class NonameOps {
    private static final Log logger = LogFactory.getLog(NonameOps.class);
    
    @Autowired
    private BDSicjDao dao;
    
    /**
     * Metodo que devuelve todos los host en la tabla CLAR_HOST
     * @return 
     * @throws gob.mx.tfja.dgsjl.dao.exception.BdSicDaoException 
     */
    public ArrayList<ClacHost> obtenTodosHost() throws BdSicDaoException{
        logger.info("Obteniendo hosts");
        ArrayList<ClacHost> hosts = dao.getHosts();
        logger.info("Se obtubieron " + hosts.size() + " hosts");
        return hosts;
    }
    

}
