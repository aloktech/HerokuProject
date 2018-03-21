/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imos.sample.rest.model;

import java.io.Serializable;

/**
 *
 * @author Pintu
 */
public class BaseModel implements Serializable {

    private static final long serialVersionUID = -1481712236947018405L;

    private final long time = System.currentTimeMillis();

    public long getTime() {
        return time;
    }
}
