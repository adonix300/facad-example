package org.example;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int result = arg1 + arg2;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int result = arg1 * arg2;
        return Integer.toBinaryString(result);
    }
}
