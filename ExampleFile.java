import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class ExampleFile {
    public static void main(String[] args) {
        int UDP_PORT = 5300;
        ForzaApi;
        
        //Start socket on given port
        DatagramSocket = null;
            try {
                datagramSocket = new DatagramSocket(UDP_PORT);
            } catch (Exception e) {
               e.printStackTrace();
            }

            //Only 323 bytes are received from the Forza UDP stream
            byte[] receive = new byte[323];
            boolean isConnected = false;
        
        //Begin data loop
            while (true) {
                datagramPacket = new DatagramPacket(receive, receive.length);
                try {
                    assert datagramSocket != null;
                    datagramSocket.receive(datagramPacket);

                    //Check if data has been recieved by checking timestamp
                    if (!isConnected) {
                        ForzaApi tempApi = new ForzaApi(datagramPacket.getData());
                        if (tempApi.getTimeStampMS() != 0) {
                            
                            //Put logic for when data is is first received
                            
                            isConnected = true;
                        }
                    }
                } catch (Exception e) {
                   e.printStackStrace();
                }

                //Send data to the ForzaApi parsing class
                try {
                    forzaApi = new ForzaApi(datagramPacket.getData());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            /*
            * These are all the available telemetry data methods and what they return 
            * Not all methods are listed, be sure to check ForzaApi.java to see what is available.
            * Calculated methods do not change performance, data is received at 30FPS by default.
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

                Long objectHit = api.getObjectHit();
                
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
