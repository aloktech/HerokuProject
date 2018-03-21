/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imos.sample.rest.model;

/**
 *
 * @author Pintu
 */
public class SearchModel extends UserModel {

    private static final long serialVersionUID = -3047586080871620881L;

    private final String text;

    public SearchModel(String userId, String text) {
        super(userId);
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
