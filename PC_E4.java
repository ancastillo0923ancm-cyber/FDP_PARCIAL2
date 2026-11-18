public class PC_E4 {
    static int contarDigitos(int numero) {
        int cantidadDigitos = 0;
        do {
            cantidadDigitos++;
            numero /= 10;
        } while (numero != 0);
        return cantidadDigitos;
    }
    static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int contador = 0; contador < exponente; contador++) {
            resultado *= base;
        }
        return resultado;
    }
 
    static boolean esArmstrong(int numero) {
        int cantidadDigitos = contarDigitos(numero);
        int numeroRestante = numero;
        int sumaPotencias = 0;
        while (numeroRestante > 0) {
            int cifra = numeroRestante % 10;
            sumaPotencias += potencia(cifra, cantidadDigitos);
            numeroRestante /= 10;
        }
        return sumaPotencias == numero;
    }
 
    public static void main(String[] args) {
        System.out.println("153: " + esArmstrong(153));   
        System.out.println("123: " + esArmstrong(123));   
        System.out.println("9474: " + esArmstrong(9474)); 
    }
}
