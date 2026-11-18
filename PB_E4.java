public class PB_E4 {
    static int total = 0;
    static void sumar(int x) {
        int parcial = x * 2;
        total += parcial;
        System.out.println("parcial = " + parcial);   
    }
    public static void main(String[] args) {
        int ultimoValorDeI = 0;                       
        for (int i = 1; i <= 3; i++) {
            sumar(i);
            ultimoValorDeI = i;
        }
        System.out.println(ultimoValorDeI);            
        System.out.println(total);                     
        int total = 5;                                 
        System.out.println(total);                     
    }
}