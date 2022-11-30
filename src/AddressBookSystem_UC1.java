import java.util.*;

public class AddressBookSystem_UC1 {
    class Person {
            String name;
            String address;
            int age;

            public Person() {
                name = "null";
                address = "null";
                age = 0;
                System.out.printf("this is default");
            }

            public Person(String a, String b, int d) {
                name = a;
                address = b;
                age = d;
            }

            public void readPerson() {
                System.out.printf("Enter the person details");
                Scanner sc = new Scanner(System.in);
                System.out.printf("Enter First Name");
                name = sc.next();
                System.out.printf("Enter Address");
                address = sc.next();
                System.out.printf("Enter Age");
                age = sc.nextInt();
            }
        }
    }
