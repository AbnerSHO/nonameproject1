/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.mx.tfja.dgsjl.dao.imp;

import gob.mx.tfja.dgsjl.dao.BDSicjDao;
import gob.mx.tfja.dgsjl.dao.exception.BdSicDaoException;
import gob.mx.tfja.dgsjl.dto.ClacHost;
import gob.mx.tfja.dgsjl.mappers.ClacHostsMapper;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @created 28-06-2018 
 * @author aosanchez
 */
@Repository("BDSicjDaoJDBCTImp")
public class BDSicjDaoJDBCTImp implements BDSicjDao{
    private static final Log logger = LogFactory.getLog(BDSicjDaoJDBCTImp.class);
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public void setDataSource(DataSource dataSourceSqlite) {
        this.jdbcTemplate = new JdbcTemplate(dataSourceSqlite);
    }

    @Override
    public ClacHost getHostbyCve(int cveRegion, int cveSala) throws BdSicDaoException{
        
         ClacHost host = new ClacHost();
           String queryString = "SELECT * FROM CLAC_HOST CH INNER JOIN CLAR_HOST_SALAS CHS ON CH.CVE_HOST = CHS.CVE_HOST INNER JOIN CLAC_SALAS CS ON CHS.ID_SALA = CS.id_sala WHERE CH.ACTV_HOST = 1 AND CS.CVE_REGION = ? AND CS.CVE_SALA = ? ";
        try{
            host = this.jdbcTemplate.queryForObject(
			queryString, new Object[] { cveRegion, cveSala }, new ClacHostsMapper());
        }catch(EmptyResultDataAccessException e)
        {
          logger.info("No se encontro en bd el host para la region:" + cveRegion + " sala: " + cveSala);   
        }
	return host;
    }
    
    @Override
    public ArrayList<ClacHost> getHosts() throws BdSicDaoException{
        ArrayList<ClacHost> hosts = new ArrayList<ClacHost>();
           String queryString = "SELECT CVE_HOST, NOMB_HOST, ACTV_HOST, KEY_HOST, ESTATUS_HOST, TP_HST_DB FROM CLAC_HOST";
        try{
            hosts = new ArrayList(this.jdbcTemplate.query(queryString, new ClacHostsMapper()));
        }catch(EmptyResultDataAccessException e)
        {
          logger.info("No se encontro en bd los host");   
        }
	return hosts;
    }
}
