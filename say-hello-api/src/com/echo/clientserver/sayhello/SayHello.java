/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.echo.clientserver.sayhello;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author FAUZI RAHMAT
 */
public interface SayHello extends Remote {
    String sayHello(String nama) throws RemoteException;
}
