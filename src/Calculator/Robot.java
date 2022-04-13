package Calculator;


/*  errors - x
    warnings - y
    x - 1 = x + 1
    x - 2 = null
    y - 1 = y + 2
    y - 2 = x + 1
 */

public class Robot {
    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.UP;
    public Robot(Direction direction,int x, int y){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    static Robot robot = new Robot(Direction.UP,3,0);
    public static void main(String[] args) {
        moveRobot(Robot.robot, robot.getX(), robot.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction startDirection = robot.getDirection();
        int startX = robot.getX();
        int startY = robot.getY();
        int wayToX = Math.abs(startX - toX);
        int wayToY = Math.abs(startY - toY);
        if (startX <= toX && startY <= toY){
            while (startDirection != Direction.UP){
                robot.turnRight();
            }
        } else if (startX >= toX && startY >= toY){
            while (startDirection != Direction.DOWN){
                robot.turnRight();
            }
        } else if (startX >= toX && startY <= toY) {
            while (startDirection != Direction.UP){
                robot.turnRight();
            }
        } else if (startX <= toX && startY >= toY) {
            while (startDirection != Direction.DOWN){
                robot.turnRight();
            }
        }

    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction){
            case UP -> this.direction = Direction.LEFT;
            case LEFT -> this.direction = Direction.DOWN;
            case DOWN -> this.direction = Direction.RIGHT;
            case RIGHT -> this.direction = Direction.UP;
        }
    }

    public void turnRight() {
        switch (direction){
            case UP -> this.direction = Direction.RIGHT;
            case LEFT -> this.direction = Direction.UP;
            case DOWN -> this.direction = Direction.LEFT;
            case RIGHT -> this.direction = Direction.DOWN;
        }
    }

    public void stepForward() {
        switch (direction){
            case UP -> y++;
            case RIGHT -> x++;
            case DOWN -> y--;
            case LEFT -> x--;
        }
    }
}
