import jdk.nashorn.internal.ir.RuntimeNode.Request;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            toplam += i;
        }
        System.out.println(toplam);
    }
}