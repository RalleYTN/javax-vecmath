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
 * A generic 3 element tuple that is represented by
 * double precision floating point x,y and z coordinates.
 * @version specification 1.1, implementation $Revision$, $Date$
 * @author Kenji hiranabe
 */
public abstract class Tuple3d implements Serializable {

	private static final long serialVersionUID = 3490399963763813445L;

	/**
     * The x coordinate.
     */
    public double x;

    /**
     * The y coordinate.
     */
    public double y;

    /**
     * The z coordinate.
     */
    public double z;

    /**
     * Constructs and initializes a Tuple3d from the specified xyz coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Tuple3d(double x, double y, double z) {
	
    	this.x = x;
    	this.y = y;
		this.z = z;
    }

    /**
     * Constructs and initializes a Tuple3d from the specified array.
     * @param t the array of length 3 containing xyz in order
     */
    public Tuple3d(double t[]) {
	
    	// ArrayIndexOutOfBounds is thrown if t.length < 3
    	this.x = t[0];
    	this.y = t[1];
    	this.z = t[2];
    }

    /**
     * Constructs and initializes a Tuple3d from the specified Tuple3d.
     * @param t1 the Tuple3d containing the initialization x y z data
     */
    public Tuple3d(Tuple3d t1) {
		
    	this.x = t1.x;
		this.y = t1.y;
		this.z = t1.z;
    }

    /**
     * Constructs and initializes a Tuple3d from the specified Tuple3f.
     * @param t1 the Tuple3f containing the initialization x y z data
     */
    public Tuple3d(Tuple3f t1) {
		
    	this.x = t1.x;
		this.y = t1.y;
		this.z = t1.z;
    }

    /**
     * Constructs and initializes a Tuple3d to (0,0,0).
     */
    public Tuple3d() {}

    /**
     * Sets the value of this tuple to the specified xyz coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public final void set(double x, double y, double z) {
		
    	this.x = x;
		this.y = y;
		this.z = z;
    }

    /**
     * Sets the value of this tuple from the 3 values specified in the array.
     * @param t the array of length 3 containing xyz in order
     */
    public final void set(double t[]) {
	
    	// ArrayIndexOutOfBounds is thrown if t.length < 3
    	this.x = t[0];
		this.y = t[1];
		this.z = t[2];
    }

    /**
     * Sets the value of this tuple to the value of the Tuple3d argument.
     * @param t1 the tuple to be copied
     */
    public final void set(Tuple3d t1) {
    	
		this.x = t1.x;
		this.y = t1.y;
		this.z = t1.z;
    }

    /**
     * Sets the value of this tuple to the value of the Tuple3f argument.
     * @param t1 the tuple to be copied
     */
    public final void set(Tuple3f t1) {
    	
		this.x = t1.x;
		this.y = t1.y;
		this.z = t1.z;
    }

    /**
     * Copies the value of the elements of this tuple into the array t[]. 
     * @param t the array that will contain the values of the vector
     */
    public final void get(double t[]) {
	
    	// ArrayIndexOutOfBounds is thrown if t.length < 3
    	t[0] = this.x;
    	t[1] = this.y;
    	t[2] = this.z;
    }

    /**
     * Gets the value of this tuple and copies the values into the Tuple3d.
     * @param t Tuple3d object into which that values of this object are copied
     */
    public final void get(Tuple3d t) {
    	
		t.x = this.x;
		t.y = this.y;
		t.z = this.z;
    }

    /**
     * Sets the value of this tuple to the vector sum of tuples t1 and t2.
     * @param t1 the first tuple
     * @param t2 the second tuple
     */
    public final void add(Tuple3d t1, Tuple3d t2) {
    	
		this.x = t1.x + t2.x;
		this.y = t1.y + t2.y;
		this.z = t1.z + t2.z;
    }

    /**
     * Sets the value of this tuple to the vector sum of itself and tuple t1.
     * @param t1  the other tuple
     */
    public final void add(Tuple3d t1) {
    	
		this.x += t1.x;
		this.y += t1.y;
		this.z += t1.z;
    }


