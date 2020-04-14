package ex1.figure3d;

public class Sphere implements Figure3d {
    private double radius;
    private static int count = 1;

    public Sphere(double r){
        this.radius = r;
        count++;
    }
    @Override
    public double area() {
        return 4*Math.PI*(this.radius*this.radius);
    }

    @Override
    public double volume() {
        return Math.PI*(this.radius*this.radius*this.radius)*(4/3);
    }

    public String toString(){
        count--;
        return "Фигура - сфера"+count+ ": площадь " + area()+ "; объем " + volume();
    }
}
