public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.off_button_pushed();  // nothing change
        light.on_button_pushed();
        light.off_button_pushed();
    }
}