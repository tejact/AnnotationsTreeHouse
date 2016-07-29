package com.teja.math;

import java.awt.geom.Point2D;

import com.teja.docgen.Doc;

//This class used the user defined annotations.
@Doc(Desc = "Common functions of the Math")
public class MathUtils {
    private static final Double EPSILON = 0.0001;

    @Doc(	Desc = "Calcualte area of triangle",
    		params = {"Point 1 of Triangle","Point 2 Triangle","Point 3 Triangle"},
    		returnVal = "Area of triangle"
    	)
    public static Double triangleArea(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
        return 0.0;
    }

    @Doc(	Desc = "Calcualte distance betwen points",
    		params = {"First Point","Second Point"},
    		returnVal = ""
    	)
    public static Double distance(Point2D.Double a, Point2D.Double b) {
        return 0.0;
    }

    @Doc
    public static Double[] quadraticRoots(int a, int b, int c) {
        return new Double[]{};
    }

    @Doc (
    		Desc = "Disply value of epsilon"
    	)
    public static void epsilon() {

    }

    private static boolean arePointsClose(Point2D.Double a, Point2D.Double b) {
        return false;
    }
}