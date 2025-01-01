import java.util.List;

/**
 * @Author : yueqiao
 * @create 2024/11/21 22:45
 */
public class Solution3248 {

    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;
        for (String command : commands) {
            switch (command) {
                case "UP":
                    y--;
                    break;
                case "DOWN":
                    y++;
                    break;
                case "LEFT":
                    x--;
                    break;
                case "RIGHT":
                    x++;
                    break;
            }
        }
        return (x * n) + y;
    }

}
