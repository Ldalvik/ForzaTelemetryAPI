package org.example;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class ExampleFile {
    public static void main(String[] args) {
            ForzaApi api;  //ForzaApi class, UDP data is streamed and parsed here eventually

            int UDP_PORT = 5300;  //This can be any port you want, just be sure to set it in your game settings

            DatagramSocket ds = null;  //Initialize UDP stream socket
            try {
                ds = new DatagramSocket(UDP_PORT);
            } catch (SocketException e) {
                e.printStackTrace();
            }

            byte[] receive = new byte[323];  //Create packet buffer size, which in this case is 312

            DatagramPacket dp;

            while (true) {  //This will loop and receive data realtime

                dp = new DatagramPacket(receive, receive.length); //Pass bytes and packet size

                try {
                    ds.receive(dp); //receive UDP data stream and pass it to DatagramPacket
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String ALL_DATA = Arrays.toString(dp.getData()); //Full byte string parsed into a string array, good for debugging

                api = new ForzaApi(dp.getData()); //Initialize ForzaApi and pass stream data to be parsed


            /*
            These are all the available telemetry data functions
            and what type they return.
            I'm not sure about the telemetry data structures for any other
            games besides FORZA HORIZON 4 and FORZA HORIZON 5. Maybe I'll make one
            some day, but it's kinda irrelevant at this point.
            */


                boolean isRaceOn = api.getIsRaceOn();
                float timestamp = api.getTimeStampMS();

                float engineMaxRPM = api.getEngineMaxRpm();
                float engineIdleRPM = api.getEngineIdleRpm();
                float engineCurrentRPM = api.getCurrentEngineRpm();

                float accelerationX = api.getAccelerationX();
                float accelerationY = api.getAccelerationY();
                float accelerationZ = api.getAccelerationZ();

                float velocityX = api.getVelocityX();
                float velocityY = api.getVelocityY();
                float velocityZ = api.getVelocityZ();
                float averageVelocity = api.getAverageVelocity();

                float angularVelocityX = api.getAngularVelocityX();
                float angularVelocityY = api.getAngularVelocityY();
                float angularVelocityZ = api.getAngularVelocityZ();

                float yaw = api.getYaw();
                float pitch = api.getPitch();
                float roll = api.getRoll();

                float normalizedSuspensionTravelFrontLeft = api.getNormalizedSuspensionTravelFrontLeft();
                float normalizedSuspensionTravelFrontRight = api.getNormalizedSuspensionTravelFrontRight();
                float normalizedSuspensionTravelRearLeft = api.getNormalizedSuspensionTravelRearLeft();
                float normalizedSuspensionTravelRearRight = api.getNormalizedSuspensionTravelRearRight();

                float tireSlipRatioFrontLeft = api.getTireSlipRatioFrontLeft();
                float tireSlipRatioFrontRight = api.getTireSlipRatioFrontRight();
                float tireSlipRatioRearLeft = api.getTireSlipRatioRearLeft();
                float tireSlipRatioRearRight = api.getTireSlipRatioRearRight();

                float wheelRotationSpeedFrontLeft = api.getWheelRotationSpeedFrontLeft();
                float wheelRotationSpeedFrontRight = api.getWheelRotationSpeedFrontRight();
                float wheelRotationSpeedRearLeft = api.getWheelRotationSpeedRearLeft();
                float wheelRotationSpeedRearRight = api.getWheelRotationSpeedRearRight();

                float wheelOnRumbleStripFrontLeft = api.getWheelOnRumbleStripFrontLeft();
                float wheelOnRumbleStripFrontRight = api.getWheelOnRumbleStripFrontRight();
                float wheelOnRumbleStripRearLeft = api.getWheelOnRumbleStripRearLeft();
                float wheelOnRumbleStripRearRight = api.getWheelOnRumbleStripRearRight();

                float wheelInPuddleDepthFrontLeft = api.getWheelInPuddleDepthFrontLeft();
                float wheelInPuddleDepthFrontRight = api.getWheelInPuddleDepthFrontRight();
                float wheelInPuddleDepthRearLeft = api.getWheelInPuddleDepthRearLeft();
                float wheelInPuddleDepthRearRight = api.getWheelInPuddleDepthRearRight();

                float surfaceRumbleFrontLeft = api.getSurfaceRumbleFrontLeft();
                float surfaceRumbleFrontRight = api.getSurfaceRumbleFrontRight();
                float surfaceRumbleRearLeft = api.getSurfaceRumbleRearLeft();
                float surfaceRumbleRearRight = api.getSurfaceRumbleRearRight();

                float tireSlipAngleFrontLeft = api.getTireSlipAngleFrontLeft();
                float tireSlipAngleFrontRight = api.getTireSlipAngleFrontRight();
                float tireSlipAngleRearLeft = api.getTireSlipAngleRearLeft();
                float tireSlipAngleRearRight = api.getTireSlipAngleRearRight();

                float tireCombinedSlipFrontLeft = api.getTireCombinedSlipFrontLeft();
                float tireCombinedSlipFrontRight = api.getTireCombinedSlipFrontRight();
                float tireCombinedSlipRearLeft = api.getTireCombinedSlipRearLeft();
                float tireCombinedSlipRearRight = api.getTireCombinedSlipRearRight();

                float suspensionTravelMetersFrontLeft = api.getSuspensionTravelMetersFrontLeft();
                float suspensionTravelMetersFrontRight = api.getSuspensionTravelMetersFrontRight();
                float suspensionTravelMetersRearLeft = api.getSuspensionTravelMetersRearLeft();
                float suspensionTravelMetersRearRight = api.getSuspensionTravelMetersRearRight();

                int carOrdinal = api.getCarOrdinal();
                String carClass = api.getCarClass();
                int carPerformanceIndex = api.getCarPerformanceIndex();
                String driveTrain = api.getDrivetrain();
                int numberOfCylinders = api.getNumCylinders();

                float positionX = api.getPositionX();
                float positionY = api.getPositionY();
                float positionZ = api.getPositionZ();

                float speedMps = api.getSpeedMPS();
                float speedMph = api.getSpeedMPH();
                float speedKph = api.getSpeedKPH();
                float power = api.getPower();
                float horsepower = api.getHorsePower();
                float torque = api.getTorque();

                float tireTempFrontLeft = api.getTireTempFrontLeft();
                float tireTempFrontRight = api.getTireTempFrontRight();
                float tireTempRearLeft = api.getTireTempRearLeft();
                float tireTempRearRight = api.getTireTempRearRight();
                float tireTempAverageFront = api.getTireTempAverageFront();
                float tireTempAverageRear = api.getTireTempAverageRear();

                float boost = api.getBoost();
                float fuel = api.getFuel();
                float distanceTraveled = api.getDistanceTraveled();
                float bestLap = api.getBestLap();
                float lastLap = api.getLastLap();
                float currentLap = api.getCurrentLap();
                int lapNumber = api.getLapNumber();
                byte racePosition = api.getRacePosition();

                byte accel = api.getAccel();
                byte brake = api.getBrake();
                byte clutch = api.getClutch();
                byte handbrake = api.getHandbrake();
                byte gear = api.getGear();
                byte steer = api.getSteer();
                byte normalizedDrivingLine = api.getNormalizedDrivingLine();
                byte normalizedAIBrakeDifference = api.getNormalizedAIBrakeDifference();

                receive = new byte[323]; //Clear byte buffer
            }

    }
}
