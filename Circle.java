public class Circle {
    private double radius;
    
    public void setRadius(double r){
        radius = r;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}