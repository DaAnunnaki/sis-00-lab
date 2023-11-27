/*public class RecipeIngredient extends Ingredient{
    
    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {

    }
}
*/
public class RecipeIngredient extends Ingredient {
    
    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nquantity = " + quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object obj) {
        if(obj instanceof RecipeIngredient) {
            return(quantity == ((RecipeIngredient)obj).getQuantity());
        } else return false;
    }

}


/*
 * RecipeIngredient.java class is a subclass of Ingredient and has a constructor:
public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity)
 */