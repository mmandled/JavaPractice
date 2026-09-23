public class overloadedMethods {

    public static void main(String[] args) {

        // Overloaded Methods = methods that share the same name, but different parameters signature = name + parameter

//        System.out.println(add(3, 5));

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);
    }

    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " +  bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " +  bread + " pizza";
    }

}
