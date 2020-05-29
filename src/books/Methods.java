package books;
import books.Methods1;
import java.util.Scanner;
import java.util.ArrayList;
class Methods {
    //method for the menu
    public static void DisplayMenu(){
        String[] menu ={" 1- Display All Novels","2- Display Crime and Action Novels",
                "3- Display Metaphysics Novels","4- Display The Price For every Book","5- Get total Of Prices"
                ,"6- Get Maximum  Of Prices",
                "7- Searching the highest price of Novels",
                "8- Sorting Prices","9- Setting To CrimeAndAction ",
                "10- Removing from CrimeAndAction","11- Exist"
        };for(String men : menu){
            System.out.println(men);
        }
    }
    static class Choice{
        //method for the frist ArrayList
        void books1(){
            ArrayList<String>  CrimeAndAction=new ArrayList<String>();
            CrimeAndAction.add("And Then There Were None");
            CrimeAndAction.add("The Mysterious Affair at Styles");
            CrimeAndAction.add("Death on The Nile");
            CrimeAndAction.add(" The A.B.C. Murders");
            CrimeAndAction.add("The Murder of Roger Ackroyd");
            CrimeAndAction.add(" Crooked House");
            CrimeAndAction.add("Curtain");
            CrimeAndAction.add("Peril at End House");
            CrimeAndAction.add("Appointment with Death");
            CrimeAndAction.add("A murder is announced");
            CrimeAndAction.add(" The Big Four");
            CrimeAndAction.add(" Murder in Mesopotamia");
            CrimeAndAction.add("Death in the Clouds");
            for(String bok1 :CrimeAndAction){
                System.out.println(bok1);}
        } //method for the second ArrayList
        private void books2(){
            ArrayList<String>  Metaphysics=new ArrayList<String>();
            Metaphysics.add("Harry Potter and the Philosophers Stone");
            Metaphysics.add("Harry Potter and the Chamber of Secrets");
            Metaphysics.add("Harry Potter and the Prisoner of Azkaban");
            Metaphysics.add("Harry Potter and the Goblet of Fire");
            Metaphysics.add("Harry Potter and the Order of the Phoenix");
            Metaphysics.add("Harry Potter and the Half-Blood Prince");
            Metaphysics.add("Harry Potter and the Deathly Hallows");
            for(String bok2 :Metaphysics){
                System.out.println(bok2);
            }
        } //method for Seeting into the frist ArrayList
        void booksA(){
            Choice.this.books1();
            ArrayList<String>  CrimeAndAction=new ArrayList<String>();
            CrimeAndAction.add("And Then There Were None");
            CrimeAndAction.add("The Mysterious Affair at Styles");
            CrimeAndAction.add("Death on The Nile");
            CrimeAndAction.add(" The A.B.C. Murders");
            CrimeAndAction.add("The Murder of Roger Ackroyd");
            CrimeAndAction.add(" Crooked House");
            CrimeAndAction.add("Curtain");
            CrimeAndAction.add("Peril at End House");
            CrimeAndAction.add("Appointment with Death");
            CrimeAndAction.add("A murder is announced");
            CrimeAndAction.add(" The Big Four");
            CrimeAndAction.add(" Murder in Mesopotamia");
            CrimeAndAction.add("Death in the Clouds");
            System.out.println("\n");
            CrimeAndAction.set(5," The Big Four");
            CrimeAndAction.set(6," Murder in Mesopotamia");
            CrimeAndAction.set(1,"Death in the Clouds");
            CrimeAndAction.remove(10);
            CrimeAndAction.remove(1);
            System.out.println(" ArrayList After Setting is :"+" ");
            System.out.println("\n");
            for(String set1:CrimeAndAction){
                System.out.println(set1);}
        } //method for  Removing from the frist ArrayList
        void booksB(){
            Choice.this.books2();
            ArrayList<String>  Metaphysics=new ArrayList<String>();
            Metaphysics.add("Harry Potter and the Philosophers Stone");
            Metaphysics.add("Harry Potter and the Chamber of Secrets");
            Metaphysics.add("Harry Potter and the Prisoner of Azkaban");
            Metaphysics.add("Harry Potter and the Goblet of Fire");
            Metaphysics.add("Harry Potter and the Order of the Phoenix");
            Metaphysics.add("Harry Potter and the Half-Blood Prince");
            Metaphysics.add("Harry Potter and the Deathly Hallows");
            System.out.println("\n");
            Metaphysics.remove(2);
            Metaphysics.remove(3);
            System.out.println(" ArrayList After Removing is :"+" ");
            System.out.println("\n");
            for(String remo:Metaphysics){
                System.out.println(remo);}

        }  //method for Selection from the menu
        public boolean choiceFromMenu(){
            Scanner option = new Scanner(System.in);
            int choice;
            System.out.println("choice");
            choice = option.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Display All Novels :");
                    Choice objbooks= new Choice();
                    objbooks.books1();
                    objbooks.books2();
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 2:
                    System.out.println("Display Crime and Action Novels");
                    Choice objbooks1= new Choice();
                    objbooks1.books1();
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 3:
                    System.out.println("Display Metaphysics Novels");
                    Choice objbooks2= new Choice();
                    objbooks2.books2();
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 4:
                    System.out.println("Display The Price For every Book");
                    Methods1 met= new Methods1();
                    met.prices();
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 5:
                    System.out.println(" Get Total Of Prices");
                    Methods1 met1= new Methods1();
                    met1.prices(5);
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 6:
                    System.out.println(" Get Maximum Of Prices");
                    Methods1 met2= new Methods1();
                    met2.prices( 5,6 );
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 7:
                    System.out.println("Searching for the highest price of Novels");
                    Methods1 met3= new Methods1();
                    met3.prices( 5,6,7 );
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 8:
                    System.out.println("Sorting Prices");
                    Methods1 met4= new Methods1();
                    met4.prices( 5,6,7,8 );
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 9:
                    System.out.println("Setting To CrimeAndAction ");
                    Choice bokA= new Choice();
                    bokA.booksA();
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 10:

                    System.out.println(" Removing from  Metaphysics");
                    Choice bokB= new Choice();
                    bokB.booksB();
                    System.out.println(" You can choose again or simply exit from the menu");
                    break;
                case 11:

                    System.out.println("Exist");
                    System.out.println("Thank you for your trust");
                    return false;


                default:
                    System.out.println(" you have to choice number from the menu");
            }

            return true; }


    }}


