/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creditBureau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author alejandro
 */
public class ClientConnection {
    
    public void establishConnection(){
        try{
            Socket socket = new Socket("localhost", 3555);
            
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
           /* PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Conexion Realizada");
            writer.close();*/
            
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            
            String userInput;
            
            while((userInput = stdIn.readLine()) != null){
                output.println(userInput);
                System.out.println("echo: " + input.readLine());
            }
            
            output.close();
            input.close();
            stdIn.close();
            socket.close();
        }   
    catch (IOException e){
            
            e.printStackTrace();
        }
    }
    
}
