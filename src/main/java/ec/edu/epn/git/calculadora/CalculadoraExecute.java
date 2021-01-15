package ec.edu.epn.git.calculadora;

public class CalculadoraExecute {
    public static void main(String[] args){
        System.out.println("---- Ejecución Calculadora ----");
        Calculadora cal = new Calculadora();
        int a = 6;
        int b = 3;
        System.out.println("Los números son: " + a +" y "+ b);
        int suma = cal.addition(a,b);
        System.out.println("Suma: " + suma);
        int resta = cal.subtraction(a,b);
        System.out.println("Resta: " + resta);
        int multiplicacion = cal.multiplication(a,b);
        System.out.println("Multiplicación: " + multiplicacion);
    }
}
