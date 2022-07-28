public class Button {
    private static volatile boolean state = false;

    public static boolean isPressed() {
        return state;
    }

    public static void push() {
        state = !state;
    }
}
