/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.mario.otraclase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author smarv
 */
public class OtraClase {
    
    private static final Logger LOG = LogManager.getLogger(OtraClase.class);
    
    public void pintaOtroLog(){
        
        LOG.info("oli desde otra clase :)");
        LOG.info("soy un pro :)");
    }
    
}
