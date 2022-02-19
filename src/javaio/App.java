import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {
        try {
            /*
            InputStream is = new FileInputStream("teste.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();

            while(s != null) {
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            */
            
            //testaTeclado();
            //escreveEmArquivo();
            escreveEmArquivoAPartirDoTeclado();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testaTeclado() throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        OutputStream os = new FileOutputStream("arquivo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        int i = 0;
        while(i < 2) {
            System.out.println(s);
            bw.newLine();
            bw.write(s);
            s = br.readLine();
            i++;
        }
        br.close();
        bw.close();
    }

    public static void escreveEmArquivo () throws FileNotFoundException {
        PrintStream ps = new PrintStream("arquivo2.txt");
        Scanner s = new Scanner(System.in);
        
        while(s.hasNextLine()){
            ps.println(s.nextLine());
        }

        ps.close();
    }

    public static void escreveEmArquivoAPartirDoTeclado() throws IOException {
        PrintStream ps = new PrintStream("arquivo3.txt");
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        String texto=br.readLine();
        
        while(texto!=null) {
            ps.println(texto);
            texto=br.readLine();
        }
        ps.close();
    }
}
