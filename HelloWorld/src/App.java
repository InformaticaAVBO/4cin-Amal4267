import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
   
    public void copiaFile(String nomeInput,String nomeOutput) throws Exception {
    File fileInput = new File(nomeInput);
    Scanner leggi = new Scanner(fileInput);
    FileWriter m = new FileWriter(nomeOutput);


    while (leggi.hasNextLine()) {
    String riga = leggi.nextLine();
    m.write(riga + "\n");
    leggi.close();
    m.close();
}
}
public static void main (String[] args) throws Exception {
Scanner input = new Scanner(System.in);


System.out.println("Inserisci il nome del file di input");
String nomeInput = input.nextLine();

System.out.println("Inserisci il nome del file di output ");
String nomeOutput = input.nextLine();
App app = new App();
app.copiaFile(nomeInput, nomeOutput);
System.out.println("Copia completata! Il contenuto è stato scritto in " + nomeOutput);
input.close();
}
}


