public class VariableScope {

    int x = 3; // class variable ( field ) = a variable that is declared outside a method and can be used by all methods in the class
                // java structure = local --> class ( field ) --> global 
    public static void main(String[] args){
        // variable scope = where a variable is accessible

        // local variable = a variable that is declared inside a method and can only be used in that method

        int x = 1; // local variable

        System.out.println(x); // this will work because x is accessible in this method
    }
    
    // System.out.println(x);  this will print 3 instead of 1 because this x is a class variable and is accessible in this method, but the local variable x is not accessible in this method because it is only accessible in the main method



}
