/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imos.sample.rest.model;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Pintu
 */
@Data
public class BaseModel implements Serializable {

    private static final long serialVersionUID = -1481712236947018405L;

    private final long time = System.currentTimeMillis();
}
