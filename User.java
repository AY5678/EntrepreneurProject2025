import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;

public class User {
    private String username;
    private String password;
    private int points;

    public User() {
        this.points = 0;
    }

    public void initialize() {
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);

        while (username == "" && password.length() < 8) {
            System.out.println("Please enter your username and password to create an account. Make sure your password is at least 8 characters long.");
            
            System.out.println("Username: ");
            username = input.nextLine();
            System.out.println("Password: ");
            password = input.nextLine();

            System.out.println(username + ";" + password);
        }

        input.close();
        
        this.username = username;
        this.password = password;

        File file = new File("users.txt");
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(file, true));
            writer.println(username + ";" + password);
            writer.close();
        } catch (Exception e) {
            System.out.println("File does not exist.");
        }
    }

    public boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username and password to login.");

        System.out.println("Username: ");
        username = input.nextLine();
        System.out.println("Password: ");
        password = input.nextLine();

        input.close();

        File file = new File("users.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] userInfo = reader.nextLine().split(";");
                if (userInfo[0].equals(username) && userInfo[1].equals(password))
                    return true;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("File does not exist.");
        }
        
        return false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int amount) {
        points += amount;
    }

    public boolean spendPoints(int amount) {
        if (points >= amount) {
            points -= amount;
            return true;
        }
        return false;
    }
}
