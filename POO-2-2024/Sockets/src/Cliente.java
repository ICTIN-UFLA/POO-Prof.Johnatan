import java.io.*;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        String endereco = "localhost"; // Endereço do servidor
        int porta = 12345;             // Porta do servidor

        try (Socket socket = new Socket(endereco, porta);
             InputStream input = socket.getInputStream();
             OutputStream output = socket.getOutputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input));
             PrintWriter writer = new PrintWriter(output, true);
             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Conectado ao servidor!");

            // Lê a mensagem de boas-vindas do servidor
            System.out.println("Servidor: " + reader.readLine());

            // Envia mensagens ao servidor
            String mensagem;
            while ((mensagem = consoleReader.readLine()) != null) {
                writer.println(mensagem);
                System.out.println("Servidor respondeu: " + reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
