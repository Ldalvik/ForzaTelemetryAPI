package org.example;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ForzaApi {
    public static final int PACKET_SIZE = 323;
    private boolean readOK = false;

    private boolean isRaceOn;
    private Long timeStampMS;
    private Float engineMaxRpm;
    private Float engineIdleRpm;
    private Float currentEngineRpm;
    private Float accelerationX;
    private Float accelerationY;
    private Float accelerationZ;
    private Float velocityX;
    private Float velocityY;
    private Float velocityZ;
    private Float angularVelocityX;
    private Float angularVelocityY;
    private Float angularVelocityZ;
    private Float yaw;
    private Float pitch;
    private Float roll;
    private Float normalizedSuspensionTravelFrontLeft;
    private Float normalizedSuspensionTravelFrontRight;
    private Float normalizedSuspensionTravelRearLeft;
    private Float normalizedSuspensionTravelRearRight;
    private Float tireSlipRatioFrontLeft;
    private Float tireSlipRatioFrontRight;
    private Float tireSlipRatioRearLeft;
    private Float tireSlipRatioRearRight;
    private Float wheelRotationSpeedFrontLeft;
    private Float wheelRotationSpeedFrontRight;
    private Float wheelRotationSpeedRearLeft;
    private Float wheelRotationSpeedRearRight;
    private Integer wheelOnRumbleStripFrontLeft;
    private Integer wheelOnRumbleStripFrontRight;
    private Integer wheelOnRumbleStripRearLeft;
    private Integer wheelOnRumbleStripRearRight;
    private Float wheelInPuddleDepthFrontLeft;
    private Float wheelInPuddleDepthFrontRight;
    private Float wheelInPuddleDepthRearLeft;
    private Float wheelInPuddleDepthRearRight;
    private Float surfaceRumbleFrontLeft;
    private Float surfaceRumbleFrontRight;
    private Float surfaceRumbleRearLeft;
    private Float surfaceRumbleRearRight;
    private Float tireSlipAngleFrontLeft;
    private Float tireSlipAngleFrontRight;
    private Float tireSlipAngleRearLeft;
    private Float tireSlipAngleRearRight;
    private Float tireCombinedSlipFrontLeft;
    private Float tireCombinedSlipFrontRight;
    private Float tireCombinedSlipRearLeft;
    private Float tireCombinedSlipRearRight;
    private Float suspensionTravelMetersFrontLeft;
    private Float suspensionTravelMetersFrontRight;
    private Float suspensionTravelMetersRearLeft;
    private Float suspensionTravelMetersRearRight;
    private Integer carClass;
    private Integer carPerformanceIndex;
    private Integer drivetrainType;
    private Integer numCylinders;
    private Integer carType;
    private Byte unknown1;
    private Byte unknown2;
    private Byte unknown3;
    private Byte unknown4;
    private Byte unknown5;
    private Byte unknown6;
    private Byte unknown7;
    private Byte unknown8;
    private Integer carOrdinal;
    private Float positionX;
    private Float positionY;
    private Float positionZ;
    private Float speed;
    private Float power;
    private Float torque;
    private Float tireTempFrontLeft;
    private Float tireTempFrontRight;
    private Float tireTempRearLeft;
    private Float tireTempRearRight;
    private Float boost;
    private Float fuel;
    private Float distanceTraveled;
    private Float bestLap;
    private Float lastLap;
    private Float currentLap;
    private Float currentRaceTime;
    private Short lapNumber;
    private Byte racePosition;
    private Byte accel;
    private Byte brake;
    private Byte clutch;
    private Byte handbrake;
    private Byte gear;
    private Byte steer;
    private Byte normalizedDrivingLine;
    private Byte normalizedAIBrakeDifference;

    public ForzaApi(byte[] bytes) {
        readOK = false;

        if (bytes.length < PACKET_SIZE) {
            try {
                throw new Exception("Invalid len");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        ByteBuffer bb = ByteBuffer.wrap(bytes);
        bb.order(ByteOrder.LITTLE_ENDIAN);

        try {
            isRaceOn = getFromBuffer(bb, int.class) == 1 ? true : false;
            timeStampMS = getFromBuffer(bb, long.class);
            engineMaxRpm = getFromBuffer(bb, float.class);
            engineIdleRpm = getFromBuffer(bb, float.class);
            currentEngineRpm = getFromBuffer(bb, float.class);
            accelerationX = getFromBuffer(bb, float.class);
            accelerationY = getFromBuffer(bb, float.class);
            accelerationZ = getFromBuffer(bb, float.class);
            velocityX = getFromBuffer(bb, float.class);
            velocityY = getFromBuffer(bb, float.class);
            velocityZ = getFromBuffer(bb, float.class);
            angularVelocityX = getFromBuffer(bb, float.class);
            angularVelocityY = getFromBuffer(bb, float.class);
            angularVelocityZ = getFromBuffer(bb, float.class);
            yaw = getFromBuffer(bb, float.class);
            pitch = getFromBuffer(bb, float.class);
            roll = getFromBuffer(bb, float.class);
            normalizedSuspensionTravelFrontLeft = getFromBuffer(bb, float.class);
            normalizedSuspensionTravelFrontRight = getFromBuffer(bb, float.class);
            normalizedSuspensionTravelRearLeft = getFromBuffer(bb, float.class);
            normalizedSuspensionTravelRearRight = getFromBuffer(bb, float.class);
            tireSlipRatioFrontLeft = getFromBuffer(bb, float.class);
            tireSlipRatioFrontRight = getFromBuffer(bb, float.class);
            tireSlipRatioRearLeft = getFromBuffer(bb, float.class);
            tireSlipRatioRearRight = getFromBuffer(bb, float.class);
            wheelRotationSpeedFrontLeft = getFromBuffer(bb, float.class);
            wheelRotationSpeedFrontRight = getFromBuffer(bb, float.class);
            wheelRotationSpeedRearLeft = getFromBuffer(bb, float.class);
            wheelRotationSpeedRearRight = getFromBuffer(bb, float.class);
            wheelOnRumbleStripFrontLeft = getFromBuffer(bb, int.class);
            wheelOnRumbleStripFrontRight = getFromBuffer(bb, int.class);
            wheelOnRumbleStripRearLeft = getFromBuffer(bb, int.class);
            wheelOnRumbleStripRearRight = getFromBuffer(bb, int.class);
            wheelInPuddleDepthFrontLeft = getFromBuffer(bb, float.class);
            wheelInPuddleDepthFrontRight = getFromBuffer(bb, float.class);
            wheelInPuddleDepthRearLeft = getFromBuffer(bb, float.class);
            wheelInPuddleDepthRearRight = getFromBuffer(bb, float.class);
            surfaceRumbleFrontLeft = getFromBuffer(bb, float.class);
            surfaceRumbleFrontRight = getFromBuffer(bb, float.class);
            surfaceRumbleRearLeft = getFromBuffer(bb, float.class);
            surfaceRumbleRearRight = getFromBuffer(bb, float.class);
            tireSlipAngleFrontLeft = getFromBuffer(bb, float.class);
            tireSlipAngleFrontRight = getFromBuffer(bb, float.class);
            tireSlipAngleRearLeft = getFromBuffer(bb, float.class);
            tireSlipAngleRearRight = getFromBuffer(bb, float.class);
            tireCombinedSlipFrontLeft = getFromBuffer(bb, float.class);
            tireCombinedSlipFrontRight = getFromBuffer(bb, float.class);
            tireCombinedSlipRearLeft = getFromBuffer(bb, float.class);
            tireCombinedSlipRearRight = getFromBuffer(bb, float.class);
            suspensionTravelMetersFrontLeft = getFromBuffer(bb, float.class);
            suspensionTravelMetersFrontRight = getFromBuffer(bb, float.class);
            suspensionTravelMetersRearLeft = getFromBuffer(bb, float.class);
            suspensionTravelMetersRearRight = getFromBuffer(bb, float.class);
            carOrdinal = getFromBuffer(bb, int.class);
            carClass = getFromBuffer(bb, int.class);
            carPerformanceIndex = getFromBuffer(bb, int.class);
            drivetrainType = getFromBuffer(bb, int.class);
            numCylinders = getFromBuffer(bb, int.class);
            carType = getFromBuffer(bb, int.class);
            unknown1 = getFromBuffer(bb, byte.class);
            unknown2 = getFromBuffer(bb, byte.class);
            unknown3 = getFromBuffer(bb, byte.class);
            unknown4 = getFromBuffer(bb, byte.class);
            unknown5 = getFromBuffer(bb, byte.class);
            unknown6 = getFromBuffer(bb, byte.class);
            unknown7 = getFromBuffer(bb, byte.class);
            unknown8 = getFromBuffer(bb, byte.class);
            positionX = getFromBuffer(bb, float.class);
            positionY = getFromBuffer(bb, float.class);
            positionZ = getFromBuffer(bb, float.class);
            speed = getFromBuffer(bb, float.class);
            power = getFromBuffer(bb, float.class);
            torque = getFromBuffer(bb, float.class);
            tireTempFrontLeft = getFromBuffer(bb, float.class);
            tireTempFrontRight = getFromBuffer(bb, float.class);
            tireTempRearLeft = getFromBuffer(bb, float.class);
            tireTempRearRight = getFromBuffer(bb, float.class);
            boost = getFromBuffer(bb, float.class);
            fuel = getFromBuffer(bb, float.class);
            distanceTraveled = getFromBuffer(bb, float.class);
            bestLap = getFromBuffer(bb, float.class);
            lastLap = getFromBuffer(bb, float.class);
            currentLap = getFromBuffer(bb, float.class);
            currentRaceTime = getFromBuffer(bb, float.class);
            lapNumber = getFromBuffer(bb, short.class);
            racePosition = getFromBuffer(bb, byte.class);
            accel = getFromBuffer(bb, byte.class);
            brake = getFromBuffer(bb, byte.class);
            clutch = getFromBuffer(bb, byte.class);
            handbrake = getFromBuffer(bb, byte.class);
            gear = getFromBuffer(bb, byte.class);
            steer = getFromBuffer(bb, byte.class);
            normalizedDrivingLine = getFromBuffer(bb, byte.class);
            normalizedAIBrakeDifference = getFromBuffer(bb, byte.class);

            readOK = bb.position() == PACKET_SIZE;
        } catch (Exception e) {
            try {
                throw new Exception("Failed to parse Packet");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static boolean checkBuffer(ByteBuffer buffer, int size) {
        return buffer.hasRemaining() && buffer.remaining() >= size;
    }

    @SuppressWarnings("unchecked")
    private static <T> T getFromBuffer(ByteBuffer buffer, Class<T> clazz) throws Exception {
        switch (clazz.getName()) {
            case "int":
                return (T) (checkBuffer(buffer, 4) ? (Object) buffer.getInt() : 0);
            case "long":
                return (T) (checkBuffer(buffer, 4) ? (Object) Integer.toUnsignedLong(buffer.getInt()) : 0L);
            case "byte":
                return (T) (checkBuffer(buffer, 1) ? (Object) buffer.get() : 0);
            case "float":
                return (T) (checkBuffer(buffer, 4) ? (Object) buffer.getFloat() : 0f);
            case "short":
                return (T) (checkBuffer(buffer, 2) ? (Object) buffer.getShort() : 0);
        }
        throw new Exception("Invalid Type");
    }

    public boolean getIsRaceOn() {
        return isRaceOn;
    }

    public Long getTimeStampMS() {
        return timeStampMS;
    }

    public float getEngineMaxRpm() {
        return engineMaxRpm;
    }

    public Float getEngineIdleRpm() {
        return engineIdleRpm;
    }

    public float getCurrentEngineRpm() {
        return currentEngineRpm;
    }

    public Float getAccelerationX() {
        return accelerationX;
    }

    public Float getAccelerationY() {
        return accelerationY;
    }

    public Float getAccelerationZ() {
        return accelerationZ;
    }

    public Float getVelocityX() {
        return velocityX;
    }

    public Float getVelocityY() {
        return velocityY;
    }

    public Float getVelocityZ() {
        return velocityZ;
    }

    public Float getAngularVelocityX() {
        return angularVelocityX;
    }

    public Float getAngularVelocityY() {
        return angularVelocityY;
    }

    public Float getAngularVelocityZ() {
        return angularVelocityZ;
    }

    public Float getYaw() {
        return yaw;
    }

    public Float getPitch() {
        return pitch;
    }

    public Float getRoll() {
        return roll;
    }

    public Float getNormalizedSuspensionTravelFrontLeft() {
        return normalizedSuspensionTravelFrontLeft;
    }

    public Float getNormalizedSuspensionTravelFrontRight() {
        return normalizedSuspensionTravelFrontRight;
    }

    public Float getNormalizedSuspensionTravelRearLeft() {
        return normalizedSuspensionTravelRearLeft;
    }

    public Float getNormalizedSuspensionTravelRearRight() {
        return normalizedSuspensionTravelRearRight;
    }

    public Float getTireSlipRatioFrontLeft() {
        return tireSlipRatioFrontLeft;
    }

    public Float getTireSlipRatioFrontRight() {
        return tireSlipRatioFrontRight;
    }

    public Float getTireSlipRatioRearLeft() {
        return tireSlipRatioRearLeft;
    }

    public Float getTireSlipRatioRearRight() {
        return tireSlipRatioRearRight;
    }

    public Float getWheelRotationSpeedFrontLeft() {
        return wheelRotationSpeedFrontLeft;
    }

    public Float getWheelRotationSpeedFrontRight() {
        return wheelRotationSpeedFrontRight;
    }

    public Float getWheelRotationSpeedRearLeft() {
        return wheelRotationSpeedRearLeft;
    }

    public Float getWheelRotationSpeedRearRight() {
        return wheelRotationSpeedRearRight;
    }

    public Integer getWheelOnRumbleStripFrontLeft() {
        return wheelOnRumbleStripFrontLeft;
    }

    public Integer getWheelOnRumbleStripFrontRight() {
        return wheelOnRumbleStripFrontRight;
    }

    public Integer getWheelOnRumbleStripRearLeft() {
        return wheelOnRumbleStripRearLeft;
    }

    public Integer getWheelOnRumbleStripRearRight() {
        return wheelOnRumbleStripRearRight;
    }

    public Float getWheelInPuddleDepthFrontLeft() {
        return wheelInPuddleDepthFrontLeft;
    }

    public Float getWheelInPuddleDepthFrontRight() {
        return wheelInPuddleDepthFrontRight;
    }

    public Float getWheelInPuddleDepthRearLeft() {
        return wheelInPuddleDepthRearLeft;
    }

    public Float getWheelInPuddleDepthRearRight() {
        return wheelInPuddleDepthRearRight;
    }

    public Float getSurfaceRumbleFrontLeft() {
        return surfaceRumbleFrontLeft;
    }

    public Float getSurfaceRumbleFrontRight() {
        return surfaceRumbleFrontRight;
    }

    public Float getSurfaceRumbleRearLeft() {
        return surfaceRumbleRearLeft;
    }

    public Float getSurfaceRumbleRearRight() {
        return surfaceRumbleRearRight;
    }

    public Float getTireSlipAngleFrontLeft() {
        return tireSlipAngleFrontLeft;
    }

    public Float getTireSlipAngleFrontRight() {
        return tireSlipAngleFrontRight;
    }

    public Float getTireSlipAngleRearLeft() {
        return tireSlipAngleRearLeft;
    }

    public Float getTireSlipAngleRearRight() {
        return tireSlipAngleRearRight;
    }

    public Float getTireCombinedSlipFrontLeft() {
        return tireCombinedSlipFrontLeft;
    }

    public Float getTireCombinedSlipFrontRight() {
        return tireCombinedSlipFrontRight;
    }

    public Float getTireCombinedSlipRearLeft() {
        return tireCombinedSlipRearLeft;
    }

    public Float getTireCombinedSlipRearRight() {
        return tireCombinedSlipRearRight;
    }

    public Float getSuspensionTravelMetersFrontLeft() {
        return suspensionTravelMetersFrontLeft;
    }

    public Float getSuspensionTravelMetersFrontRight() {
        return suspensionTravelMetersFrontRight;
    }

    public Float getSuspensionTravelMetersRearLeft() {
        return suspensionTravelMetersRearLeft;
    }

    public Float getSuspensionTravelMetersRearRight() {
        return suspensionTravelMetersRearRight;
    }

    public String getCarClass() {
        switch (carClass) {
            case 0:
                return "D";
            case 1:
                return "C";
            case 2:
                return "B";
            case 3:
                return "A";
            case 4:
                return "S1";
            case 5:
                return "S2";
            case 6:
                return "X";
        }
        return "-";
    }

    public Integer getCarPerformanceIndex() {
        return carPerformanceIndex;
    }

    public String getDrivetrain() {
        switch(drivetrainType){
            case 0:
                return "FWD";
            case 1:
                return "RWD";
            case 2:
                return "AWD";
            default:
                return "-";
        }
    }

    public Integer getNumCylinders() {
        return numCylinders;
    }

    public String getCarType() {
        switch (carType) {
            case 11:
                return "Modern Super Cars";
            case 12:
                return "Retro Super Cars";
            case 13:
                return "Hyper Cars";
            case 14:
                return "Retro Saloons";
            case 16:
                return "Vans & Utility";
            case 17:
                return "Retro Sports Cars";
            case 18:
                return "Modern Sports Cars";
            case 19:
                return "Super Saloons";
            case 20:
                return "Classic Racers";
            case 21:
                return "Cult Cars";
            case 22:
                return "Rare Classics";
            case 25:
                return "Super Hot Hatch";
            case 29:
                return "Rods & Customs";
            case 30:
                return "Retro Muscle";
            case 31:
                return "Modern Muscle";
            case 32:
                return "Retro Rally";
            case 33:
                return "Classic Rally";
            case 34:
                return "Rally Monsters";
            case 35:
                return "Modern Rally";
            case 36:
                return "GT Cars";
            case 37:
                return "Super GT";
            case 38:
                return "Extreme Offroad";
            case 39:
                return "Sports Utility Heroes";
            case 40:
                return "Offroad";
            case 41:
                return "Offroad Buggies";
            case 42:
                return "Classic Sports Cars";
            case 43:
                return "Track Toys";
            case 44:
                return "Vintage Racers";
            case 45:
                return "Trucks";
            default:
                return "Unknown (" + carType + ")";
        }
    }

    public Byte getUnknown1() {
        return unknown1;
    }

    public Byte getUnknown2() {
        return unknown2;
    }

    public Byte getUnknown3() {
        return unknown3;
    }

    public Byte getUnknown4() {
        return unknown4;
    }

    public Byte getUnknown5() {
        return unknown5;
    }

    public Byte getUnknown6() {
        return unknown6;
    }

    public Byte getUnknown7() {
        return unknown7;
    }

    public Byte getUnknown8() {
        return unknown8;
    }

    public Integer getCarOrdinal() {
        return carOrdinal;
    }

    public Float getPositionX() {
        return positionX;
    }

    public Float getPositionY() {
        return positionY;
    }

    public Float getPositionZ() {
        return positionZ;
    }

    public Float getSpeedMPS() {
        return speed;
    }

    public int getSpeedKPH() {
        return Math.round(getSpeedMPS() * 3.6f);
    }

    public int getSpeedMPH() {
        return Math.round(getSpeedMPS() * 2.23694f);
    }

    public Float getPower() {
        return power;
    }

    // Watts > HP
    public Float getHorsePower() {
        return getPower() * 0.00134102f;
    }

    public Float getTorque() {
        return torque;
    }

    public Float getTireTempFrontLeft() {
        return tireTempFrontLeft;
    }

    public Float getTireTempFrontRight() {
        return tireTempFrontRight;
    }

    public Float getTireTempRearLeft() {
        return tireTempRearLeft;
    }

    public Float getTireTempRearRight() {
        return tireTempRearRight;
    }

    public Float getBoost() {
        return boost;
    }

    public Float getFuel() {
        return fuel;
    }

    public Float getDistanceTraveled() {
        return distanceTraveled;
    }

    public Float getBestLap() {
        return bestLap;
    }

    public Float getLastLap() {
        return lastLap;
    }

    public Float getCurrentLap() {
        return currentLap;
    }

    public Float getCurrentRaceTime() {
        return currentRaceTime;
    }

    public Short getLapNumber() {
        return lapNumber;
    }

    public Byte getRacePosition() {
        return racePosition;
    }

    public Byte getAccel() {
        return accel;
    }

    public Byte getBrake() {
        return brake;
    }

    public Byte getClutch() {
        return clutch;
    }

    public Byte getHandbrake() {
        return handbrake;
    }

    public Byte getGear() {
        return gear;
    }

    public Byte getSteer() {
        return steer;
    }

    public Byte getNormalizedDrivingLine() {
        return normalizedDrivingLine;
    }

    public Byte getNormalizedAIBrakeDifference() {
        return normalizedAIBrakeDifference;
    }


    public boolean ReadOK() {
        return readOK;
    }

    public float getAverageVelocity() {
        return getVector3DLength(getVelocityX(), getVelocityY(), getVelocityZ());
    }

    public float getTireTempAverageFront() {
        return getAverage(getTireTempFrontLeft(), getTireTempFrontRight());

    }

    public float getTireTempAverageRear() {
        return getAverage(getTireTempRearLeft(), getTireTempRearRight());
    }

    private float getAverage(float valueOne, float valueTwo, float valueThree, float valueFour) {
        return (valueOne + valueTwo + valueThree + valueFour) / 4f;
    }

    public float getTireTempAverageLeft() {
        return getAverage(
                getTireTempFrontLeft(),
                getTireTempRearLeft()
        );
    }

    public float getTireTempAverageRight() {
        return getAverage(getTireTempFrontRight(), getTireTempRearRight());
    }

    public float getTireTempAverageTotal() {
        return getAverage(
                getTireTempFrontLeft(),
                getTireTempFrontRight(),
                getTireTempRearLeft(),
                getTireTempRearRight()
        );
    }

    private float getAverage(float valueOne, float valueTwo) {
        return (valueOne + valueTwo) / 2f;
    }

    private float getVector3DLength(float x, float y, float z) {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "{" +
                " isRaceOn='" + getIsRaceOn() + "'" +
                ", timeStampMS='" + getTimeStampMS() + "'" +
                ", engineMaxRpm='" + getEngineMaxRpm() + "'" +
                ", engineIdleRpm='" + getEngineIdleRpm() + "'" +
                ", currentEngineRpm='" + getCurrentEngineRpm() + "'" +
                ", accelerationX='" + getAccelerationX() + "'" +
                ", accelerationY='" + getAccelerationY() + "'" +
                ", accelerationZ='" + getAccelerationZ() + "'" +
                ", velocityX='" + getVelocityX() + "'" +
                ", velocityY='" + getVelocityY() + "'" +
                ", velocityZ='" + getVelocityZ() + "'" +
                ", averageVelocityZ='" + getAverageVelocity() + "'" +
                ", angularVelocityX='" + getAngularVelocityX() + "'" +
                ", angularVelocityY='" + getAngularVelocityY() + "'" +
                ", angularVelocityZ='" + getAngularVelocityZ() + "'" +
                ", yaw='" + getYaw() + "'" +
                ", pitch='" + getPitch() + "'" +
                ", roll='" + getRoll() + "'" +
                ", normalizedSuspensionTravelFrontLeft='" + getNormalizedSuspensionTravelFrontLeft() + "'" +
                ", normalizedSuspensionTravelFrontRight='" + getNormalizedSuspensionTravelFrontRight() + "'" +
                ", normalizedSuspensionTravelRearLeft='" + getNormalizedSuspensionTravelRearLeft() + "'" +
                ", normalizedSuspensionTravelRearRight='" + getNormalizedSuspensionTravelRearRight() + "'" +
                ", tireSlipRatioFrontLeft='" + getTireSlipRatioFrontLeft() + "'" +
                ", tireSlipRatioFrontRight='" + getTireSlipRatioFrontRight() + "'" +
                ", tireSlipRatioRearLeft='" + getTireSlipRatioRearLeft() + "'" +
                ", tireSlipRatioRearRight='" + getTireSlipRatioRearRight() + "'" +
                ", wheelRotationSpeedFrontLeft='" + getWheelRotationSpeedFrontLeft() + "'" +
                ", wheelRotationSpeedFrontRight='" + getWheelRotationSpeedFrontRight() + "'" +
                ", wheelRotationSpeedRearLeft='" + getWheelRotationSpeedRearLeft() + "'" +
                ", wheelRotationSpeedRearRight='" + getWheelRotationSpeedRearRight() + "'" +
                ", wheelOnRumbleStripFrontLeft='" + getWheelOnRumbleStripFrontLeft() + "'" +
                ", wheelOnRumbleStripFrontRight='" + getWheelOnRumbleStripFrontRight() + "'" +
                ", wheelOnRumbleStripRearLeft='" + getWheelOnRumbleStripRearLeft() + "'" +
                ", wheelOnRumbleStripRearRight='" + getWheelOnRumbleStripRearRight() + "'" +
                ", wheelInPuddleDepthFrontLeft='" + getWheelInPuddleDepthFrontLeft() + "'" +
                ", wheelInPuddleDepthFrontRight='" + getWheelInPuddleDepthFrontRight() + "'" +
                ", wheelInPuddleDepthRearLeft='" + getWheelInPuddleDepthRearLeft() + "'" +
                ", wheelInPuddleDepthRearRight='" + getWheelInPuddleDepthRearRight() + "'" +
                ", surfaceRumbleFrontLeft='" + getSurfaceRumbleFrontLeft() + "'" +
                ", surfaceRumbleFrontRight='" + getSurfaceRumbleFrontRight() + "'" +
                ", surfaceRumbleRearLeft='" + getSurfaceRumbleRearLeft() + "'" +
                ", surfaceRumbleRearRight='" + getSurfaceRumbleRearRight() + "'" +
                ", tireSlipAngleFrontLeft='" + getTireSlipAngleFrontLeft() + "'" +
                ", tireSlipAngleFrontRight='" + getTireSlipAngleFrontRight() + "'" +
                ", tireSlipAngleRearLeft='" + getTireSlipAngleRearLeft() + "'" +
                ", tireSlipAngleRearRight='" + getTireSlipAngleRearRight() + "'" +
                ", tireCombinedSlipFrontLeft='" + getTireCombinedSlipFrontLeft() + "'" +
                ", tireCombinedSlipFrontRight='" + getTireCombinedSlipFrontRight() + "'" +
                ", tireCombinedSlipRearLeft='" + getTireCombinedSlipRearLeft() + "'" +
                ", tireCombinedSlipRearRight='" + getTireCombinedSlipRearRight() + "'" +
                ", suspensionTravelMetersFrontLeft='" + getSuspensionTravelMetersFrontLeft() + "'" +
                ", suspensionTravelMetersFrontRight='" + getSuspensionTravelMetersFrontRight() + "'" +
                ", suspensionTravelMetersRearLeft='" + getSuspensionTravelMetersRearLeft() + "'" +
                ", suspensionTravelMetersRearRight='" + getSuspensionTravelMetersRearRight() + "'" +
                ", carClass='" + getCarClass() + "'" +
                ", carPerformanceIndex='" + getCarPerformanceIndex() + "'" +
                ", drivetrainType='" + getDrivetrain() + "'" +
                ", numCylinders='" + getNumCylinders() + "'" +
                ", carType='" + getCarType() + "'" +
                ", unknown1='" + getUnknown1() + "'" +
                ", unknown2='" + getUnknown2() + "'" +
                ", unknown3='" + getUnknown3() + "'" +
                ", unknown4='" + getUnknown4() + "'" +
                ", unknown5='" + getUnknown5() + "'" +
                ", unknown6='" + getUnknown6() + "'" +
                ", unknown7='" + getUnknown7() + "'" +
                ", unknown8='" + getUnknown8() + "'" +
                ", carOrdinal='" + getCarOrdinal() + "'" +
                ", positionX='" + getPositionX() + "'" +
                ", positionY='" + getPositionY() + "'" +
                ", positionZ='" + getPositionZ() + "'" +
                ", speedMPS='" + getSpeedMPS() + "'" +
                ", speedMPH='" + getSpeedMPH() + "'" +
                ", speedKPH='" + getSpeedKPH() + "'" +
                ", power='" + getPower() + "'" +
                ", horsepower='" + getHorsePower() + "'" +
                ", torque='" + getTorque() + "'" +
                ", tireTempFrontLeft='" + getTireTempFrontLeft() + "'" +
                ", tireTempFrontRight='" + getTireTempFrontRight() + "'" +
                ", tireTempRearLeft='" + getTireTempRearLeft() + "'" +
                ", tireTempRearRight='" + getTireTempRearRight() + "'" +
                ", boost='" + getBoost() + "'" +
                ", fuel='" + getFuel() + "'" +
                ", distanceTraveled='" + getDistanceTraveled() + "'" +
                ", bestLap='" + getBestLap() + "'" +
                ", lastLap='" + getLastLap() + "'" +
                ", currentLap='" + getCurrentLap() + "'" +
                ", currentRaceTime='" + getCurrentRaceTime() + "'" +
                ", lapNumber='" + getLapNumber() + "'" +
                ", racePosition='" + getRacePosition() + "'" +
                ", accel='" + getAccel() + "'" +
                ", brake='" + getBrake() + "'" +
                ", clutch='" + getClutch() + "'" +
                ", handbrake='" + getHandbrake() + "'" +
                ", gear='" + getGear() + "'" +
                ", steer='" + getSteer() + "'" +
                ", normalizedDrivingLine='" + getNormalizedDrivingLine() + "'" +
                ", normalizedAIBrakeDifference='" + getNormalizedAIBrakeDifference() + "'" +
                "}";
    }
}
