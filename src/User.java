public class User implements Runnable {
    private String name;
    private static final int TIME_FOR_PRESSING = 2000;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("User");
        for (int i = 0; i < 5; i++) {
            Button.push();
            System.out.println(name + " pressed button");
            try {
                Thread.sleep(TIME_FOR_PRESSING);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
