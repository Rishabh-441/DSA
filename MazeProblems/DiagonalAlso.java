package MazeProblems;

import java.util.ArrayList;

public class DiagonalAlso {
    public static void main(String[] args) {
        System.out.println(mazeTwo(3,3));
        mazeTwoPattern(3,3,"");
        System.out.println(mazeTwoPatternArr(3,3,""));
    }

    private static void mazeTwoPattern(int r, int c, String p) {
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r == 1){
            mazeTwoPattern(r, c-1, p + 'R');
            return;
        }
        else if (c == 1){
            mazeTwoPattern(r-1, c, p + 'D');
            return;
        }

        mazeTwoPattern(r-1, c, p + 'D');
        mazeTwoPattern(r, c-1, p + 'R');
        mazeTwoPattern(r-1, c-1, p + "_DIG_");
    }

    private static int mazeTwo(int r, int c) {
        if (r == 1 || c == 1){
            return 1;
        }
        return mazeTwo(r-1, c) + mazeTwo(r, c-1) + mazeTwo(r-1, c-1);
    }

    private static ArrayList<String> mazeTwoPatternArr(int r, int c, String p) {
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (r == 1){
            ArrayList<String> list = mazeTwoPatternArr(r, c-1, p + 'R');
            return list;
        }
        else if (c == 1){
            ArrayList<String> list = mazeTwoPatternArr(r-1, c, p + 'D');
            return list;
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(mazeTwoPatternArr(r-1, c, p + 'D'));
        arr.addAll(mazeTwoPatternArr(r, c-1, p + 'R'));
        arr.addAll(mazeTwoPatternArr(r-1, c-1, p + "_DIG_"));
        return arr;
    }
}
