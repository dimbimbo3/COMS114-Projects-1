public class Triangle {
    private double base;
    private double height;
    
    public void setBase(double b){
        base = b;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getArea(){
        return .5 * base * height;
    }
}