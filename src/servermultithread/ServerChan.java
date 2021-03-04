/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

/**
 *
 * @author pogliani.mattia
 */
public class ServerChan implements Runnable {

    int numero;
    
    public ServerChan(int numero) {
        this.numero = numero;
    }
    
    @Override
    public void run() {
        numero = numero*2;
        
    }
    
    
}