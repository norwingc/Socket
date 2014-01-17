package cliente;

/**
 *
 * @author Norwin Guerrero
 */
import java.net.*;
import java.io.*;

public class cliente {

    private Socket socket;
    private ObjectInputStream in;

    public cliente() {
        try {
            socket = new Socket("LocalHost", 6666);
            in = new ObjectInputStream(socket.getInputStream());
            System.out.println((String) in.readObject());

            in.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
