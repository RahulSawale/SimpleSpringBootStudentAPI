/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.student;

/**
 *
 * @author krawler
 */
public class Student {
    private final Integer sId;
    private final String sName;

    public Student(Integer sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public Integer getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }
    
    
    
}
