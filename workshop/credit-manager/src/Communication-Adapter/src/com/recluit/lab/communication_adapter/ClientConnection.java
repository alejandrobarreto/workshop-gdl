package com.recluit.lab.communication_adapter;
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

class ClientConnection {
    public void establishConnection()
    {
        try
        {
            Socket s = new Socket("192.168.10.210", 3550);
            
            InputStreamReader stream = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(stream);
            String str = reader.readLine();
            System.out.println(" Text received from client: " + str);
            reader.close();
            
            PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
            writer.println("Mensaje Enviado");
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}*/
/*import java.net.*;
import java.io.*;

public class ClientConnection{
    public static void main(String... salvador) throws IOException {
        final String IP = "192.168.10.210";
        final int PORT = 3550;

        Socket sock = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        DataOutputStream dos = null;
        OutputStream out = null;
        try{
            sock = new Socket(IP,PORT);
            isr =new InputStreamReader(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            br = new BufferedReader(isr);

            out = sock.getOutputStream();
            String line = "Hola\n";
            char[] strArray;
            strArray = line.toCharArray();
            while (true) {
                for( int index = 0; index < strArray.length; index++){
                    out.write(strArray[index]);
                    out.flush();
                }

                //line.getBytes();
                out.flush();
                System.out.println("data sent " );
                System.out.println("Datos Leidos del SERVER: \n"+br.readLine());
                System.out.println("/n");
            }
        }catch (IOException ioe) {
            System.err.println(ioe);
        }finally {
            sock.close();
            br.close();
            isr.close();
        }
    }
}*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class ClientConnection {

    public void establishConnection() {
        try
        {
        Socket socket = new Socket("200.39.233.137", 3555);
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

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
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