    /**
     * Sets the value of this tuple to the vector difference of tuple t1 and t2 (this = t1 - t2).
     * @param t1 the first tuple
     * @param t2 the second tuple
     */
    public final void sub(Tuple3d t1, Tuple3d t2) {
    	
		this.x = t1.x - t2.x;
		this.y = t1.y - t2.y;
		this.z = t1.z - t2.z;
    }

    /**
     * Sets the value of this tuple to the vector difference of itself and tuple t1 (this = this - t1).
     * @param t1 the other tuple
     */
    public final void sub(Tuple3d t1) {
		
    	this.x -= t1.x;
		this.y -= t1.y;
		this.z -= t1.z;
    }

    /**
     * Sets the value of this tuple to the negation of tuple t1. 
     * @param t1 the source vector
     */
    public final void negate(Tuple3d t1) {
		
    	this.x = -t1.x;
		this.y = -t1.y;
		this.z = -t1.z;
    }

    /**
     * Negates the value of this vector in place.
     */
    public final void negate() {
	
    	this.x = -this.x;
    	this.y = -this.y;
		this.z = -this.z;
    }
      

    /**
     * Sets the value of this tuple to the scalar multiplication of tuple t1.
     * @param s the scalar value
     * @param t1 the source tuple
     */
    public final void scale(double s, Tuple3d t1) {
	
    	this.x = s * t1.x;
    	this.y = s * t1.y;
    	this.z = s * t1.z;
    }

    /**
     * Sets the value of this tuple to the scalar multiplication of itself.
     * @param s the scalar value
     */
    public final void scale(double s) {
	
    	this.x *= s;
    	this.y *= s;
    	this.z *= s;
    }

    /**
     * Sets the value of this tuple to the scalar multiplication of tuple t1 and then
     * adds tuple t2 (this = s*t1 + t2).
     * @param s the scalar value
     * @param t1 the tuple to be multipled
     * @param t2 the tuple to be added
     */
    public final void scaleAdd(double s, Tuple3d t1, Tuple3d t2) {
    	
		this.x = s * t1.x + t2.x;
		this.y = s * t1.y + t2.y;
		this.z = s * t1.z + t2.z;
    }

    /**
     * Sets the value of this tuple to the scalar multiplication of itself and then
     * adds tuple t1 (this = s*this + t1).
     * @param s the scalar value
     * @param t1 the tuple to be added
     */
    public final void scaleAdd(double s, Tuple3d t1) {
    	
		this.x = s * this.x + t1.x;
		this.y = s * this.y + t1.y;
		this.z = s * this.z + t1.z;
    }

    /**
     * Returns a hash number based on the data values in this object. 
     * Two different Tuple3d objects with identical data  values
     * (ie, returns true for equals(Tuple3d) ) will return the same hash number.
     * Two vectors with different data members may return the same hash value,
     * although this is not likely.
     */
    @Override
    public final int hashCode() {
	
    	long xbits = Double.doubleToLongBits(this.x);
    	long ybits = Double.doubleToLongBits(this.y);
    	long zbits = Double.doubleToLongBits(this.z);
	
    	return(int)(xbits ^ (xbits >> 32) ^
    				ybits ^ (ybits >> 32) ^
    				zbits ^ (zbits >> 32));
    }

    /**
     * Returns true if all of the data members of Tuple3d t1 are equal to the corresponding
     * data members in this
     * @param t1 the vector with which the comparison is made.
     */
    public final boolean equals(Tuple3d t1) {
	
    	return t1 != null && this.x == t1.x && this.y == t1.y && this.z == t1.z;
    }

    /**
     * Returns true if the L-infinite distance between this tuple and tuple t1 is
     * less than or equal to the epsilon parameter, otherwise returns false. The L-infinite
     * distance is equal to MAX[abs(x1-x2), abs(y1-y2)].
     * @param t1 the tuple to be compared to this tuple
     * @param epsilon the threshold value
     */
    public final boolean epsilonEquals(Tuple3d t1, double epsilon) {
	
    	return (Math.abs(t1.x - this.x) <= epsilon) &&
    		   (Math.abs(t1.y - this.y) <= epsilon) &&
    		   (Math.abs(t1.z - this.z) <= epsilon);
    }

