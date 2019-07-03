package com.shtdhr.service.impl;

import com.shtdhr.service.AopServcie;

public class AopServiceImpl implements AopServcie {
    public void add(int i) {
        System.out.println( "add \t" +i);
    }

    public int insert(int i) {
        System.out.println( "insert \t" +i);

        return 0;
    }

    public void update(int i,int j) {
        System.out.println( "update \t" +i+"\t"+j);

    }

    public void delete() {
        System.out.println( "delete ............\t");

    }

    public void print() {
        System.out.println( "print........... \t");

    }
}
