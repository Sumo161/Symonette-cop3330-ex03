package ex03;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Asking user for quote ; input
        System.out.print("What is the quote? ");
        String quote =sc.nextLine();
        // Asking user to enter author name
        System.out.print("Who said it? ");
        String author =sc.nextLine();
        // Printing results
        System.out.println(author + "says,\""+quote+"\"");
    }
}