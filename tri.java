public class tri {
    int side1, side2, side3;

    public tri(int s1, int s2, int s3) throws IllegalTriangleException {
        if(s1+s2 <= s3 || s1+s2 <= s3 || s1+s2 <= s3) {
            throw new IllegalTriangleException(s1, s2, s3);
        }
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;

    }

    public static void main(String[] args) {
        try {
            Triangle tril = new Triangle(2, 3, 4);
        } catch(IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
