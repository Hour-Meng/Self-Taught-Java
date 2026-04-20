public class OverLoadedMethods {
    public static void main(String[] args){


        // overloaded method = methods that share the same name but have different parameters ( number of parameters, type of parameters, order of parameters )

        System.out.println(add(1, 2));
        System.out.println(add(1.5, 2.5));
        System.out.println(add(1, 2, 3));

    }

    static int add(int a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

}
