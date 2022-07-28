public class Toy extends Thread {

    private static final int AWAITING_TIME = 500;

    @Override
    public void run() {
        Thread.currentThread().setName("Toy");
        while (!isInterrupted()) {
            try {
                Thread.sleep(AWAITING_TIME);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (Button.isPressed()) {
                System.out.println("Dont touCH MY BUTTON!!!");
                Button.push();
            }
        }
    }
}
