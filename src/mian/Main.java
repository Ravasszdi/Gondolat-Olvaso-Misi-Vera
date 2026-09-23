package mian;

public class Main {
    static String[] pakli = new String[22];//index 0-21
    static String[] kevert = new String[22];
    
    public static void main(String[] args) {

        kever(oszlop);
    }
    
    private static void kever(int oszlop) {
        String[] regiPak = new String[22];
        for (int i = 1; i <= 21; i++) {
            regiPak[i] = pakli[i];
        }
    
        switch(oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    pakli[i]    = regiPak[20-(i-1)*3];
                    pakli[i+7]  = regiPak[19-(i-1)*3];
                    pakli[i+14] = regiPak[21-(i-1)*3];
                }
                break;
}
