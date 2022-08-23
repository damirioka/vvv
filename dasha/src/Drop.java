import java.util.Random;

public class Drop {
    static String[] directions = {"up", "down", "left", "right"};
    String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection (String direction){
        if(direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right")) {
            this.direction = direction;
        }
    }

    Drop() {
        direction = directions[(new Random()).nextInt(3)];
    }
}
