/*public class Ingredient {
    
    public String name;
    public int measuringUnit, caloriesPerUnit; 

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {

    }

    public String toString() {
        return "Ingredient\n"+ "name=" + name + "\n" + "measuringUnit=" + measuringUnit + "\n" + "caloriesPerUnit=" + caloriesPerUnit; 
    }

    public Object equals(Object) {

    }
}
*/

import java.util.Objects;

public class Ingredient {
    public String name;
    public String measuringUnit;
    public int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() {
        return name;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public void setName(String name) {
        this.name= name;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit=measuringUnit;
    }

    public void setCaloriesPerUnit(int caloriesPerUnit) {
        this.caloriesPerUnit=caloriesPerUnit;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ingredient) {
            return(name.equals(((Ingredient)obj).getName()) 
            && measuringUnit.equals(((Ingredient)obj).getMeasuringUnit())
            && caloriesPerUnit == ((Ingredient)obj).getCaloriesPerUnit());
        } else return false;
    }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(name, measuringUnit, caloriesPerUnit);
    // }

    @Override
    public String toString() {
        return "Ingredient\n"+ "name = " + name + "\n" + "measuringUnit = " + measuringUnit + "\n" + "caloriesPerUnit = " + caloriesPerUnit; 
    }
}



/*
 * You will be creating a cooking recipes book. 
 * A RecipeBook will contains multiple CookingRecipe(s) and each recipe has multiple RecipeIngredient(s). 
 * To do this you will need to implement the following classes and methods:
 * 
 * Ingredient.java class has a constructor:
public Ingredient(String name, String measuringUnit, int caloriesPerUnit)
 */


