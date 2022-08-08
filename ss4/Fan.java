package ss4;

public class Fan {
    private int speed;
    private boolean button;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.button = false;
        this.radius = 5;
        this.color = "yellow";
    }
    public Fan(int speed, boolean button, double radius, String color) {
        this.speed = speed;
        this.button = false;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean getButton() {
        return button;
    }
    public void setButton(boolean button) {
        this.button = button;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        String state = "";
        if (this.Button()) {
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
    private boolean Button() {
        return false;
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"green");
        Fan fan2 = new Fan(2,false,5,"yellwo");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
