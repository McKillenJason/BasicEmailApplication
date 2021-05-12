package emailapp;

public class EmailApplication {
    public static void main(String[] args) {
        EmailAccount ea1 = new EmailAccount("Jason", "McKillen");
        ea1.printAll();
        ea1.setAlternateEmailAddress("jasonmckillen@gmail.com");
        ea1.changePassword("Bababooie");
        ea1.setMailboxCapacity(200);
        ea1.printAll();
    }
}
