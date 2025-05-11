public class User {
    private String username;
    private int points;

    public User(String username) {
        this.username = username;
        this.points = 0;
    }

    public String getUsername() {
        return username;
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
