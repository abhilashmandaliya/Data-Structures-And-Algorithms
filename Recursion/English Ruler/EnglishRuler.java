import java.io.*;
public class EnglishRuler {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inches, maxTickLen;
        while (true) {
        	/* Press ctrl + c to stop execution */
            System.out.print("Enter Ruler Size (Inches for Ruler) : ");
            inches = Integer.parseInt(br.readLine());
            System.out.print("Enter Max Num of Ticks per Inch : ");
            maxTickLen = Integer.parseInt(br.readLine());
            drawRuler(inches, maxTickLen);
        }
    }
    public static void drawRuler(int inches, int maxTickLen) {
        /* First Line */
        drawTick(maxTickLen, 0);
        for (int i = 0; i < inches; i++) {
            generateInchLine(maxTickLen - 1);
            drawTick(maxTickLen, i + 1);
        }
    }
    public static void generateInchLine(int maxTickLen) {
        /* Recursion */
        if (maxTickLen > 0) {
            generateInchLine(maxTickLen - 1);
            drawTick(maxTickLen);
            generateInchLine(maxTickLen - 1);
        }
    }
    public static void drawTick(int maxTickLen) {
        for (int i = 0; i < maxTickLen; i++)
            System.out.print("-");
        System.out.println();
    }
    public static void drawTick(int maxTickLen, int label) {
        for (int i = 0; i < maxTickLen; i++)
            System.out.print("-");
        System.out.println(" " + label);
    }
}