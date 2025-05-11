public class Main {
    public static void main(String[] args) {
        GachaSystem gs = new GachaSystem();
        User user = new User("Bob");
        HomeworkSystem hs = new HomeworkSystem(user);

        hs.completeHomework();

        if (user.spendPoints(10))
            gs.draw();
    }
}
