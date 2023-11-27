public class TestRecipeBook {
    
    public static void main(String[] args) {
        RecipeBook recipeBook = new RecipeBook("My Recipe Book");

        // Create ingredients
        Ingredient sugar = new Ingredient("Sugar", "g", 387);
        Ingredient flour = new Ingredient("Flour", "g", 364);

        // Create recipe ingredients
        RecipeIngredient sugarRecipe = new RecipeIngredient("Sugar", "g", 387, 200);
        RecipeIngredient flourRecipe = new RecipeIngredient("Flour", "g", 364, 300);

        // Add a recipe
        RecipeIngredient[] pancakeIngredients = {sugarRecipe, flourRecipe};
        CookingRecipe pancakeRecipe = recipeBook.addRecipe("Pancakes", pancakeIngredients); 
    

        System.out.println("test 1: ");
        System.out.print(recipeBook);
        //System.out.println(pancakeIngredients);
        //System.out.println(pancakeRecipe);
        System.out.println(flour);
        System.out.println(sugar);
    }
}

/*
 * TestRecipeBook.java class should contain a main method that tests all the methods in the problem.
 */