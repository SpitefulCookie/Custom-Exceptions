import java.io.*;

class Main{

    public static void main(String[] args) {
        
        final String LOCALE = "it-IT";

        InputStream in = System.in;

        PrintStream out = System.out;

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

        if(LOCALE.equals("it-IT")){

            try{

                writer.write("Inserisci tutti i lati della figura, separati da una virgola");

                writer.newLine();

                writer.flush();

                String input = reader.readLine();
 
                String[] lati = input.split(",");
            
                for (int i=0; i<lati.length; i++) {

                    writer.write("Lato " + (i+1) + ": " + lati[i]);

                    writer.newLine(); writer.flush();

                }    
                
            } catch (IOException e) {

                e.printStackTrace();

            } 

        }

    }

}
