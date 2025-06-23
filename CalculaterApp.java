public class CalculaterApp {
    int sum(int a, int b ){
        return a+b;
    }
    int multi(int a, int b, int c, int d){
        return a*b*c*d;
    }
    double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        CalculaterApp app = new CalculaterApp();
        System.out.println(app.sum(20, 30));
        System.out.println(app.multi(12, 23, 45, 67));
        System.out.println(app.sum(20.44, 23.33));
    }
    
}
