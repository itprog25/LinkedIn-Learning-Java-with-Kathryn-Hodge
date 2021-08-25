public class FunctionWithInputs {
    public static void calculateTotalMealPrice(double listedMealPrice,double taxRate, double tipRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tax + listedMealPrice + tip;
        System.out.println("Your total Meal Price is:" + result);
    }
    public static void main(String[] args) {
        calculateTotalMealPrice(15,.2,.08);
        calculateTotalMealPrice(15,.3,.18);
    }
}
