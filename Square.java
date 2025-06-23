public class Square extends Shape {
    int side;
    int area(){
        System.out.println("Square ");
        return side*side;
    }
    public static void main(String[] args) {
        Square val= new Square();
        val.side = 12;
        System.out.println(val.area());

        Shape val1 = new Shape();
        val1.area();
    }
}
