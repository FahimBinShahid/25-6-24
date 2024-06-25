public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular","coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){
        if(burgerType.equalsIgnoreCase("delux")){
            this.burger = new DeluxBurger(burgerType, 8.5);
        }else{
            this.burger = new Burger(burgerType, 4.00);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side",sideType, 1.50);
    }

    public double getTotalPrice(){

        if(burger instanceof DeluxBurger){
            return burger.getAdjustablePrice();
        }
        return side.getAdjustablePrice() + drink.getAdjustablePrice() +
                burger.getAdjustablePrice();
    }

    public void printItemizedList(){

        burger.printItem();
        if(burger instanceof DeluxBurger){
            Item.printItem(drink.getName(),0);
            Item.printItem("TOTAL PRICE", getTotalPrice());
        }else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addTopping(extra1, extra2,extra3);
    }
    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxBurger db) {
            db.addTopping(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addTopping(extra1, extra2, extra3);
        }
    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
