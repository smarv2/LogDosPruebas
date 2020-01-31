/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.mario.logtest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author mxi01020253a
 */
public class LogDosPruebas {
    
    
    private static final Logger LOG = LogManager.getLogger(LogDosPruebas.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("oli");
        LOG.info("oli");
    }
    
}
