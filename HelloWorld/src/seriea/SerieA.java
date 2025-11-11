package seriea;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SerieA {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Campionato seriea= new Campionato();
        Scanner input=new Scanner(System.in);
        seriea.stampaCampionato();
        
        String[] elenco= {"Atalanta","Bologna","Cagliari","Como","Cremonese","Fiorentina","Genoa","Inter","Juventus","Lazio","Lecce","Milan","Parma","Pisa","Roma","Sassuolo","Torino","Udinese","Verona"};
        seriea.cercaSquadra();
        
    }
    
}
