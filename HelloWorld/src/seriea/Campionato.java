package seriea;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Campionato {

    int DIM = 20;
    Squadra[] classifica;

    public Campionato() throws FileNotFoundException {
        classifica = new Squadra[DIM];
        this.classifica = classifica;
        File f = new File("data/Classifica.csv");
        Scanner leggi = new Scanner(f);

        for (int i = 0; leggi.hasNextLine(); i++) {
            String s = leggi.nextLine();
            String[] ss = s.split(",");
            classifica[i] = new Squadra(ss[0], ss[1], ss[2], ss[3], ss[4], ss[5], ss[6], ss[7], ss[8], ss[9]);
        }

        leggi.close();
    }


    public void stampaCampionato() {
        for (int i = 0; i < 20; i++) {
            System.out.println(classifica[i].getPosizione() + " " + classifica[i].getNome());
        }
    }

public void cercaSquadra() {
    Scanner input = new Scanner(System.in);
    boolean continua = true;

    while (continua) {
        System.out.println("\nElenco delle squadre in Serie A:");
        for (int i = 0; i < DIM; i++) {
            System.out.println((i + 1) + " - " + classifica[i].getNome());
        }

        System.out.println("\nDi che squadra vuoi sapere le informazioni?");
        System.out.println("(Inserisci un numero da 1 a " + DIM + " oppure 0 per uscire)");

        int nSquadra = input.nextInt();

        if (nSquadra == 0) {
            System.out.println("Uscita dal programma...");
            continua = false;
        } else if (nSquadra >= 1 && nSquadra <= DIM) {
            Squadra s = classifica[nSquadra - 1];

            System.out.println("\nInformazioni sulla squadra:");
            System.out.println("Posizione | Nome | Punti | Partite | Vinte | Pareggiate | Perse | Fatti | Subiti | Differenza");
            System.out.println(s);

            
            int vinte = Integer.parseInt(s.getVinte());
            int pareggiate = Integer.parseInt(s.getPareggiate());
            int puntiCalcolati = vinte * 3 + pareggiate;

             System.out.println("\nPunteggio calcolato: " + puntiCalcolati + " punti");

        } else {
            System.out.println("Numero non valido. Riprova.");
        }
    }
}



    }

   


