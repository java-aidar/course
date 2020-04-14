package ex1.figure2d;


public class Circle implements Figure2d {
    private double radius;
    private static int count = 1;
    public Circle(double r){
        this.radius = r;
        count++;
    }
    @Override
    public double perimeter() {
        return Math.PI*this.radius*2;

    }

    @Override
    public double area() {
        return Math.PI*(this.radius*this.radius);
    }

     public String toString(){ // как правильно переопределить?
        count--;
         return "Фигура - круг"+count+ ": площадь " + area()+ "; периметр " + perimeter();
     }
}
