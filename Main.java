package org.example;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
       connectUDP(5300);
    }

    private static void connectUDP(int socket) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] receive = new byte[512];

        DatagramPacket dp;
        while (true) {
            dp = new DatagramPacket(receive, receive.length);
            ds.receive(dp);
            String allData = Arrays.toString(dp.getData());
            String isRaceOn = String.valueOf(dp.getData()[0]);
            float test = dp.getData()[1];
            float test1 = dp.getData()[2];
            float test2 = dp.getData()[3];
            float test3 = dp.getData()[4];
            float test4 = dp.getData()[5];
            System.out.println("0:" + test);
            System.out.println("1:" + test1);
            System.out.println("2:" + test2);
            System.out.println("3:" + test3);
            System.out.println("4:" + test4);
            System.out.println("5:" + allData);
            receive = new byte[512];
        }
    }
}
