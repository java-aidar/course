package ex1.figure3d;

public class Cube implements Figure3d {
    protected double width;
    protected static int count = 1;

    public Cube(double w){
        this.width=w;
        count++;
    }

    @Override
    public double area() {
        return 6*(this.width*this.width);
    }

    @Override
    public double volume() {
        return this.width*this.width*this.width;
    }

    public String toString(){
        count--;
        return "Фигура - куб"+count+ ": площадь " + area()+ "; объем " + volume();
    }
}
