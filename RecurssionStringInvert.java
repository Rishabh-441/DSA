public class RecurssionStringInvert {
    public static void main(String[] args) {
        System.out.println(reverse("Helloworld"));
    }
    public static String reverse(String s){
        if (s == null || s.length() == 0) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
