package org.example;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {

        ForzaApi api = null;
        DatagramSocket ds = new DatagramSocket(5300);
        byte[] receive = new byte[512];

        DatagramPacket dp;
        while (true) {
            dp = new DatagramPacket(receive, receive.length);
            ds.receive(dp);
            String allData = Arrays.toString(dp.getData());


            api = new ForzaApi(dp.getData());
            System.out.print("Engine max RPM: " + api.getEngineMaxRPM()+",");
            System.out.print("Engine idle RPM: " + api.getEngineIdleRPM()+",");
            System.out.print("Engine current RPM: " + api.getEngineCurrentRPM()+",");

            System.out.print("Accel X: " + api.getAccelerationX()+",");
            System.out.print("Accel Y: " + api.getAccelerationY()+",");
            System.out.print("Accel Z: " + api.getAccelerationZ()+",");

            System.out.print("Velocity X: " + api.getVelocityX()+",");
            System.out.print("Velocity Y: " + api.getVelocityY()+",");
            System.out.print("Velocity Z: " + api.getVelocityZ()+",");

            System.out.print("Angular velocity X: " + api.getAngularVelocityX()+",");
            System.out.print("Angular velocity Y: " + api.getAngularVelocityY()+",");
            System.out.println("Angular velocity Z: " + api.getAngularVelocityZ()+",");

            receive = new byte[512];
        }
    }



}
