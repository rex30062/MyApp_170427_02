package com.cclz.myapp_170427_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YVTC on 2017/4/27.
 */

public class MyTest1 {
    @Test
    public void MyTest1(){
        StudentData sd=new StudentData();
        assertEquals(sd.getData(), "Jack11");
    }
}
