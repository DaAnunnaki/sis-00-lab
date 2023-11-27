import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CookingRecipe {

    private String name;
    private List<RecipeIngredient> ingredients;

    public CookingRecipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        for (RecipeIngredient recipeIngredient : ingredients) {
            if (recipeIngredient.equals(ingredient)) {
                recipeIngredient.setQuantity(quantity);
                return;
            } else {
                RecipeIngredient newRecipeIngredient = new RecipeIngredient(
                ingredient.getName(),
                ingredient.getMeasuringUnit(),
                ingredient.getCaloriesPerUnit(),
                quantity);
                ingredients.add(newRecipeIngredient);
            }
        }
        return;
    }

    public float calculateCalories() {
        float totalCalories = 0;
        for (RecipeIngredient recipeIngredient : ingredients) {
            totalCalories += (recipeIngredient.getCaloriesPerUnit() * recipeIngredient.getQuantity());
        }
        return totalCalories;
    }

    public int getNumberOfIngredients() {
        return ingredients.size();
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        RecipeIngredient toRemove = getRecipeIngredient(ingredient);
        if (toRemove != null) {
            ingredients.remove(toRemove);
            return toRemove;
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        RecipeIngredient toRemove = getRecipeIngredient(ingredientName);
        if (toRemove != null) {
            ingredients.remove(toRemove);
            return toRemove;
        }
        return null;
    }

    private RecipeIngredient getRecipeIngredient(String ingredientName) {
        for (RecipeIngredient recipeIngredient : ingredients) {
            if (recipeIngredient.getName().equals(ingredientName)) {
                return recipeIngredient;
            }
        }
        return null;
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        for (RecipeIngredient recipeIngredient : ingredients) {
            if (recipeIngredient.getName().equals(ingredient.getName())) {
                return recipeIngredient;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder recipeString = new StringBuilder();
        recipeString.append("CookingRecipe\n");
        recipeString.append("name = ").append(name).append("\n");
        for (RecipeIngredient ingredient : ingredients) {
            recipeString.append(ingredient.toString()).append("\n");
        }
        return recipeString.toString();
    }

    public boolean equals(Object obj) {
        int n = 0;
        if(obj instanceof CookingRecipe) {
            for (RecipeIngredient ingredient : ingredients) {
                if(ingredient.equals(((CookingRecipe)obj).getRecipeIngredient(ingredient))) {
                    n++;
                }
            }
            if(n == ingredients.size()) {
                return true;
            }
        } return false;
    }

    public int hashCode() {
        return Objects.hash(name, ingredients);
    }
}


/* 
CookingRecipe.java class has the following constructors and methods:
public CookingRecipe(String name)

public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) 
if the recipe already includes the ingredient specified by the parameter, 
then just update the quantity, otherwise add a new recipe ingredient.

public RecipeIngredient getRecipeIngredient(Ingredient ingredient)

public RecipeIngredient getRecipeIngredient(String ingredientName) 
returns the RecipeIngredient object corresponding to the ingredient object parameter, 
or return null if the ingredient is not part of the recipe.

public RecipeIngredient removeRecipeIngredient(Ingredient ingredient)

public RecipeIngredient removeRecipeIngredient(String ingredientName) 
remove the given ingredient from the recipe. If the ingredient is part of the recipe return it, else return null.

public float calculateCalories() calculates the sum of the calories for all the ingredients in the recipes and their respective quantities.

public int getNumberOfIngredients() returns the number of ingredients in the recipe.

public String toString() returns the recipe name and ingredients as a String.

The specification of this class intentionally does not specify the internal structure of the class (name, ingredients), 
so you can design it in any way you want, as long as you provide the functionalities required above. 
These properties should be private, so the class is encapsulated.
*/