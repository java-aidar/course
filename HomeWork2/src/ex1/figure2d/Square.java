package ex1.figure2d;

public class Square implements Figure2d {
    protected double width;
    protected static int count = 1;

    public Square(double w){
        this.width=w;
        count++;
    }

    @Override
    public double perimeter() {

        return 4*this.width;
    }

    @Override
    public double area() {
        return this.width*this.width;
    }

    public String toString(){
        count--;
        return "Фигура - квадрат"+count+ ": площадь " + area()+ "; периметр " + perimeter();
    }
}
