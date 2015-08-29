/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Кирилл
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Settings settings = Settings.getInstance();

        ServerSocket socket = new ServerSocket(settings.getPort());
        Socket client = socket.accept();
        processClient(client);
        
        
        System.out.println("Project going down");
    }
    
    private static void processClient(Socket socket){
    }
    
}
