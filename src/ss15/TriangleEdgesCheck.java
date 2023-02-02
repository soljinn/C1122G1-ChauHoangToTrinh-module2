package ss15;

public class TriangleEdgesCheck {
    public void checkTriangleEdges (double a, double b, double c)throws TriangleEdgesException{
        if (a+b <=c || a+c <= b || b+c <= a){
            throw new TriangleEdgesException("Error: invalid triangle! ");
        } else
            System.out.println("Valid triangle");
    }
}
