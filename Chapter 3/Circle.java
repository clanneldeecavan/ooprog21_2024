public class Circle {
    private static double r; // radius
    private static double d; // diameter
    private static double a; // area

    public Circle() {
        r = 1; 
        updateCircleProperties(); 
        
}

    public void setRadius(double rad) {
        r = rad; 
        updateCircleProperties(); 
        
}

    private void updateCircleProperties() {
        d = 2 * r; 
        a = Math.PI * r * r; 
        
}

    public static double getRadius() {
        return r; 
        
}

    public static double getDiameter() {
        return d; 
        
}

    public static double getArea() {
        return a; 
        
    }
}
