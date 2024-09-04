class RectangleArea{
	public static void main(String args[]){
		int length, breadth;
		length = Integer.parseInt(args[0]);
		breadth = Integer.parseInt(args[1]);
		int area = length*breadth;
		int circum = 2*(length+breadth);
		System.out.println("Length of the rectangle is: " + length);
		System.out.println("Breadth of the rectangle is: " + breadth);
		System.out.println("Circumference of the rectangle is: " + circum);
		System.out.println("Area of the rectangle is: " + area);
	}
}
