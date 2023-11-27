public class IllegalTriangleException  extends Exception{
    public IllegalTriangleException(int s1, int s2, int s3) {
        // TODO
        super("illegal triangle");
    }
}

/*
 * (IllegalTriangleException.java, Triangle.java) Define the Triangle class with three sides. In a triangle, the sum of any two sides is greater than the other side. Create the IllegalTriangleException class, and modify the constructor of the Triangle class to throw an IllegalTriangleException object if a triangle is created with sides that violate the rule, as follows:
 * Construct a triangle with the specified sides 
public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
// if the sum of any two sides is less than the other side throw an IllegalTriangleException
}
In the main method in the Triangle class, create an instance of Triangle with sides: 1,3,1 in a try-catch block and catch the exception.
 */