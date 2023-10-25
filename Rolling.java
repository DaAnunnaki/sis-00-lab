public class Rolling {
    public static void main(String[] args) {
        int die1=(int) Math.floor(Math.random()*5+1), die2=(int) Math.floor(Math.random()*5+1), total=die1+die2;
        System.out.println("The first die comes up "+die1);
        System.out.println("The second die comes up "+die2);
        System.out.println("Your total roll is "+total);
    }
}

/*Write a program that simulates rolling of a pair of dice. 
You can simulate rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random. 
The number you pick represents the number on the die after it is rolled. 
Your program should report the number showing on each die as well as the total roll. 

For example: 
The first die comes up 3                                    
The second die comes up 5
Your total roll is 8 
*/