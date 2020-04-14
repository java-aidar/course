package ex1.figure3d;

public class Parallelepiped implements Figure3d {
    private double width;
    private double height;
    private double length;
    private static int count = 1;

    public Parallelepiped(double w,double h,double l){
        this.width = w;
        this.height = h;
        this.length = l;
        count++;
    }

    @Override
    public double area() { return 2*this.width*this.length + 2*this.width*this.height + 2*this.height*this.length; }

    @Override
    public double volume() {
        return this.width*this.length*this.height;
    }

    public String toString(){
        count--;
        return "Фигура - параллелепипед"+count+ ": площадь " + area()+ "; объем " + volume();
    }


}
