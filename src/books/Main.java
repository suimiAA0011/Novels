package books;
import  books.Methods.Choice;
import java.util.Scanner;

import java.util.ArrayList;
class novels {
    public void UserName(){
        String Name;
        System.out.println("please enter Your Name ");
        Scanner name = new Scanner(System.in);
        Name= name.next();
        System.out.println("Welcome " +Name);

    }

    public static void main(String[] args){
        novels nov = new novels();
        nov.UserName();
        int choice=11;

        //calling the menu
        Methods menu1 =new Methods();
        boolean choices=true;
        while(choices==true){
            menu1.DisplayMenu();
            //calling the method of Selection
            Choice objchoice = new Choice();
            choices= objchoice.choiceFromMenu();
           }
    }}
