import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 52;
        int b = 10;

        System.out.println("Dijeljenje: " + (double)a/b); // int u double rezultat
        System.out.println("Cjelobrojno dijeljenje: " + a / b); //Cjelobrojno djeljenje -> sa 2 kose linije //
        System.out.println("Dijeljenje s ostatkom :" + a % b); // ako nas zanima ostatak od dijeljenja

        //int broj = 521;
        // 521 : 10 = 52.1  (double)
        // cjelobrojno dijeljenje: 521 / 10 = 52
        // s ostatkom 521 % 10 = 1 --> jer je 52 * 10 = 521 i ostatak je 1


        //Zadatak: Unijeti broj kroz konzolu i računamo sumu znamenki toj broja
        // Koraci:
        //1. tražiti od korisnika da unese broj (Koristimo skener i spremanje broja)
        //2. Kreirati potrebnih pomoćnih varijabli (jedna za sumu znamenki, spremanje privremenog broja..)
        //3. sve to pospremiti unutar while petlje -> prekid izvođenja petlje je kada dobijemo broj 0
        // 4. ispisati broj znamenki



        Scanner sc = new Scanner(System.in);
        int suma = 0; // kutija u koju spremamo rezultat tj. ostatak
        System.out.println("Unesi broj: ");
        int broj = sc.nextInt(); // broj koji ćemo unijeti u konzolu
        int ostatak = 0; // pomoćna varijabla ostatak - privremeni spremnik u koji stavljamo zadnju znamenku prije zbrajanja u sumu
//while (broj > 0) -> radi sve dok u broju ima znamenki, tj. ponavljaj sve dok ne potrošimo (izbrišemo) sve znamenke iz broja
        while ( broj > 0) { //petlja while kroz koju provjeravamo uvjet da je broj koji dijelimo veći od 0
            ostatak = broj % 10; // dijelimo s % da dobijemo ostatak, čupamo zadnju znamenku broja?
            suma += ostatak; // suma = suma + ostatak (dodajemo tu znamnku u ukupnu sumu)
            broj = broj / 10; //brišemo zadnju znamenku broja

        }
        System.out.println("Ispiši broj znamenki: " + suma); //ispis zbroja znamenki iz kutije suma

    }

}