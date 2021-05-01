/* calculate the meal price of a meal using tip rate, tax rate and listed price */

public class GoingToRestaurant {
    public static void calculateMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tipPrice = listedMealPrice * tipRate;
        double taxPrice = listedMealPrice * taxRate;
        double mealPrice = listedMealPrice + tipPrice + taxPrice;
        System.out.println(mealPrice);
    }
    public static void main(String[] args) {
        calculateMealPrice(17, 0.2, .25);
        calculateMealPrice(31, 0.19, .22);
    }
}