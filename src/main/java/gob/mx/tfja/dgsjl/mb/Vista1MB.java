/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.mx.tfja.dgsjl.mb;

import gob.mx.tfja.dgsjl.dao.exception.BdSicDaoException;
import gob.mx.tfja.dgsjl.dto.ClacHost;
import gob.mx.tfja.dgsjl.ops.NonameOps;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.PrimeFaces;

/**
 * Managed bean que sirve a la vista vista1.xhtml
 * @created 28-06-2018 
 * @author aosanchez
 */
@ManagedBean(name="vista1MB")
@ViewScoped
public class Vista1MB implements Serializable {
    private static final long serialVersionUID = 3973801993975443027L;
    private static final Log logger = LogFactory.getLog(Vista1MB.class);
        
    private ArrayList<ClacHost> hosts; // Variable que usara la vista
    private String saludo = "Hola";
    
    @ManagedProperty("#{NonameOps}")
    private NonameOps nonameOps; // Se inyecta el managed bean desde Spring
    
    /**
     * Se inicializan la vista
     */
    @PostConstruct
    public void init() {
        try {
            logger.info("Iniciando bean");
            hosts = getNonameOps().obtenTodosHost();
        } catch (BdSicDaoException ex) {
            Logger.getLogger(Vista1MB.class.getName()).log(Level.SEVERE, null, ex);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error al encontrar los Hosts",  null);
            FacesContext.getCurrentInstance().addMessage(null, message);
            PrimeFaces pf = PrimeFaces.current();
            if (pf.isAjaxRequest()) {
                pf.ajax().update("frm:dt");
            }
        }
    }
    
    /**
     * @return the hosts
     */
    public ArrayList<ClacHost> getHosts() {
        return hosts;
    }

    /**
     * @param hosts the hosts to set
     */
    public void setHosts(ArrayList<ClacHost> hosts) {
        this.hosts = hosts;
    }

    /**
     * @return the nonameOps
     */
    public NonameOps getBolOps() {
        return getNonameOps();
    }

    /**
     * @param bolOps the nonameOps to set
     */
    public void setBolOps(NonameOps bolOps) {
        this.setNonameOps(bolOps);
    }

    /**
     * @return the saludo
     */
    public String getSaludo() {
        return saludo;
    }

    /**
     * @param saludo the saludo to set
     */
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    /**
     * @return the nonameOps
     */
    public NonameOps getNonameOps() {
        return nonameOps;
    }

    /**
     * @param nonameOps the nonameOps to set
     */
    public void setNonameOps(NonameOps nonameOps) {
        this.nonameOps = nonameOps;
    }

    
}
