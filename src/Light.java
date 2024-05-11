public class Light {
    private State state;          // Current state of Lightbulb

    public Light() {
        state = new OFF();    // Initial LightBulb == OFF
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on_button_pushed() {
        state.on_button_pushed(this);
    }

    public void off_button_pushed() {
        state.on_button_pushed(this);
    }
}
