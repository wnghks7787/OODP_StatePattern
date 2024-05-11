public class ON implements State {
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Nothing Change");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off!");
        light.setState(new OFF(light));
    }
}
