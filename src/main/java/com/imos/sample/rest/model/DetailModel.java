/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imos.sample.rest.model;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Pintu
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DetailModel extends BaseModel {

    private static final long serialVersionUID = 6277486496945615571L;

    private String localhost;

    {
        try {
            localhost = Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(DetailModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
