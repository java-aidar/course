package ex1.figure2d;

public class Triangle implements Figure2d {
    private double a;
    private  double b;//гипотенуза
    private double height;
    private static int count = 1;

    public Triangle(double a,double height){
        this.a = a;
        this.height = height;
        this.b = Math.sqrt(a*a + (height)*(height));
        count++;
    }
    @Override
    public double perimeter() {
        return this.a+this.b+this.height;
    }

    @Override
    public double area() {
        return (this.height*this.a /2);
    }

    public String toString(){
        count--;
        return "Фигура - треугольник"+count+ ": площадь " + area()+ "; периметр " + perimeter();
    }
}
