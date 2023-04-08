package day_1_pp;

public class PP1Q1_6 {
    static int x = 10;
    static int y;
    static void func() {
        System.out.println("Static Method");
    }
    static {
        System.out.println("Static Block");
        y = x + 5;
    }
    public static void main(String[] args) {
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                func();
            }
        }
