/* 5 friends need to divide the total price amongst themselves, find it */
public class GoingToRestaurant_1 {
    public static double calculateMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tipPrice = listedMealPrice * tipRate;
        double taxPrice = listedMealPrice * taxRate;
        double mealPrice = listedMealPrice + tipPrice + taxPrice;
        System.out.println("Total meal price is: " + mealPrice);
        return mealPrice;
    }
    public static void main(String[] args) {
        double mealPrice = calculateMealPrice(99, .5, .28);
        double individualMealPrice = mealPrice/5;
        System.out.println("The price each one will pay is: " + individualMealPrice);
    }
}
