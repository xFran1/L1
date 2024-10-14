import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (Integer num : nums) {
            boolean introducir = false;
            for (int i = 0; i < num; i++) {

            }
            if (introducir) {
                ans.add();
            }

        }

    }

    public static int binario_a_num(int n) {

        int num = 0;
        String s = n + "";
        for (int i = 0; i < s.length(); i++) {
            String str_num1 = s.charAt(s.length() - 1 - i) + "";
            if (str_num1.equals("1")) {
                num += Math.pow(2, i);
            }
        }

        return num;
    }

    public static int num_a_binario(int n) {
        String s = "";
        while (n != 1 && n != 0) {
            s = (n % 2) + "" + s;
            n = n / 2;

        }

        s = n + "" + s;
        int num = Integer.parseInt(s);
        return num;
    }
}
