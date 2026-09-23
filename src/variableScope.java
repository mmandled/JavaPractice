public class variableScope {

    static int x = 3; // SCOPE

    public static void main(String[] args) {

        // Variable scope = where a variable can be accessed

        int x = 1; // LOCAL VARIABLE

        doSomething();
    }
    static void doSomething(){
        int x = 2 ; // LOCAL VARIABLE

        System.out.println(x);
    }
}
