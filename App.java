import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
public static void main(String[] args) throws IOException {
Scanner input = new Scanner(System.in);


System.out.println("Inserisci il nome del file di input");
String nomeInput = input.nextLine();

System.out.println("Inserisci il nome del file di output ");
String nomeOutput = input.nextLine();
File fileInput = new File(nomeInput);


Scanner leggi = new Scanner(fileInput);

FileWriter m = new FileWriter(nomeOutput);


while (leggi.hasNextLine()) {
String riga = leggi.nextLine();
m.write(riga + "\n");
}

leggi.close();
m.close();
input.close();

System.out.println("Copia completata! Il contenuto è stato scritto in " + nomeOutput);
}
}

