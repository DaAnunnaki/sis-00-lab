public class GPA {
    public static double gpaCalculator(String[] grades) {
        double sum = 0.0;
        for(String grade: grades) {
            if(grade.equals("A")) sum+=4.0;
            else if(grade.equals("A-")) sum+=3.67;
            else if(grade.equals("B+")) sum+=3.33;
            else if(grade.equals("B")) sum+=3.0;
            else if(grade.equals("B-")) sum+=2.67;
            else if(grade.equals("C+")) sum+=2.33;
            else if(grade.equals("C")) sum+=2.0;
            else if(grade.equals("C-")) sum+=1.67;
            else if(grade.equals("D+")) sum+=1.33;
            else if(grade.equals("D")) sum+=1.0;
            else if(grade.equals("F")) sum+=0.0;
            else return -1;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(gpaCalculator(new String[] {“A”, “F”, “C”, “B”}));
        System.out.println(gpaCalculator(new String[] {“A-”, “B-”, “C-”, “F”}));
        System.out.println(gpaCalculator(new String[] {“F”, “C+”, “D+”, “A+”}));
    }
}   

/*
 * GPA.java: Write a function gpaCalculator(String[] grades) that takes one parameter, an array of grades, 
 * and returns the average of the grades after converting each grade to a “grade point” in 
 * the range 0.0 through 4.0. For simplicity, we will assume that all courses are 1 credit. 
 * If the array of grades contains a grade not listed in the table below or the array of grades is empty, simply return -1.

List of grades and their respective Point value is listed below
Grade Points
A 4.0 
A- 3.67 
B+ 3.33 
B 3.0 
B- 2.67 
C+ 2.33 
C 2.0 
C- 1.67 
D+ 1.33 
D 1.0 
F 0.0
Examples:
gpaCalculator(new String[] {“A”, “F”, “C”, “B”})
2.25
gpaCalculator(new String[] {“A-”, “B-”, “C-”, “F”}) 
2.0025 
gpaCalculator(new String[] {“F”, “C+”, “D+”, “A+”}) 
-1
The main method is optional, but you should test your gpaCalculator method to see if it works properly.
 */