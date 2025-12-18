/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.echo.clientserver.sayhello.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author FAUZI RAHMAT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        Registry registry = LocateRegistry.createRegistry(1099);
        SayHelloServer sayHello = new SayHelloServer();
        registry.rebind("sayHello", sayHello);
        System.out.println("Server Telah Berjalan...");
    }
    
}
