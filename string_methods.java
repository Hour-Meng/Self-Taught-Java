public class string_methods {
    public static void main(String[] args){
        String name = "George";

        // length() = returns the length of a string

        int nameLength = name.length();
        System.out.println("The length of the name is: " + nameLength);
        // or 
        System.out.println("The length of the name is: " + name.length()); // same thing as above

        // charAt() = returns the character at a specific index in a string
        System.out.println("The character at index 0 is: " + name.charAt(0));

        // lastIndexOf() = returns the index of the last occurrence of a specific character in a string
        System.out.println("The index of the last occurrence of 'e' is: " + name.lastIndexOf('e'));

        // toUpperCase() = returns a new string with all characters in uppercase
        System.out.println("The name in uppercase is: " + name.toUpperCase());

        // toLowerCase() = returns a new string with all characters in lowercase
        System.out.println("The name in lowercase is: " + name.toLowerCase());

        // trim() = returns a new string with leading and trailing whitespace removed
        String nameWithSpaces = "   George   ";
        System.out.println("The name with spaces is: '" + nameWithSpaces + "'");
        System.out.println("The name without spaces is: '" + nameWithSpaces.trim() + "'");

        // replace() = returns a new string with all occurrences of a specific character replaced with another character
        System.out.println("The name with 'e' replaced with 'a' is: " + name.replace('e', 'a'));

        // isEmpty() = returns true if the string is empty, and false if it is not
        String emptyString = "";
        System.out.println("Is the string empty? " + emptyString.isEmpty());
    
    }
    
}