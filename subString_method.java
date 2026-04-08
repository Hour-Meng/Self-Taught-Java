public class subString_method {
    public static void main(String[] args) {

        // substring() = a method that extracts a part of the string.
        //  .subString(start, end)


        String name = "George cool";

        String firstName = name.substring(0,6);

        System.out.println(firstName);

        String email = "George@gmail.com";

        String name_email = email.substring(0, email.indexOf("@")); // will stop when it reach @

        String domain_email = email.substring(email.indexOf("@")); // starting from @ till the end of the string

        System.out.printf("\nname: %s \ndomain: %s\nfull address: %s\n", name_email, domain_email, email);

    }
}