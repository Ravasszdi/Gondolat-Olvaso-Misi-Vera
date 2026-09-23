package mian;

public class Main {

    static String[] kartyak = kartyakMaker();
    static int[] pakli = pakliMaker();
    
    public static void main(String[] args) {
        
    }
    
    private static void kever(int oszlop) {
        int[] regiPak = new int[21];
            regiPak = pakli;
    
        switch(oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    pakli[i]    = regiPak[20-(i-1)*3];
                    pakli[i+7]  = regiPak[19-(i-1)*3];
                    pakli[i+14] = regiPak[21-(i-1)*3];
                }
                break;
        }
    }
    
    static String[] kartyakMaker(){
        String[] szinek = {"P","Z","T","M"};
        String[] szamok = {"asz","kir","fel","8","9","10"};
        String[] kartya_pakli = new String[21];
        int ikartyak = 0;
        for(int iszin = 0; iszin<szinek.length; iszin++){
            for(int iszam = 0; iszam<("M".equals(szinek[iszin])? 3 :szamok.length); iszam++){
                kartya_pakli[ikartyak++] = szinek[iszin] + "_" + szamok[iszam];
            }
        }
        return kartya_pakli;
    }
    
    static int[] pakliMaker(){
        int[] pakli = new int[21];
        for (int i = 0; i < pakli.length; i++) pakli[i]=i;
        return pakli;
    }
    
    static int[] kever(int[] pakli, int valasztott oszlop){
        
    }
}
