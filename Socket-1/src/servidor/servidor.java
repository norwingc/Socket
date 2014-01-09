package servidor;

/**
 *
 * @author Norwin Guerrero
 */
import java.net.*;
import java.io.*;

public class servidor {

    private ServerSocket server;
    private Socket socket;
    private ObjectOutputStream out;

    public static void main(String[]args){
        

        
    }
    
    public servidor() {

        try {
            server = new ServerSocket(6666);
            socket = server.accept();
            out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject("hola");

            out.close();
            socket.close();
            server.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
