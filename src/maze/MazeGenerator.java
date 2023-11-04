package maze;

import java.util.Random;

public class MazeGenerator {
    public static int[][] generateMaze(int width, int height) {
        int[][] maze = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                maze[i][j] = 1; // 初始化迷宫，将所有位置都设置为障碍
            }
        }

        Random rand = new Random();
        int startX = rand.nextInt(width);
        int startY = rand.nextInt(height);
        generatePath(maze, startX, startY);

        // 设置玩家位置
        maze[startX][startY] = 2;

        return maze;
    }

    private static void generatePath(int[][] maze, int x, int y) {
        int[] directions = {1, 2, 3, 4}; // 上、下、左、右
        shuffleArray(directions);

        for (int dir : directions) {
            int newX = x;
            int newY = y;

            switch (dir) {
                case 1: // 上
                    newX -= 2;
                    break;
                case 2: // 下
                    newX += 2;
                    break;
                case 3: // 左
                    newY -= 2;
                    break;
                case 4: // 右
                    newY += 2;
                    break;
            }

            if (newX > 0 && newX < maze.length - 1 && newY > 0 && newY < maze[0].length - 1) {
                if (maze[newX][newY] == 1) {
                    maze[newX][newY] = 0; // 打通路径
                    maze[(newX + x) / 2][(newY + y) / 2] = 0; // 打通相邻位置
                    generatePath(maze, newX, newY);
                }
            }
        }
    }

    private static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        int[][] maze = generateMaze(width, height);

        // 打印迷宫
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
