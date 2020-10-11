public class GeneradorPotencias extends Thread {

    private final long numeroInicial;

    public GeneradorPotencias(long numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    @Override
    public void run() {
        for (long i = 1; i <= 10; i++) {
            System.out.printf("Potencia de %d ^ %d: %.0f\n", numeroInicial, i, Math.pow(numeroInicial, i));
        }
    }
}
