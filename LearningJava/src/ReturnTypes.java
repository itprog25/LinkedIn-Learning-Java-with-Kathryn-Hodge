public class ReturnTypes {
    public static double calculateTotalMealPrice(double listedMealPrice,double taxRate, double tipRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tax + listedMealPrice + tip;
        return result;
    }
    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100,.2,.08);
        System.out.println(groupTotalMealPrice);
        double individualTotalMealPrice = groupTotalMealPrice / 5;
        System.out.println("Individual total Meal Price = " + individualTotalMealPrice);
    }
}
