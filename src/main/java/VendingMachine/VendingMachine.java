package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    //daca nu este in stoc drink-ul si daca user-ul nu a introdus destui bani atunci aruncam out of stock
    //daca nu are suficienti bani, aruncam insufccient money
    //daca are bani, dar nu este in stoc, atuncam out of stock


    private Map<Integer, Drink> registeredDrinks;

    public VendingMachine(){
        this.registeredDrinks = new HashMap<Integer, Drink>();
    }

    public void registerDrink(int buttonPressed, Drink drink){
        registeredDrinks.put(buttonPressed,drink);
    }

    public ServedDrinkSummary dispatch (int buttonPressed, int money) throws OutOfStockException, InsufficientMoneyException{
        ServedDrinkSummary servedDrinkSummary = new ServedDrinkSummary();
        Drink chosenDrink = registeredDrinks.get(buttonPressed);
        if (money < chosenDrink.getPrice() && chosenDrink.getQuantity()<=0) {
            throw new OutOfStockException("outofstock");
        } else if (money<chosenDrink.getPrice()) {
            throw new InsufficientMoneyException("insuficcient money");
        } else if (chosenDrink.getQuantity()<=0){
            throw new OutOfStockException("outofstock");
        }
        servedDrinkSummary.setDrink(chosenDrink);
        servedDrinkSummary.setChange(money- chosenDrink.getPrice());
        return servedDrinkSummary;

    }
}
