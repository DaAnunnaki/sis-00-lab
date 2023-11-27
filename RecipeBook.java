import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RecipeBook {
    private String bookName;
    private List<CookingRecipe> recipes;

    public RecipeBook(String bookName) {
        this.bookName = bookName;
        this.recipes = new ArrayList<>();
    }

    public String getBookName() {
        return bookName;
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        for (CookingRecipe recipe : recipes) {
            if (recipe.getName().equals(name)) {
                return null; // Recipe already exists
            }
        }
        CookingRecipe newRecipe = new CookingRecipe(name);
        for (RecipeIngredient ingredient : ingredients) {
            newRecipe.addOrUpdateRecipeIngredient(ingredient, ingredient.getQuantity());
        }
        recipes.add(newRecipe);
        return newRecipe;
    }

    public CookingRecipe removeRecipe(String name) {
        for (CookingRecipe recipe : recipes) {
            if (recipe.getName().equals(name)) {
                recipes.remove(recipe);
                return recipe;
            }
        }
        return null; // Recipe not found
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        List<CookingRecipe> foundRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            boolean containsAllIngredients = true;
            for (RecipeIngredient ingredient : ingredients) {
                 //if (ingredient.getRecipeIngredient(ingredient) == null) {
                //     containsAllIngredients = false;
                //     break;
                // }
            }
            if (containsAllIngredients) {
                foundRecipes.add(recipe);
            }
        }
        return foundRecipes.isEmpty() ? null : foundRecipes.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        List<CookingRecipe> foundRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.getNumberOfIngredients() <= numberOfIngredients) {
                foundRecipes.add(recipe);
            }
        }
        return foundRecipes.isEmpty() ? null : foundRecipes.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesLowCalories() {
        if (recipes.isEmpty()) {
            return null;
        }
        // Find the minimum calories among all recipes
        float minCalories = recipes.stream()
                .map(CookingRecipe::calculateCalories)
                .min(Comparator.naturalOrder())
                .orElse(0f);

        List<CookingRecipe> lowCalorieRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.calculateCalories() == minCalories) {
                lowCalorieRecipes.add(recipe);
            }
        }
        return lowCalorieRecipes.toArray(new CookingRecipe[0]);
    }

    public String toString() {
        StringBuilder recipeString = new StringBuilder();
        recipeString.append("RecipeBook\n");
        recipeString.append("BookName = ").append(bookName).append("\n");
        for (CookingRecipe recipe : recipes) {
            recipeString.append(recipe.toString()).append("\n");
        }
        return recipeString.toString();
    }

    public boolean equals(Object obj) {
        int n = 0;
        if(obj instanceof RecipeBook) {
            if(obj instanceof CookingRecipe) {
            // for (CookingRecipe recipe : recipes) {
            //     if(recipe.equals(((RecipeBook)obj)).equas()) {
            //         n++;
            //     }
            // }
            // if(n == recipes.size()) {
            //     return true;
            }
            return(bookName.equals(((RecipeBook)obj).getBookName()));
        } 
        //}
        return false;
    }
}

    

/* 
All your above classes should implement the toString() and equals(Object) methods. 
The toString() method should return a string with the class name and then all the data fields one per each line. 
The equals(Object) should check all the data fields for each class. For example, two ingredients, Ingredient1 and Ingredient2 are equal if they both have the same name AND measuringUnit AND caloriesPerUnit.

You should also submit an image file UML.jpg with your UML diagram for the homework. You can create it with Violet or draw.io or any other UML diagram tool.
 */