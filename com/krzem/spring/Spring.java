package com.krzem.spring;



import java.awt.Graphics2D;
import java.lang.Math;



public class Spring{
	public Vector a;
	public Vector b;
	public double l;
	public double k;
	public Vector v;
	public Vector g;



	public Spring(Vector a,Vector b,double l,double k,Vector g){
		this.a=a;
		this.b=b;
		this.l=l;
		this.k=k;
		this.g=g;
		this.v=new Vector(0,0);
	}



	public void update(){
		Vector t=this.b.sub(this.a).normalize().mult(this.l).add(this.a);
		Vector tv=this.v.add(t.sub(this.b).mult(this.k));
		this.v=tv.mult(1-this.k).add(this.g);
		this.b=this.b.add(this.v);
	}



	public void draw(Graphics2D g){
		g.setColor(java.awt.Color.black);
		g.setStroke(new java.awt.BasicStroke(5));
		g.drawLine((int)this.a.x,(int)this.a.y,(int)this.b.x,(int)this.b.y);
	}
}