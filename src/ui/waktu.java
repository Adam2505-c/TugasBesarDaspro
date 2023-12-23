package ui;

public class waktu {
    public static void main(String[] args) {
        int a = Jam(0);
        int b = Menit(0);
        System.out.println(a + ":" + b);
    }

    public static int Hari(int a) {
        
        for(int b = 0 ; b <= 24 ; b++) {
            a++;
        }
        return a;
    }

    public static int Jam(int a) {
        
        for(int b = 0 ; b <= 24 ; b++) {
            a++;
        }
        return a;
    }

    public static int Menit(int a) {
        
        for(int b = 0 ; b <= 60 ; b++) {
            a+=10;
        }
        return a;
    }
}
