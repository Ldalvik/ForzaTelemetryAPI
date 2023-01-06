package root.forza.telemetry;

import java.net.DatagramPacket;
import java.net.UnknownHostException;

public class Main implements ForzaInterface {
    public static void main(String[] args) throws UnknownHostException {
        new ForzaTelemetryBuilder(/*Optional, default 5300*/)
                .addListener(new Main()) //Add listener, aka this main class
                .getThread() //Get created thread, will need to be set in your class if interrupts are needed
                .start(); //Start thread (this is being called on a Thread)

         /*Bringing the data stream thread into your scope for accessing.

          ForzaTelemetryBuilder builder = new ForzaTelemetryBuilder()
                  .addListener(new Main());
          Thread dataStreamThread = builder.getThread();
          dataStreamThread.start();
         */

        System.out.println("You will be connecting to: " + ForzaInterface.getDeviceIp());
    }

    @Override
    public void onDataReceived(ForzaTelemetryApi api) {
        //Data will be received here at 30 fps. Your main updating loop will be here.
        System.out.println("X Position: " + api.getPositionX());
    }

    @Override
    public void onConnected(ForzaTelemetryApi api, DatagramPacket packet) {
        //Called once on first connection, first frame of data is accessible as well as the datagrampacket
        System.out.println("Connected to: " + packet.getSocketAddress());
        System.out.println("Car Ordinal: " + api.getOrdinal());
    }

    @Override
    public void onGamePaused() {
        //Called once when the game is paused. Data will not be received in onDataReceived
        System.out.println("Game paused.");
    }

    @Override
    public void onGameUnpaused() {
        //Called once when the game is unpaused. Data will begin to be received in onDataReceived
        System.out.println("Game unpaused.");
    }

    @Override
    public void onCarChanged(ForzaTelemetryApi api, VehicleData data) {
        //Called once when car is changed in game. Static vehicle data can be accessed with VehicleData here.
        System.out.println("Vehicle changed.");
        System.out.println("Car Name: " + data.getCarName());
        System.out.println("Car Class: " + data.getCarClass());
        System.out.println("Performance Index (PI): " + data.getPerformanceIndex());
        System.out.println("Drivetrain: " + data.getDrivetrain());
        System.out.println("Number of Cylinders: " + data.getNumOfCylinders());
        System.out.println("Car Type: " + data.getCarType());
        System.out.println("Ordinal: " + data.getOrdinal());
    }
}
