public class practica {
    public static void main(String[] args) {

        // System.out.println(num_a_binario(4));
        System.out.println(binario_a_num(0));
    }

    public static int suma_or(int n1,int n2){

        n1 = num_a_binario(n1);
        n2 = num_a_binario(n2);

        String s1 = n1+"";
        String s2 = n2+"";

        if(s1.length()>s2.length()){
            do{


                
            }while();
        }else{

        }

        return num;
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
