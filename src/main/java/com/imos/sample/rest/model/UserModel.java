/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imos.sample.rest.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Pintu
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserModel extends DetailModel {

    private static final long serialVersionUID = 9097500637783260035L;

    @JSONField(label = "user_id", name = "user_id")
    private final String userId;

    public UserModel(String userId) {
        this.userId = userId;
    }
}
