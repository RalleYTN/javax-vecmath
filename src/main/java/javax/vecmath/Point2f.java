/*
 * Copyright (C) 1997,1998,1999
 * Kenji Hiranabe, Eiwa System Management, Inc.
 *
 * This program is free software.
 * Implemented by Kenji Hiranabe(hiranabe@esm.co.jp),
 * conforming to the Java(TM) 3D API specification by Sun Microsystems.
 *
 * Permission to use, copy, modify, distribute and sell this software
 * and its documentation for any purpose is hereby granted without fee,
 * provided that the above copyright notice appear in all copies and
 * that both that copyright notice and this permission notice appear
 * in supporting documentation. Kenji Hiranabe and Eiwa System Management,Inc.
 * makes no representations about the suitability of this software for any
 * purpose.  It is provided "AS IS" with NO WARRANTY.
 */
package javax.vecmath;

import java.io.Serializable;

/**
 * A 2 element point that is represented by single precision
 * floating point x,y coordinates.
 * @version specification 1.1, implementation $Revision$, $Date$
 * @author Kenji hiranabe
 */
public final class Point2f extends Tuple2f implements Serializable {

	private static final long serialVersionUID = 8497286851673272561L;

	/**
     * Constructs and initializes a Point2f from the specified xy coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point2f(float x, float y) {
	
    	super(x, y);
    }

    /**
     * Constructs and initializes a Point2f from the specified array.
     * @param p the array of length 2 containing xy in order
     */
    public Point2f(float p[]) {
	
    	super(p);
    }

    /**
     * Constructs and initializes a Point2f from the specified Point2f.
     * @param p1 the Point2f containing the initialization x y data
     */
    public Point2f(Point2f p1) {
	
    	super(p1);
    }

    /**
     * Constructs and initializes a Point2f from the specified Point2d.
     * @param p1 the Point2d containing the initialization x y data
     */
    public Point2f(Point2d p1) {
	
    	super(p1);
    }

    /**
     * Constructs and initializes a Point2f from the specified Tuple2f.
     * @param t1 the Tuple2f containing the initialization x y data
     */
    public Point2f(Tuple2f t1) {
	
    	super(t1);
    }

    /**
     * Constructs and initializes a Point2f from the specified Tuple2d.
     * @param t1 the Tuple2d containing the initialization x y data
     */
    public Point2f(Tuple2d t1) {
	
    	super(t1);
    }

    /**
     * Constructs and initializes a Point2f to (0,0).
     */
    public Point2f() {
	
    	super();
    }

    /**
     * Computes the square of the distance between this point and point p1.
     * @param  p1 the other point
     */
    public final float distanceSquared(Point2f p1) {
	
    	double dx = this.x - p1.x;
    	double dy = this.y - p1.y;
	
    	return (float)(dx * dx + dy * dy);
    }

    /**
     * Computes the distance between this point and point p1.
     * @param p1 the other point
     */
    public final float distance(Point2f p1) {
	
    	return (float)Math.sqrt(this.distanceSquared(p1));
    }

    /**
     * Computes the L-1 (Manhattan) distance between this point and point p1.
     * The L-1 distance is equal to abs(x1-x2) + abs(y1-y2).
     * @param p1 the other point
     */
    public final float distanceL1(Point2f p1) {
	
    	return Math.abs(this.x - p1.x) + Math.abs(this.y - p1.y);
    }

    /**
     * Computes the L-infinite distance between this point and point p1.
     * The L-infinite distance is equal to MAX[abs(x1-x2), abs(y1-y2)].
     * @param p1 the other point
     */
    public final float distanceLinf(Point2f p1) {
	
    	return Math.max(Math.abs(this.x - p1.x), Math.abs(this.y - p1.y));
    }
}
