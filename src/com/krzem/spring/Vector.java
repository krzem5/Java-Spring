package com.krzem.spring;



public class Vector{
	public double x;
	public double y;



	public Vector(double x,double y){
		this.x=x;
		this.y=y;
	}



	@Override
	public Vector clone(){
		return new Vector(this.x,this.y);
	}



	public Vector normalize(){
		Vector v=this.clone();
		double d=Math.sqrt(this.x*this.x+this.y*this.y);
		v.x/=d;
		v.y/=d;
		return v;
	}



	public Vector add(Vector o){
		Vector v=this.clone();
		v.x+=o.x;
		v.y+=o.y;
		return v;
	}



	public Vector sub(Vector o){
		Vector v=this.clone();
		v.x-=o.x;
		v.y-=o.y;
		return v;
	}



	public Vector mult(double s){
		Vector v=this.clone();
		v.x*=s;
		v.y*=s;
		return v;
	}
}
