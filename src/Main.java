public class Main {

    public static void main(String[] args) {

        User user = new User("Gleb");
        Toy toy = new Toy();
        new Thread(null, user).start();
        Thread toyThread = new Thread(null, toy);
        toyThread.setDaemon(true);
        toyThread.start();
    }
}
