class Box {
    double width;
    double height;
    double depth;
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return width* height *depth;
    }
}
class Box_Q1{
    public static void main(String[] args) {
        Box box = new Box(10,10,10);
        System.out.println("Volume is: "+ box.volume());   
    }
}


