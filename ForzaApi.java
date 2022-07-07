import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;

public class ForzaApi {
    public static final int PACKET_SIZE = 323;
    private final boolean isRaceOn;
    private final Long timeStampMS;
    private final Float engineMaxRpm;
    private final Float engineIdleRpm;
    private final Float currentEngineRpm;
    private final Float accelerationX;
    private final Float accelerationY;
    private final Float accelerationZ;
    private final Float velocityX;
    private final Float velocityY;
    private final Float velocityZ;
    private final Float angularVelocityX;
    private final Float angularVelocityY;
    private final Float angularVelocityZ;
    private final Float yaw;
    private final Float pitch;
    private final Float roll;
    private final Float normalizedSuspensionTravelFrontLeft;
    private final Float normalizedSuspensionTravelFrontRight;
    private final Float normalizedSuspensionTravelRearLeft;
    private final Float normalizedSuspensionTravelRearRight;
    private final Float tireSlipRatioFrontLeft;
    private final Float tireSlipRatioFrontRight;
    private final Float tireSlipRatioRearLeft;
    private final Float tireSlipRatioRearRight;
    private final Float wheelRotationSpeedFrontLeft;
    private final Float wheelRotationSpeedFrontRight;
    private final Float wheelRotationSpeedRearLeft;
    private final Float wheelRotationSpeedRearRight;
    private final Integer wheelOnRumbleStripFrontLeft;
    private final Integer wheelOnRumbleStripFrontRight;
    private final Integer wheelOnRumbleStripRearLeft;
    private final Integer wheelOnRumbleStripRearRight;
    private final Float wheelInPuddleDepthFrontLeft;
    private final Float wheelInPuddleDepthFrontRight;
    private final Float wheelInPuddleDepthRearLeft;
    private final Float wheelInPuddleDepthRearRight;
    private final Float surfaceRumbleFrontLeft;
    private final Float surfaceRumbleFrontRight;
    private final Float surfaceRumbleRearLeft;
    private final Float surfaceRumbleRearRight;
    private final Float tireSlipAngleFrontLeft;
    private final Float tireSlipAngleFrontRight;
    private final Float tireSlipAngleRearLeft;
    private final Float tireSlipAngleRearRight;
    private final Float tireCombinedSlipFrontLeft;
    private final Float tireCombinedSlipFrontRight;
    private final Float tireCombinedSlipRearLeft;
    private final Float tireCombinedSlipRearRight;
    private final Float suspensionTravelMetersFrontLeft;
    private final Float suspensionTravelMetersFrontRight;
    private final Float suspensionTravelMetersRearLeft;
    private final Float suspensionTravelMetersRearRight;
    private final Integer carClass;
    private final Integer carPerformanceIndex;
    private final Integer drivetrainType;
    private final Integer numCylinders;
    private final Integer carType;
    private final Long objectHit;
    //private final Byte unknown1;
    //private final Byte unknown2;
    //private final Byte unknown3;
    //private final Byte unknown4;
    //private final Byte unknown5;
    //private final Byte unknown6;
    //private final Byte unknown7;
    //private final Byte unknown8;
    private final Integer carOrdinal;
    private final Float positionX;
    private final Float positionY;
    private final Float positionZ;
    private final Float speed;
    private final Float power;
    private final Float torque;
    private final Float tireTempFrontLeft;
    private final Float tireTempFrontRight;
    private final Float tireTempRearLeft;
    private final Float tireTempRearRight;
    private final Float boost;
    private final Float fuel;
    private final Float distanceTraveled;
    private final Float bestLap;
    private final Float lastLap;
    private final Float currentLap;
    private final Float currentRaceTime;
    private final Short lapNumber;
    private final Byte racePosition;
    private final Byte throttle;
    private final Byte brake;
    private final Byte clutch;
    private final Byte handbrake;
    private final Byte gear;
    private final Byte steer;
    private final Byte normalizedDrivingLine;
    private final Byte normalizedAIBrakeDifference;

    DecimalFormat df;

