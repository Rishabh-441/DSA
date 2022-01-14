package MazeProblems;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] mat = {{true,true,true},{true,false,true},{true,true,true}};
        paths(mat,0,0, "");
    }

    private static void paths(boolean[][] mat, int r, int c, String p) {
        if (r == mat.length-1 && c == mat[0].length-1){
            System.out.println(p);
            return;
        }
        if (!mat[r][c]){
            return;
        }
        if (r == mat.length-1){
            paths(mat, r, c+1, p + 'R');
            return;
        }
        else if (c == mat[0].length-1){
            paths(mat,r+1, c, p + 'D');
            return;
        }

        paths(mat,r+1, c, p + 'D');
        paths(mat, r, c+1, p + 'R');
    }

}
