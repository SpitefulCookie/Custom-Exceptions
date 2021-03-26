```

    Basandosi sul codice fornito come esempio,
    creare un programma che - leggendo in unica soluzione una lista di numeri da input utente - stampi a schermo

    a) valore minimo
    b) valore medio
    c) valore massimo


```

```Java

    import java.io.*;
    
    class Main {
    
        static String LANG = "IT";
        
        public static void main(String[] args) {
        
        PrintStream out = System.out;

        InputStream in = System.in;

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        
            try {
            
                writer.write("Inserisci tutti i lati della figura, separati da una virgola");

                writer.newLine(); writer.flush();

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

```