    public ForzaApi(byte[] bytes) throws Exception {
        //Check that all 323 bytes were received
        if (bytes.length < PACKET_SIZE) {
            try {
                throw new Exception("Invalid byte length");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Set decimal formatting
        df = new DecimalFormat("###.##");
        df.setRoundingMode(RoundingMode.DOWN);
        
        //Wrap bytes in a ByteBuffer for faster parsing. The encoding is in Little Endian
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        bb.order(ByteOrder.LITTLE_ENDIAN);

        //Set data by going through the bytebuffer
        isRaceOn = getFromBuffer(bb, int.class) == 1;
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
        objectHit = getFromBuffer(bb);
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
        throttle = getFromBuffer(bb, byte.class);
        brake = getFromBuffer(bb, byte.class);
        clutch = getFromBuffer(bb, byte.class);
        handbrake = getFromBuffer(bb, byte.class);
        gear = getFromBuffer(bb, byte.class);
        steer = getFromBuffer(bb, byte.class);
        normalizedDrivingLine = getFromBuffer(bb, byte.class);
        normalizedAIBrakeDifference = getFromBuffer(bb, byte.class);
    }

    //Method to check if selected type length is not overflowing the length of the bytebuffer
    private static boolean checkBuffer(ByteBuffer buffer, int size) {
        return buffer.hasRemaining() && buffer.remaining() >= size;
    }

    //Return data if requirements are met, sets default value to 0 otherwise
    @SuppressWarnings("unchecked")
    private static <T> T getFromBuffer(ByteBuffer buffer, Class<T> type) throws Exception {
        switch (type.getName()) {
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

    //Object hit workaround. The value returned is unknown. Forza Mystery!
    @SuppressWarnings("unchecked")
    private static <T> T getFromBuffer(ByteBuffer buffer) {
        return (T) (checkBuffer(buffer, 1) ? (Object) buffer.getLong() : 0L);
    }

    /*
    * GETTERS FOR FORZA HORIZON 5 UDP STREAM DATA OUT.
    */
    public Boolean getIsRaceOn() {
        return isRaceOn;
    }

    public Long getTimeStampMS() {
        return timeStampMS;
    }

    public Integer getEngineMaxRpm() {
        return Math.round(engineMaxRpm);
    }

    public Integer getEngineIdleRpm() {
        return Math.round(engineIdleRpm);
    }

    public Integer getCurrentEngineRpm() {
        return Math.round(currentEngineRpm);
    }

    public Integer getAccelerationX() {
       return Math.round(accelerationX * 100);
    }

    public Integer getAccelerationY() {
        return Math.round(accelerationY * 100);
    }

    public Integer getAccelerationZ() {
        return Math.round(accelerationZ * 100);
    }

    public Integer getVelocityX() {
        return Math.round(velocityX * 100);
    }

    public Integer getVelocityY() {
        return Math.round(velocityY * 100);
    }

    public Integer getVelocityZ() {
        return Math.round(velocityZ * 100);
    }

    public Integer getAngularVelocityX() {
       return Math.round(angularVelocityX * 100);
    }

    public Integer getAngularVelocityY() {
        return Math.round(angularVelocityY * 100);
    }

    public Integer getAngularVelocityZ() {
        return Math.round(angularVelocityZ * 100);
    }

    public Integer getYaw() {
        return Math.round(yaw * 100);
    }

    public Integer getPitch() {
        return Math.round(pitch * 100);
    }

    public Integer getRoll() {
        return Math.round(roll * 100);
    }

    public Integer getNormalizedSuspensionTravelFrontLeft() {
        return Math.round(normalizedSuspensionTravelFrontLeft * 100);
    }

    public Integer getNormalizedSuspensionTravelFrontRight() {
        return Math.round(normalizedSuspensionTravelFrontRight * 100);
    }

    public Integer getNormalizedSuspensionTravelRearLeft() {
        return Math.round(normalizedSuspensionTravelRearLeft * 100);
    }

    public Integer getNormalizedSuspensionTravelRearRight() {
        return Math.round(normalizedSuspensionTravelRearRight * 100);
    }

    public Integer getTireSlipRatioFrontLeft() {
        return Math.round(tireSlipRatioFrontLeft * 100);
    }

    public Integer getTireSlipRatioFrontRight() {
        return Math.round(tireSlipRatioFrontRight * 100);
    }

    public Integer getTireSlipRatioRearLeft() {
        return Math.round(tireSlipRatioRearLeft * 100);
    }

    public Integer getTireSlipRatioRearRight() {
        return Math.round(tireSlipRatioRearRight * 100);
    }

    public Integer getWheelRotationSpeedFrontLeft() {
        return Math.round(wheelRotationSpeedFrontLeft * 100);
    }

    public Integer getWheelRotationSpeedFrontRight() {
        return Math.round(wheelRotationSpeedFrontRight * 100);
    }

    public Integer getWheelRotationSpeedRearLeft() {
        return Math.round(wheelRotationSpeedRearLeft * 100);
    }

    public Integer getWheelRotationSpeedRearRight() {
        return Math.round(wheelRotationSpeedRearRight * 100);
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

    public Long getTireSlipAngleFrontLeft() {
        return angle(tireSlipAngleFrontLeft);
    }

    public Long getTireSlipAngleFrontRight() {
        return angle(tireSlipAngleFrontRight);
    }

    public Long getTireSlipAngleRearLeft() {
        return angle(tireSlipAngleRearLeft);
    }

    public Long getTireSlipAngleRearRight() {
        return angle(tireSlipAngleRearRight);
    }

    public Integer getTireCombinedSlipFrontLeft() {
        return Math.round(tireCombinedSlipFrontLeft * 100);
    }

    public Integer getTireCombinedSlipFrontRight() {
        return Math.round(tireCombinedSlipFrontRight * 100);
    }

    public Integer getTireCombinedSlipRearLeft() {
        return Math.round(tireCombinedSlipRearLeft * 100);
    }

    public Integer getTireCombinedSlipRearRight() {
        return Math.round(tireCombinedSlipRearRight * 100);
    }

    public Integer getSuspensionTravelMetersFrontLeft() {
        return Math.round(suspensionTravelMetersFrontLeft * 100);
    }

    public Integer getSuspensionTravelMetersFrontRight() {
        return Math.round(suspensionTravelMetersFrontRight * 100);
    }

    public Integer getSuspensionTravelMetersRearLeft() {
        return Math.round(suspensionTravelMetersRearLeft * 100);
    }

    public Integer getSuspensionTravelMetersRearRight() {
        return Math.round(suspensionTravelMetersRearRight * 100);
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
            default:
                return "-";
        }
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

    public Long getObjectHit() {
        return objectHit;
    }
    
//    public Byte getUnknown1() {
//        return unknown1;
//    }
//
//    public Byte getUnknown2() {
//        return unknown2;
//    }
//
//    public Byte getUnknown3() {
//        return unknown3;
//    }
//
//    public Byte getUnknown4() {
//        return unknown4;
//    }
//
//    public Byte getUnknown5() {
//        return unknown5;
//    }
//
//    public Byte getUnknown6() {
//        return unknown6;
//    }
//
//    public Byte getUnknown7() {
//        return unknown7;
//    }
//
//    public Byte getUnknown8() {
//        return unknown8;
//    }

    public Integer getCarOrdinal() {
        return carOrdinal;
    }

    public Integer getPositionX() {
        return Math.round(positionX * 1000);
    }

    public Integer getPositionY() {
        return Math.round(positionY * 1000);
    }

    public Integer getPositionZ() {
        return Math.round(positionZ * 1000);
    }

    public Integer getSpeedMps() {
        return Math.round(speed);
    }

    public Integer getSpeedKph() {
        return Math.round(getSpeedMps() * 3.6f);
    }

    public Integer getSpeedMph() {
        return Math.round(getSpeedMps() * 2.23694f);
    }

    public Integer getPower() {
        return Math.round(power);
    }

    public Integer getHorsePower() {
        return Math.round(getPower() * 0.00134102f);
    }

    public Integer getTorque() {
        return Math.round(torque);
    }

    public Integer getTireTempFrontLeft() {
       return Math.round(tireTempFrontLeft);
    }

    public Integer getTireTempFrontRight() {
        return Math.round(tireTempFrontRight);
    }

    public Integer getTireTempRearLeft() {
        return Math.round(tireTempRearLeft);
    }

    public Integer getTireTempRearRight() {
        return Math.round(tireTempRearRight);
    }

    public Integer getTireTempAverageFront() {
        return Math.round(getAverage(getTireTempFrontLeft(), getTireTempFrontRight()));
    }

    public Integer getTireTempAverageRear() {
        return Math.round(getAverage(getTireTempRearLeft(), getTireTempRearRight()));
    }

    public Integer getTireTempAverageLeft() {
        return Math.round(getAverage(getTireTempFrontLeft(), getTireTempRearLeft()));
    }

    public Integer getTireTempAverageRight() {
        return Math.round(getAverage(getTireTempFrontRight(), getTireTempRearRight()));
    }

    public Integer getTireTempAverageTotal() {
        return Math.round(getAverage(
                getTireTempFrontLeft(),
                getTireTempFrontRight(),
                getTireTempRearLeft(),
                getTireTempRearRight()
        ));
    }

    public Integer getTireTempFrontLeft_C() {
        return Math.round(((tireTempFrontLeft - 32) * 5 ) / 9);
    }

    public Integer getTireTempFrontRight_C() {
        return Math.round(((tireTempFrontRight - 32) * 5 ) / 9);
    }

    public Integer getTireTempRearLeft_C() {
        return Math.round(((tireTempRearLeft - 32) * 5 ) / 9);
    }

    public Integer getTireTempRearRight_C() {
        return Math.round(((tireTempRearRight - 32) * 5 ) / 9);
    }

    public Integer getTireTempAverageFront_C() {
        float avg = getAverage(getTireTempFrontLeft(), getTireTempFrontRight());
        return Math.round(((avg - 32) * 5 ) / 9);
    }

    public Integer getTireTempAverageRear_C() {
        float avg = (getAverage(getTireTempRearLeft(), getTireTempRearRight()));
        return Math.round(((avg - 32) * 5 ) / 9);
    }

    public Integer getTireTempAverageLeft_C() {
        float avg = getAverage(getTireTempFrontLeft(), getTireTempRearLeft());
        return Math.round(((avg - 32) * 5 ) / 9);
    }

    public Integer getTireTempAverageRight_C() {
        float avg = getAverage(getTireTempFrontRight(), getTireTempRearRight());
        return Math.round(((avg - 32) * 5 ) / 9);
    }

    public Integer getTireTempAverageTotal_C() {
        float avg = getAverage(
                getTireTempFrontLeft(),
                getTireTempFrontRight(),
                getTireTempRearLeft(),
                getTireTempRearRight()
        );
        return Math.round(((avg - 32) * 5 ) / 9);
    }

    public Integer getBoost() {
        return Math.round(boost);
    }

    public Float getFuel() {
        return new BigDecimal(fuel * 100).setScale(2, RoundingMode.DOWN).floatValue();
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

    public Integer getThrottle() {
        return (throttle & 0xff) * 100 / 255;
    }

    public Integer getBrake() {
        return (brake & 0xff) * 100 / 255;
    }

    public Integer getClutch() {
        return (clutch & 0xff) * 100 / 255;
    }

    public Integer getHandbrake() {
        return (handbrake & 0xff) * 100 / 255;
    }

    public Integer getGear() {
        return gear & 0xff;
    }

    public Integer getSteer() {
        return (steer & 0xff) * 100 / 127;
    }

    public Integer getNormalizedDrivingLine() {
        return (normalizedDrivingLine & 0xff) * 100 / 127;
    }

    public Integer getNormalizedAIBrakeDifference() {
        return (normalizedAIBrakeDifference & 0xff) * 100 / 127;
    }

    public Integer getAverageVelocity() {
        return Math.round(getVector3DLength(getVelocityX(), getVelocityY(), getVelocityZ()));
    }

    private Float getAverage(float valueOne, float valueTwo) {
        return (valueOne + valueTwo) / 2f;
    }

    private Float getAverage(float valueOne, float valueTwo, float valueThree, float valueFour) {
        return (valueOne + valueTwo + valueThree + valueFour) / 4f;
    }

    private Float getVector3DLength(float x, float y, float z) {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public Long angle(float i){
        return Math.round(i * 180 / Math.PI);
    }

    @NonNull
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
                ", objectHit='" + getObjectHit() + "'" +
                ", carOrdinal='" + getCarOrdinal() + "'" +
                ", positionX='" + getPositionX() + "'" +
                ", positionY='" + getPositionY() + "'" +
                ", positionZ='" + getPositionZ() + "'" +
                ", speedMps='" + getSpeedMps() + "'" +
                ", speedMph='" + getSpeedMph() + "'" +
                ", speedKph='" + getSpeedKph() + "'" +
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
                ", accel='" + getThrottle() + "'" +
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
