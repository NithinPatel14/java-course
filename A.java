class A {
    int num;
    A(){
        System.out.println("Class A");
    }
     void getNum(){
        System.out.println("num = " + num);
    }
}

class B extends A {
    int num1;
    B(){
        System.out.println("Class B" );
    }
    void getValues(){
        System.out.println("num1 = " + num1);
    }
}
class C extends B{
    C(){
        System.out.println("Class C");
    }
}

class Main{
    public static void main(String[] args) {
        C result = new C();
        result.num = 10;
        result.num1 = 40;
        result.getNum();
        result.getValues();
    }
}
