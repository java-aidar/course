package ex1.figure3d;

public class Pyramid implements Figure3d {
    private double height;             // высота пирамиды
    private double baseWidth;          // сторона основания
    private double rectangleHeight;    // высота треугольника
    private static int count = 1;
    public Pyramid(double h,double bW){
        this.height = h;
        this.baseWidth = bW;
        rectangleHeight = Math.sqrt(h*h + (bW/2)*(bW/2));
        count++;
    }
    @Override
    public double area() {   //площадь основания + площадь боковой поверхности // площадь боковой поверхности равна (1/2 Росн * высоту треугольника)
        return (baseWidth*baseWidth) + ((baseWidth+baseWidth)*rectangleHeight);
    }

    @Override
    public double volume() {
        return (1/3)*(this.baseWidth*this.baseWidth)*this.height;
    }

    public String toString(){
        count--;
        return "Фигура - пирамида"+count+ ": площадь " + area()+ "; объем " + volume();
    }
}
