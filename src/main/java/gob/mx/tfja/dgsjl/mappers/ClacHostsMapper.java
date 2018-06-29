/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.mx.tfja.dgsjl.mappers;

import gob.mx.tfja.dgsjl.dto.ClacHost;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * Esta clase se encarga de proveer los métodos necesarios para 
 * 
 */
public class ClacHostsMapper implements RowMapper<ClacHost>{
    @Override
    public ClacHost mapRow(ResultSet rs, int rowNum) throws SQLException {
        ClacHost host = new ClacHost();
            host.setCve_host(rs.getInt("CVE_HOST"));
            host.setNomb_host(rs.getString("NOMB_HOST"));
            host.setActv_host(rs.getInt("ACTV_HOST"));
            host.setKey_host(rs.getString("KEY_HOST"));
            host.setEstatus_host(rs.getInt("ESTATUS_HOST"));
            host.setTp_hst_db(rs.getInt("TP_HST_DB"));
        return host;
    }
}
