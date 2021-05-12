package emailapp;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class EmailAccount {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmailAddress;
    private int defaultPasswordLength = 10;
    String emailAddress;

    // Constructor to receive the first and last name of the new user
    public EmailAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for user " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = randomPasswordGenerator(defaultPasswordLength);
        System.out.println("Password: " + this.password);
        this.emailAddress = (this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "." + this.department.toLowerCase() + ".gmail.com");
        System.out.print(this.emailAddress);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("Enter the department of this user:");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounts");
        Scanner developerInput = new Scanner(System.in);
        int userDepartment = developerInput.nextInt();
        if(userDepartment == 1) {
            return "Sales";
        } else if(userDepartment == 2) {
            return "Development";
        } else if (userDepartment == 3) {
            return "Accounts";
        } else {
            return "Unknown";
        }
    }
    // Generate a random password
    private String randomPasswordGenerator(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVQXYZ1234567890";
        char[] password = new char[length];
        for(int i=0; i<length; i++) {
            Random rng = new Random();
            int randomNumber = rng.nextInt(length);
            password[i] = passwordSet.charAt(randomNumber);
        }
        String userPassword = new String(password);
        return userPassword;
    }
    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email address
    public void setAlternateEmailAddress(String alternateEmailAddress) {
        this.alternateEmailAddress = alternateEmailAddress;
    }
    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public void printAll() {
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Department: " + this.department);
        System.out.println("Email address: " + this.emailAddress);
        System.out.println("Alternative email address: " + this.alternateEmailAddress);
        System.out.println("Mailbox capacity: " + this.mailboxCapacity);
        System.out.println("Password: " + this.password);
    }

}
