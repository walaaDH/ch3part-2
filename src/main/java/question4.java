
public class question4 {
    interface cubeService{
        int cube(int value);
    }
    public static void main(String[] args) {
        cubeService cService = (int value)->{return value*value*value;};
    }
}
