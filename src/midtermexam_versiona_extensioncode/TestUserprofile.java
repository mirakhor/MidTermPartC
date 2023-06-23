/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Elnaz
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();

        System.out.println("Please choose your favorite genre from the following options:");
        for(String genre : UserProfile.genres){
            System.out.println("- " + genre);
        }

        String userGenre = scanner.nextLine();

        UserProfile userProfile = new UserProfile(userName, userGenre);
        System.out.println("Your userProfile was created!");
        System.out.println("the user is" + userProfile.getUserID());
        System.out.println("the user genre" + userProfile.getGenre());
        
    }
}
        

   
    

