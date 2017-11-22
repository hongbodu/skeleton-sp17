/** Simpler demo of the In class. */
public class test {
	public static void main(String[] args) {
		In in = new In("./data/planets.txt");

		/* Every time you call a read method from the In class,
		 * it reads the next thing from the file, assuming it is
		 * of the specified type. */

		/* Compare the calls below to the contents of BasicInDemo_input_file.txt */
		in.readDouble();
		in.readDouble();
		Planet[] p=new Planet[2];
		p[0].xxPos=in.readDouble();
		//p[0]=new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());


		/*for(int i=0;i<5;++i)
		{
			p.xxPos=in.readDouble();
			p.yyPos=in.readDouble();
			p.xxVel=in.readDouble();
			p.yyVel=in.readDouble();
			p.mass=in.readDouble();
			p.imgFileName=in.readString();
			
			
		} 
		*/
		System.out.println("The file contained "  + p[0].xxPos);
		
	}
} 