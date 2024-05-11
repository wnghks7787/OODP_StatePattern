public class Light {
    private static int ON = 0;  // LightBulb state == ON
    private static int OFF = 1; // LightBulb state == OFF
    private int state;          // Current state of Lightbulb

    public Light() {
        state = OFF;    // Initial LightBulb == OFF
    }

    public void on_button_pushed() {
        if(state == ON) {
            System.out.println("Nothing Change");
        } else {    // If state is off when on button pushed, change state to on.
            System.out.println("Light ON!");
            state = ON;
        }
    }

    public void off_button_pushed() {
        if(state == OFF) {
            System.out.println("Nothing Change");
        } else {    // If state is on when off button pushed, change state to off.
            System.out.println("Light OFF!");
            state = OFF;
        }
    }
}
