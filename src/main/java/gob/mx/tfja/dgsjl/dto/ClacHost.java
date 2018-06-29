package gob.mx.tfja.dgsjl.dto;

import java.io.Serializable;

/**
 * Esta clase se encarga de proveer los métodos necesarios para 
 * 
 */
public class ClacHost implements Serializable{
    
    private int    cveHost;
    private int    actvHost; 
    private int    estatusHost;
    private String keyHost;
    private int    tpHstDb;
    private String nombHost; 
    
    /**
     * @return the nombHost
     */
    public String getNomb_host() {
        return nombHost;
    }

    /**
     * @param nomb_host the nombHost to set
     */
    public void setNomb_host(String nomb_host) {
        this.nombHost = nomb_host;
    }


    /**
     * @return the actvHost
     */
    public int getActv_host() {
        return actvHost;
    }

    /**
     * @param actv_host the actvHost to set
     */
    public void setActv_host(int actv_host) {
        this.actvHost = actv_host;
    }

    /**
     * @return the keyHost
     */
    public String getKey_host() {
        return keyHost;
    }

    /**
     * @param key_host the keyHost to set
     */
    public void setKey_host(String key_host) {
        this.keyHost = key_host;
    }

    /**
     * @return the cveHost
     */
    public int getCve_host() {
        return cveHost;
    }

    /**
     * @param cve_host the cveHost to set
     */
    public void setCve_host(int cve_host) {
        this.cveHost = cve_host;
    }

    /**
     * @return the estatusHost
     */
    public int getEstatus_host() {
        return estatusHost;
    }

    /**
     * @param estatus_host the estatusHost to set
     */
    public void setEstatus_host(int estatus_host) {
        this.estatusHost = estatus_host;
    }

    /**
     * @return the tpHstDb
     */
    public int getTp_hst_db() {
        return tpHstDb;
    }

    /**
     * @param tp_hst_db the tpHstDb to set
     */
    public void setTp_hst_db(int tp_hst_db) {
        this.tpHstDb = tp_hst_db;
    }


}
