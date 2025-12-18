/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.echo.clientserver.sayhello.server;

import com.echo.clientserver.sayhello.SayHello;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 

/**
 *
 * @author FAUZI RAHMAT
 */
public class SayHelloServer extends UnicastRemoteObject implements SayHello {
   
    public SayHelloServer() throws RemoteException {}

    @Override
    public String sayHello(String nama) throws RemoteException{
        System.out.println("Client memanggil sayHello dengan nama: " + nama);
        return "Halo " + nama + ", selamat datang di Server!";
    }
}