    /**
     * Returns a string that contains the values of this Tuple3d. The form is (x,y,z).
     * @return the String representation
     */
    @Override
    public final String toString() {
	    
    	return String.format("(%s, %s, %s)", this.x, this.y, this.z);
    }

    /**
     * Sets each component of the tuple parameter to its absolute value and
     * places the modified values into this tuple.
     * @param t the source tuple, which will not be modified
     */
    public final void absolute(Tuple3d t) {
	
    	this.set(t);
    	this.absolute();
    }

    /**
     * Sets each component of this tuple to its absolute value.
     */
    public final void absolute() {
    	
		if(this.x < 0.0D) this.x = -this.x;
		if(this.y < 0.0D) this.y = -this.y;
		if(this.z < 0.0D) this.z = -this.z;
    }

    /**
     * Clamps this tuple to the range [low, high].
     * @param min the lowest value in this tuple after clamping
     * @param max the highest value in this tuple after clamping
     */
    public final void clamp(double min, double max) {
	
    	this.clampMin(min);
    	this.clampMax(max);
    }

    /**
     * Clamps the tuple parameter to the range [low, high] and places the values
     * into this tuple.
     * @param min the lowest value in the tuple after clamping
     * @param max the highest value in the tuple after clamping
     * @param t the source tuple, which will not be modified
     */
    public final void clamp(double min, double max, Tuple3d t) {
	
    	this.set(t);
    	this.clamp(min, max);
    }
      
    /**
     * Clamps the minimum value of this tuple to the min parameter.
     * @param min the lowest value in this tuple after clamping
     */
    public final void clampMin(double min) {
    	
		if(this.x < min) this.x = min;
		if(this.y < min) this.y = min;
		if(this.z < min) this.z = min;
    }

    /**
     * Clamps the minimum value of the tuple parameter to the min parameter
     * and places the values into this tuple.
     * @param min the lowest value in the tuple after clamping
     * @parm t the source tuple, which will not be modified
     */
    public final void clampMin(double min, Tuple3d t) {
	
    	this.set(t);
    	this.clampMin(min);
    }

    /**
     * Clamps the maximum value of the tuple parameter to the max parameter and
     * places the values into this tuple.
     * @param max the highest value in the tuple after clamping
     * @param t the source tuple, which will not be modified
     */
    public final void clampMax(double max, Tuple3d t) {
	
    	this.set(t);
    	this.clampMax(max);
    }
      
    /**
     * Clamps the maximum value of this tuple to the max parameter.
     * @param max the highest value in the tuple after clamping
     */
    public final void clampMax(double max) {
	
    	if(this.x > max) this.x = max;
    	if(this.y > max) this.y = max;
    	if(this.z > max) this.z = max;
    }

    /**
     * Linearly interpolates between tuples t1 and t2 and places the
     * result into this tuple: this = (1-alpha)*t1 + alpha*t2.
     * @param t1 the first tuple
     * @param t2 the second tuple
     * @param alpha the alpha interpolation parameter
     */
    public final void interpolate(Tuple3d t1, Tuple3d t2, double alpha) {
	
    	this.set(t1);
    	this.interpolate(t2, alpha);
    }


    /**
     * Linearly interpolates between this tuple and tuple t1 and places the
     * result into this tuple: this = (1-alpha)*this + alpha*t1.
     * @param t1 the first tuple
     * @param alpha the alpha interpolation parameter
     */
    public final void interpolate(Tuple3d t1, double alpha) {
    	
		double beta = 1 - alpha;
		this.x = beta * this.x + alpha * t1.x;
		this.y = beta * this.y + alpha * t1.y;
		this.z = beta * this.z + alpha * t1.z;
    }
}
