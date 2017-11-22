public class Planet {
	double xxPos, yyPos, xxVel, yyVel, mass;
	String imgFileName;

	public Planet(double xP, double yP, double xV, double yV, double m, String img){
		xxPos=xP; yyPos=yP; xxVel=xV; yyVel=yV; mass=m; imgFileName=img;
	}

	public Planet(Planet p){
		xxPos=p.xxPos; yyPos=p.yyPos; xxVel=p.xxVel; yyVel=p.yyVel; mass=p.mass; imgFileName=p.imgFileName;
	}

	public double calcDistance(Planet p){
		return Math.sqrt((this.xxPos-p.xxPos)*(this.xxPos-p.xxPos)+(this.yyPos-p.yyPos)*(this.yyPos-p.yyPos));
	}

	public double calcForceExertedBy(Planet p){
		return 6.67*Math.pow(10, -11)*this.mass*p.mass/(this.calcDistance(p)*this.calcDistance(p));
	}

	public double calcForceExertedByX(Planet p){
		return this.calcForceExertedBy(p)*(p.xxPos-this.xxPos)/this.calcDistance(p);
	}

	public double calcForceExertedByY(Planet p){
		return this.calcForceExertedBy(p)*(p.yyPos-this.yyPos)/this.calcDistance(p);
	}

	public double calcNetForceExertedByX(Planet[] p){
		int N=p.length;
		double netForceX=0;
		for(int i=0;i<N;++i){
			if(!this.equals(p[i])){
				netForceX=netForceX+this.calcForceExertedByX(p[i]);
			}	
		}
		return netForceX;
	}

	public double calcNetForceExertedByY(Planet[] p){
		int N=p.length;
		double netForceY=0;
		for(int i=0;i<N;++i){
			if(!this.equals(p[i])){
				netForceY=netForceY+this.calcForceExertedByY(p[i]);
			}
		}
		return netForceY;
	}

	public void update(double dt, double fX, double fY){
		double acceNetX=fX/this.mass;
		double acceNetY=fY/this.mass;
		this.xxVel=this.xxVel+dt*acceNetX;
		this.yyVel=this.yyVel+dt*acceNetY;
		this.xxPos=this.xxPos+dt*this.xxVel;
		this.yyPos=this.yyPos+dt*this.yyVel;
	}
}