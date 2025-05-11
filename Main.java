public class Main {
    public static void main(String[] args) {
        System.out.println("whattf");
        GachaSystem gs = new GachaSystem();
        User user = new User("bob");
        HomeworkSystem hs = new HomeworkSystem(user);

        hs.completeHomework();

        if (User.spendPoints())
            GachaSystem.draw();
    }
}
