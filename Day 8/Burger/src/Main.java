public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("drink","coke",1.50);
//        coke.printItem();;
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping","avocado",1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addTopping("BACON","CHEESE","MAYE");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize(("LARGE"));
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
//        secondMeal.addBurgerToppings("LETTUCE","BACON","CHEESE");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxMeal = new MealOrder("delux","Mirinda","chili");
        deluxMeal.addBurgerToppings("AVOCADO","LETTUCE","LETUCE","CHEESE", "MAYO");
        deluxMeal.setDrinkSize("SMALL");
        deluxMeal.printItemizedList();
    }
}