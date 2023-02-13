import java.util.Scanner;

public class test {

    public static void main(String[] args) {
            String studentNames [] = {"Dea", "Astrid", "Josh", "Egene",
            "Ning", "Argene", "Riona", "Mario", "Nanie", "Ligaya"};

            studentNames [9] = "Medea";
            int numbers [] = {1,2,3,4,5,6,7,8,9,10};

            String names [] = new String[10];
            int age [] = new int[10];

        Scanner dea = new Scanner(System.in);


        System.out.println(studentNames[9]);
        System.out.println(numbers[3] + numbers[4]);

        System.out.println("Enter Name: ");
        names [0] = dea.next();
        System.out.println("Enter Age: ");
        age [0] = dea.nextInt();

        System.out.println(names [0] + age [0]);

        String email [] = {"dea@gmail.com", "josh@gmail.com",
                "astrid@gmail.com"};
        String userNames [] = {"dea", "josh", "astrid"};
        String passwords [] = {"dea1234", "josh1234", "astrid1234"} ;

        int i = 0;
        int o = 1;
        int a = 2;


        System.out.println("Enter Email   : " + email[i]);
        System.out.println("Enter Username: " + userNames[i]);
        System.out.println("Enter Password: "+ passwords[i]);

        System.out.println("Enter Email   : " + email[o]);
        System.out.println("Enter Username: " + userNames[o]);
        System.out.println("Enter Password: "+ passwords[o]);

        System.out.println("Enter Email   : " + email[a]);
        System.out.println("Enter Username: " + userNames[a]);
        System.out.println("Enter Password: "+ passwords[a]);



    }
}
