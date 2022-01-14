package MazeProblems;

import java.util.Arrays;

public class PrintingAllPaths {
    public static void main(String[] args) {
        boolean[][] mat = {{true,true,true},{true,true,true},{true,true,true}};
        int[][] maze = new int[mat.length][mat[0].length];
        paths(mat, maze, 1, 0, 0, "");
    }

    private static void paths(boolean[][] mat, int[][] maze, int steps, int r, int c, String p) {
        if (r == mat.length-1 && c == mat[0].length-1){
            maze[r][c] = steps;
            for (var x: maze) {
                System.out.println(Arrays.toString(x));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!mat[r][c]) return;

        mat[r][c] = false;
        maze[r][c] = steps;

        if (c > 0){
            paths(mat, maze, steps + 1, r, c-1, p + 'L');
        }
        if (r > 0){
            paths(mat, maze, steps + 1, r-1, c, p + "U");
        }
        if (c < mat[0].length-1){
            paths(mat, maze, steps + 1, r, c+1, p + 'R');
        }
        if (r < mat.length-1){
            paths(mat, maze, steps + 1, r+1, c, p + 'D');
        }
        mat[r][c] = true;
        maze[r][c] = 0;
    }
}
