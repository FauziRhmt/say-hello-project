/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.echo.clientserver.sayhello.client;

import javax.swing.SwingUtilities;

/**
 *
 * @author FAUZI RAHMAT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FormClient client = new FormClient();
                client.setVisible(true);
            }
        });
    }

}