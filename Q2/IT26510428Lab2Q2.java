public class IT26510428Lab2Q2{
	public static final double PI=22.0/7.0;
	public static void main(String[]args){
		double length,radius,perimeter,circumference;
		length=10.0;
		perimeter=length*4.0;
		length=perimeter/4.0;
		circumference=perimeter;
		radius=circumference/(PI*2.0);
		System.out.println("Radius of the circular fence: "+radius);
	}
}