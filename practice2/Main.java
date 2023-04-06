public class Main {
    public static void main(String[] args) {
        
        User user1 = new User("Michelle", "12345");
        System.out.println("1. " + user1.isValidPassword()); // false -- less than 8 characters

        User user2 = new User("Michelle", "12345Michelle");
        System.out.println("2. " + user2.isValidPassword()); // false -- contains username

        User user3 = new User("Michelle", "12345678");
        System.out.println("3. " + user3.isValidPassword()); // true

        System.out.println("4. " + user2.authenticate("ABCDE")); // false -- incorrect password
        System.out.println("5. " + user2.authenticate("12345Michelle")); // true 
        System.out.println("6. " + user3.authenticate("12345678")); // true



        //test SecureUser class
        System.out.println("Now lets test SecureUser");
        
        SecureUser s1 = new SecureUser("Chase", "12345"); 
        System.out.println("1. " + s1.isValidPassword()); // should return false;

        SecureUser s2 = new SecureUser("Chase", "12345Chase");
        System.out.println("2. " + s2.isValidPassword()); // false -- contains username

        SecureUser s3 = new SecureUser("Chase", "12345678");
        System.out.println("3. " + s3.isValidPassword()); // true

        SecureUser s4= new SecureUser("Chase5", "5");


        System.out.println("4. " + s2.authenticate("ABCDE")); // false -- incorrect password
        System.out.println("4. " + s2.authenticate("ABCDE"));
        System.out.println("4. " + s2.authenticate("ABCDE"));
        System.out.println("4 should fail. " + s2.authenticate("ABCDE")); 
        System.out.println("5. " + s2.authenticate("12345Chase")); // true even though bad password
        System.out.println("6. " + s3.authenticate("12345678")); // true
        System.out.println("Should return " + s4.isValidPassword()); //should be false


    }

}