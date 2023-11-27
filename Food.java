public class Food {
    String description;
    int calPerServe;

    public Food(String d, int cal) {
        description = d;
        calPerServe = cal;
    }

    public String getDescription() {
        return description;
    }

    public int getCal() {
        return calPerServe;
    }

    public void setCalPerService(int cal) {
        calPerServe = cal;
    }

    public void setDescription(String d) {
        description = d;
    }

    public int totalCal(int servings) {
        return servings * calPerServe;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Food) {
            return(description.equals(((Food)obj).getDescription()) && calPerServe == ((Food)obj).getCal());
        } else return false;
    }

    public String toString() {
        return "Food [ description = " + description + ", calPerServe = " + calPerServe + "]"; 
    }

}

/*
 * Write a superclass encapsulating food; 
 * it has two attributes: its description and the number of calories per serving. 
 * It also has a method taking a number of servings as a parameter and returning the number of calories. 
 * 
 * This class has two subclasses: one encapsulating a liquid food (such as a drink, for instance}, 
 * and the other encapsulating a fruit. 
 * 
 * A liquid food has an additional attribute: its viscosity. 
 * 
 * A fruit has an additional attribute: its season.
 * 
 * You also need to include constructors, accesors, mutators, toString and equals methods for all of these classes. 
 * 
 * In the main method in Food, create instances of its subclasses and test all their methods.
 */