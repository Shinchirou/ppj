public class TrafficLight {

    private String state;



    private String lightType;

    public TrafficLight(String state) {
        this.state = state;
    }

    public TrafficLight(String state, String lightType){
        this.state = state;
        this.lightType = lightType;
    }

    public String toString(){
    return "State: " + state + "\nLight type: " + lightType;
    }

    public void green() {
        if (state.equals("green")) {
            System.out.println("The light is already green.");
        } else if (state.equals("red")) {
            System.out.println("The light has " + state + " color " +
                    "but must be yellow before it can become green.");

        } else {
            state = "green";
            System.out.println("The light is now green.");
        }
    }

    public void yellow() {
        if (state.equals("green") || state.equals("red")) {
            state = "yellow";
            System.out.println("The light is now yellow.");
        } else {
            System.out.println("The light is already yellow");
        }
    }

    public void red() {
        if (state.equals("red")) {
            System.out.println("The light is already red.");
        } else if (state.equals("green")) {
            System.out.println("The light has " + state + " color " +
                    "but must be yellow before it can become red.");

        } else {
            state = "green";
            System.out.println("The light is now red.");
        }
    }


    public String getLightType() {
        return lightType;
    }

    public void setLightType(String lightType) {
        this.lightType = lightType;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
