/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.mx.tfja.dgsjl.dao.exception;

/**
 * Esta clase se encarga de proveer los métodos necesarios para 
 * 
 */
public class BdSicDaoException extends Exception{

    public BdSicDaoException(String message) {
        super(message);
    }

    public BdSicDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public BdSicDaoException(Throwable cause) {
        super(cause);
    }

}