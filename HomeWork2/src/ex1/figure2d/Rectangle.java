package ex1.figure2d;

public class Rectangle extends Square{
    private double height;
    private static int count = 1;

    public Rectangle(double w,double h) {
        super(w);
        this.height = h;
        count++;
    }

    @Override
    public double perimeter() {
        return 2*(this.height+super.width);
    }

    @Override
    public double area() {
        return this.height*super.width;
    }


    public String toString(){
        super.count--;
        count--;
        return "Фигура - прямоугольник"+count+ ": площадь " + area()+ "; периметр " + perimeter();
    }
}
