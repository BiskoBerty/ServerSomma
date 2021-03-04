/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pogliani.mattia
 */
public class ServerMultiThread {

    /**
     * @param args the command line arguments
     */
    
    // sviluppare un applicativo client server che generi tanti thread quanti dichiarati dall'utente attraverso un thread a lui dedicato, ogni thread
    // sommerà a una varibile globale contenuta nel server il proprio valore incrementale assegnatogli dal server da 1 a n dove n è il numero dei thread,
    // il server killerà ogni processo dopo che avrà svolto l'operazione, quando tutti i processi saranno killati il server stameprà a console il risultato 
    
    public static void main(String[] args) {
        
        int risultato;
        
        try {
            ServerSocket server = new ServerSocket(5500);
            System.out.println("Server è attivo e in ascolto");

            while (true) {
                try {
                   Socket client = server.accept();
                    PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    
                    System.out.println("numero inserito dal client: " + in.readLine());
                    int numero = Integer.parseInt(in.readLine());
                    
                    for (int i = 0; i < numero; i++) {
                        
                    }

            out.close();
            client.close();

            System.out.println("chiusura connessione effettuata");

        } catch (IOException ex) {
            Logger.getLogger(ServerMultiThread.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerMultiThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}