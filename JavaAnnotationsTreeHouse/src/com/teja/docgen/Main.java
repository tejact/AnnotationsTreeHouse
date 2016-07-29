package com.teja.docgen;

import java.util.Arrays;

import com.teja.math.MathUtils;

public class Main {
    public static void main(String[] args) {
    	
    	//Intro to reflection.    	
    	//Step1: Get Class
    	Class<?> clazz = MathUtils.class;
    	
    	//Get All declared methods
    	System.out.println(Arrays.toString(clazz.getMethods()));
    	
    	
        // TODO: Process the MathUtils class's annotations
    	DocProcessor.process(clazz);
    }
}