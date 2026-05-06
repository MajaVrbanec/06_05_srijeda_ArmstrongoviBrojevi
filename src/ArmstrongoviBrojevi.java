public class ArmstrongoviBrojevi {
    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++) {
            int privremeniBroj = i;
            int suma = 0;
            int ostatak = 0;

            while (privremeniBroj > 0) {
                ostatak = privremeniBroj % 10;
                suma = suma + (ostatak * ostatak * ostatak);
                privremeniBroj = privremeniBroj / 10;

            }
            if (suma == i) {
                System.out.println("Ispiši Armstrongove brojeve manje od 10000: " + suma);
            }

        }

    }

}

