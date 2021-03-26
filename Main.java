import java.io.*;

class Main{

    public static void main(String[] args) {
        
        InputStream in = System.in;

        PrintStream out = System.out;

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

        try{

            writer.write("Inserisci tutti i lati della figura, separati da una virgola: ");

            writer.newLine();

            writer.flush();

            String input = reader.readLine();

            String[] numeri = input.split(",");

            int[] interi = new int[numeri.length];

            int min = Integer.MAX_VALUE;

            int max = Integer.MIN_VALUE;

            int conteggio = numeri.length;


            for (int i=0, j=0; i<numeri.length; i++) {

                try{

                    interi[j] = Integer.parseInt(numeri[i]);

                    j++;
                    
                } catch (NumberFormatException E){

                    try{

                        Double temp; 

                        temp = Double.parseDouble(numeri[i]);

                        interi[j] = temp.intValue();
                        
                        j++;
                         
                    } catch (NumberFormatException F){

                        writer.write("Hai inserito un valore non valido: " + numeri[i]);

                        writer.newLine();

                        writer.flush();

                        conteggio--;

                    }

                }

            }
            int somma = 0;
        
            for(int j = 0 ; j<conteggio; j++){

                if(interi[j]<min){

                    min = interi[j];

                }

                if(interi[j]>max){

                    max = interi[j];
                    
                }

                somma += interi[j];

            }

            /*

                Inserisci tutti i lati della figura, separati da una virgola
                1,f,6,1,45
                Hai inserito un valore non valido: f
                conteggio:4
                Il valore minore inserito è:0
                Il valore maggiore inserito è:6
                Il valore medio inserito è:2

                // Quando trovo un valore non intero viene assegnato il valore di default

            */
    
            try{

                writer.write("Il valore medio inserito è: "+ somma/conteggio);

                writer.newLine();

                writer.write("Il valore minore inserito è: " + min);

                writer.newLine();

                writer.write("Il valore maggiore inserito è: "+ max);


            } catch (ArithmeticException G){

                writer.write("Non sono stati inseriti valori.");

            } finally{
               
                writer.newLine();

                writer.flush();

            }
            
            
        } catch (IOException e) {

            e.printStackTrace();

        }  

    }

}