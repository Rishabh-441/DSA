package MazeProblems;
//Backtracking
public class MazeInAllDirections {
    public static void main(String[] args) {
        boolean[][] mat = {{true,true,true},{true,true,true},{true,true,true}};
        paths(mat, 0, 0, "");
    }

    private static void paths(boolean[][] mat, int r, int c, String p) {
        if (r == mat.length-1 && c == mat[0].length-1){
            System.out.println(p);
            return;
        }
        if (!mat[r][c])
            return;

        mat[r][c] = false;

        if (c > 0){
            paths(mat, r, c-1, p + 'L');
        }
        if (r > 0){
            paths(mat, r-1, c, p + "U");
        }
        if (c < mat[0].length-1){
            paths(mat, r, c+1, p + 'R');
        }
        if (r < mat.length-1){
            paths(mat, r+1, c, p + 'D');
        }
        mat[r][c] = true;
    }
}
