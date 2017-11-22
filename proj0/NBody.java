public class NBody {

	public static double readRadius(String img){
		In in = new In(img);
		in.readDouble();
		return in.readDouble();
	}

	public static Planet[] readPlanets(String img){
		In in = new In(img);
		in.readDouble();
		in.readDouble();
		Planet[] p=new Planet[5];
		p[0]=new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		p[1]=new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		p[2]=new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		p[3]=new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		p[4]=new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		return p;
	}
}
