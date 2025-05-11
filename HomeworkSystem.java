public class HomeworkSystem {
    private User user;

    public HomeworkSystem(User user) {
        this.user = user;
    }

    public void completeHomework() {
        user.addPoints(10);
        System.out.println("✅ Homework completed! You earned 10 points.");
    }
}
