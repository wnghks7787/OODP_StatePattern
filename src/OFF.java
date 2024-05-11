public class OFF implements State {

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On!");
        light.setState(new ON(light));
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Nothing Change");
    }
}
