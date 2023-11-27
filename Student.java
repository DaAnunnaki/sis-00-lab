public class Student extends Person{

    private String status;
    static final String FRESHMEN = "freshmen", SOPHOMORE="sophomore", JUNIOR="junior", SENIOR="senior";

    public student(String name, String adress, String phone, String email, int age, String stat) {
        super(name, email, adress, phone, age);
        this.status= stat;
    }

    public String getStatus() { return status; }
    

    
}
