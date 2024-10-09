public class ContadorVariado {
    public static void main(String[] args) {
        double numeroInicial = 0.15;
        for(double numero = 0.15; numero<5; numero+=0.15) {
            System.out.println("%.2f".formatted(numero));
        }
    }
}
