package books;
import books.Methods.Choice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods1{
    //method for the third ArrayList
    public void prices(){
        ArrayList<Integer> Price =new ArrayList<Integer>();
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150);Price.add(200);Price.add(200);
        Price.add(200);Price.add(200);Price.add(200);
        Price.add(250);Price.add(300);

        System.out.println("the price of\"And Then There Were None\"is"+"  " +Price.get(0));
        System.out.println("the price of \"The Mysterious Affair at Styles\"is"+"  "+Price.get(1));
        System.out.println("the price of\"Death on The Nile\"is"+"  "+Price.get(2));
        System.out.println("the price of \"The A.B.C. Murders\"is"+"  "+Price.get(3));
        System.out.println("the price of \"The Murder of Roger Ackroyd\"is"+"  "+Price.get(4));
        System.out.println("the price of \"Crooked House\"is"+"  "+Price.get(5));
        System.out.println("the price of \"Curtain\"is"+"  "+Price.get(6));
        System.out.println("the price of \"Peril at End House\"is"+"  "+Price.get(7));
        System.out.println("the price of \"Appointment with Death\"is"+"  "+Price.get(8));
        System.out.println("the price of \" Murder in Mesopotamia\"is"+"  "+Price.get(9));
        System.out.println("the price of \"The Big Four\"is"+"  "+Price.get(10));
        System.out.println("the price of \" Murder in Mesopotamia\"is"+"  "+Price.get(11));
        System.out.println("the price of \" Death in the Clouds\"is"+"  "+Price.get(12));
        System.out.println("the price of \"Harry Potter and the Philosophers Stone\"is"+"  "+Price.get(13));
        System.out.println("the price of \"Harry Potter and the Chamber of Secrets\"is"+"  "+Price.get(14));
        System.out.println("the price of \"Harry Potter and the Prisoner of Azkaban\"is"+"  "+Price.get(15));
        System.out.println("the price of \"Harry Potter and the Goblet of Fire\"is"+"  "+Price.get(16));
        System.out.println("the price of \"Harry Potter and the Order of the Phoenix\"is"+"  "+Price.get(17));
        System.out.println("the price of \"Harry Potter and the Half-Blood Prince\"is"+"  "+Price.get(18));
        System.out.println("the price of \"Harry Potter and the Deathly Hallows\"is"+"  "+Price.get(19));}
    //Overloading method to calculate the total of the element of the ArrayList
    public void prices( int priA){
        Methods1.this.prices();
        ArrayList<Integer> Price =new ArrayList<Integer>();
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150);Price.add(200);Price.add(200);
        Price.add(200);Price.add(200);Price.add(200);
        Price.add(250);Price.add(300);
        int total=0;
        for(int tot=0;tot<Price.size();tot++){
            total+=Price.get(tot);}
        // System.out.println("the total of all prices is "+" "+total);
    }
    //Overloading method to calculate the Maximum of the element of the ArrayList
    public void prices( int priA,int priB){
        Methods1.this.prices();
        ArrayList<Integer> Price =new ArrayList<Integer>();
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150);Price.add(200);Price.add(200);
        Price.add(200);Price.add(200);Price.add(200);
        Price.add(250);Price.add(300);
        if(Price.get(0)>Price.get(1)&&Price.get(0)>Price.get(2)){
            System.out.println("the maximum price is"+" "+ Price.get(0));}
        else
        if(Price.get(1)>Price.get(0)&&Price.get(1)>Price.get(2)){
            System.out.println("the maximum price is"+" "+ Price.get(1));}
        else
        if(Price.get(2)>Price.get(0)&&Price.get(2)>Price.get(3)){
            System.out.println("the maximum price is"+" "+ Price.get(2));}
        else
        if(Price.get(3)>Price.get(2)&&Price.get(3)>Price.get(4)){
            System.out.println("the maximum price is"+" "+ Price.get(3));}
        else
        if(Price.get(4)>Price.get(3)&&Price.get(4)>Price.get(5)){
            System.out.println("the maximum price is"+" "+ Price.get(4));}
        else
        if(Price.get(5)>Price.get(4)&&Price.get(5)>Price.get(6)){
            System.out.println("the maximum price is"+" "+ Price.get(5));}
        else
        if(Price.get(6)>Price.get(5)&&Price.get(6)>Price.get(7)){
            System.out.println("the maximum price is"+" "+ Price.get(6));}
        else
        if(Price.get(7)>Price.get(6)&&Price.get(7)>Price.get(8)){
            System.out.println("the maximum price is"+" "+ Price.get(7));}
        else
        if(Price.get(8)>Price.get(7)&&Price.get(8)>Price.get(9)){
            System.out.println("the maximum price is"+" "+ Price.get(8));}
        else
        if(Price.get(9)>Price.get(8)&&Price.get(9)>Price.get(10)){
            System.out.println("the maximum price is"+" "+ Price.get(9));}
        else
        if(Price.get(10)>Price.get(9)&&Price.get(10)>Price.get(11)){
            System.out.println("the maximum price is"+" "+ Price.get(10));}
        else
        if(Price.get(11)>Price.get(10)&&Price.get(11)>Price.get(12)){
            System.out.println("the maximum price is"+" "+ Price.get(11));}
        else
        if(Price.get(12)>Price.get(11)&&Price.get(12)>Price.get(13)){
            System.out.println("the maximum price is"+" "+ Price.get(12));}
        else
        if(Price.get(13)>Price.get(12)&&Price.get(13)>Price.get(14)){
            System.out.println("the maximum price is"+" "+ Price.get(13));}
        else
        if(Price.get(14)>Price.get(13)&&Price.get(14)>Price.get(15)){
            System.out.println("the maximum price is"+" "+ Price.get(14));}
        else
        if(Price.get(15)>Price.get(14)&&Price.get(15)>Price.get(16)){
            System.out.println("the maximum price is"+" "+ Price.get(15));}
        else
        if(Price.get(16)>Price.get(15)&&Price.get(16)>Price.get(17)){
            System.out.println("the maximum price is"+" "+ Price.get(16));}
        else
        if(Price.get(17)>Price.get(16)&&Price.get(17)>Price.get(18)){
            System.out.println("the maximum price is"+" "+ Price.get(17));}
        else
        if(Price.get(18)>Price.get(17)&&Price.get(18)>Price.get(19)){
            System.out.println("the maximum price is"+" "+ Price.get(18));}
        else
            System.out.println("The maximum Price is"+" "+Price.get(19));
    }
    //Overloading method for Searching inside the ArrayList
    public void prices(int priA,int priB ,int priC){
        Methods1.this.prices();
        ArrayList<Integer> Price =new ArrayList<Integer>();
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150);Price.add(200);Price.add(200);
        Price.add(200);Price.add(200);Price.add(200);
        Price.add(250);Price.add(300);
        int location;
        location=Price.get(19);
        System.out.println("the highest price is"+" "+ location);
        int location1;
        location1=Price.get(18);
        System.out.println("Second highest price"+" "+location1);
        int location2;
        location2=Price.get(17);
        System.out.println("Third highest price"+" "+location2);
        int location3;
        location3=Price.get(0);
        System.out.println("Lowest price"+" "+location3);}

    //Overloading method for Sorting the ArrayList
    public void prices( int priA,int priB ,int priC,int priD){
        Methods1.this.prices();
        ArrayList<Integer> Price =new ArrayList<Integer>();
        ArrayList<Integer> Price1 =new ArrayList<Integer>();
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150); Price.add(150);Price.add(150);
        Price.add(150);Price.add(150); Price.add(150);
        Price.add(150);Price.add(200);Price.add(200);
        Price.add(200);Price.add(200);Price.add(200);
        Price.add(250);Price.add(300);
        //ArrayList befor sorting
        System.out.println("Before Sorting:");
        for(int sor:Price ){
            System.out.println(sor);
        }
        /* Sorting in decreasing order*/

        Collections.sort(Price,Collections.reverseOrder());
        System.out.println("ArrayList in descending order:");
        for(int sor1: Price){
            System.out.println(sor1);
            /* Sorted List in reverse order*/
        }
    }}



