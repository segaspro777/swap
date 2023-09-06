
public class Main {
    public static void main(String args[]) {
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        System.out.println(int1);
        System.out.println(int2);
        int1 = Integer.parseInt(String.valueOf(int1) + String.valueOf(int2));
        int2 = Integer.parseInt(
                String.valueOf(int1).substring(0, String.valueOf(int1).length() - String.valueOf(int2).length()));
        int1 = Integer.parseInt(String
                .valueOf(String.valueOf(int1).substring(String.valueOf(int2).length(), String.valueOf(int1).length())));
        System.out.println(int1);
        System.out.println(int2);
    }
}