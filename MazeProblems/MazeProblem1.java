package MazeProblems;

import java.util.ArrayList;

public class MazeProblem1 {
    public static void main(String[] args) {
        System.out.println(mazeOne(3,3));
        mazeOnePattern(3,3,"");
        System.out.println(mazeOnePatternArr(4,4,""));
    }

    private static void mazeOnePattern(int r, int c, String p) {
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r == 1){
            mazeOnePattern(r, c-1, p + 'R');
            return;
        }
        else if (c == 1){
            mazeOnePattern(r-1, c, p + 'D');
            return;
        }

        mazeOnePattern(r-1, c, p + 'D');
        mazeOnePattern(r, c-1, p + 'R');
    }

    private static int mazeOne(int r, int c) {
        if (r == 1 || c == 1){
            return 1;
        }
        return mazeOne(r-1, c) + mazeOne(r, c-1);
    }

    private static ArrayList<String> mazeOnePatternArr(int r, int c, String p) {
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (r == 1){
            ArrayList<String> list = mazeOnePatternArr(r, c-1, p + 'R');
            return list;
        }
        else if (c == 1){
            ArrayList<String> list = mazeOnePatternArr(r-1, c, p + 'D');
            return list;
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(mazeOnePatternArr(r-1, c, p + 'D'));
        arr.addAll(mazeOnePatternArr(r, c-1, p + 'R'));
        return arr;
    }

}
