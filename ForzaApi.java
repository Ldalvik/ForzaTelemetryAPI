package org.example;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class ForzaApi {
    byte[] DATA_OUT;

    /**
     * Constructor class for ForzaApi. Receives byte
     * data array and passes it to {@code DATA_OUT}
     *
     * @param bytes the packet data.
     */

    public ForzaApi(byte[] bytes) {
        DATA_OUT = bytes;
    }

    public boolean getIsRaceOn() {
        boolean isRaceOn = false;
        if (getBytes(DATA_OUT, 0, 4).getInt() == 0) isRaceOn = false;
        if (getBytes(DATA_OUT, 0, 4).getInt() == 1) isRaceOn = true;
        return isRaceOn;
    }

    public int getTimeStampMS() {
        return getBytes(DATA_OUT, 4, 8).getInt();
    }

    //ENGINE RPM//
    public float getEngineMaxRPM() {
        return getBytes(DATA_OUT, 8, 12).getFloat();
    }

    public float getEngineIdleRPM() {
        return getBytes(DATA_OUT, 12, 16).getFloat();
    }

    public float getEngineCurrentRPM() {
        return getBytes(DATA_OUT, 16, 20).getFloat();
    }

    //ACCELERATION AXIS//
    public float getAccelerationX() {
        return getBytes(DATA_OUT, 20, 24).getFloat();
    }

    public float getAccelerationY() {
        return getBytes(DATA_OUT, 24, 28).getFloat();
    }

    public float getAccelerationZ() {
        return getBytes(DATA_OUT, 28, 32).getFloat();
    }

    //VELOCITY AXIS//
    public float getVelocityX() {
        return getBytes(DATA_OUT, 32, 36).getFloat();
    }

    public float getVelocityY() {
        return getBytes(DATA_OUT, 36, 40).getFloat();
    }

    public float getVelocityZ() {
        return getBytes(DATA_OUT, 40, 44).getFloat();
    }

    //ANGULAR VELOCITY AXIS//
    public float getAngularVelocityX() {
        return getBytes(DATA_OUT, 44, 48).getFloat();
    }

    public float getAngularVelocityY() {
        return getBytes(DATA_OUT, 48, 52).getFloat();
    }

    public float getAngularVelocityZ() {
        return getBytes(DATA_OUT, 52, 56).getFloat();
    }

    //ROTATION//
    public float getYaw() {
        return getBytes(DATA_OUT, 56, 60).getFloat();
    }

    public float getPitch() {
        return getBytes(DATA_OUT, 60, 64).getFloat();
    }

    public float getRoll() {
        return getBytes(DATA_OUT, 64, 68).getFloat();
    }

    //NORMALIZED SUSPENSION TRAVEL//
    public float getNormalizedSuspensionTravelFrontLeft() {
        return getBytes(DATA_OUT, 68, 72).getFloat();
    }

    public float getNormalizedSuspensionTravelFrontRight() {
        return getBytes(DATA_OUT, 72, 76).getFloat();
    }

    public float getNormalizedSuspensionTravelRearLeft() {
        return getBytes(DATA_OUT, 76, 80).getFloat();
    }

    public float getNormalizedSuspensionTravelRearRight() {
        return getBytes(DATA_OUT, 80, 84).getFloat();
    }

    //TIRE SLIP RATIO FRONT LEFT//
    public float getTireSlipRatioFrontLeft() {
        return getBytes(DATA_OUT, 84, 88).getFloat();
    }

    public float getTireSlipRatioFrontRight() {
        return getBytes(DATA_OUT, 88, 92).getFloat();
    }

    public float getTireSlipRatioRearLeft() {
        return getBytes(DATA_OUT, 92, 96).getFloat();
    }

    public float getTireSlipRatioRearRight() {
        return getBytes(DATA_OUT, 96, 100).getFloat();
    }

    //WHEEL ROTATION SPEED//
    public float getWheelRotationSpeedFrontLeft() {
        return getBytes(DATA_OUT, 100, 104).getFloat();
    }

    public float getWheelRotationSpeedFrontRight() {
        return getBytes(DATA_OUT, 104, 108).getFloat();
    }

    public float getWheelRotationSpeedRearLeft() {
        return getBytes(DATA_OUT, 108, 112).getFloat();
    }

    public float getWheelRotationSpeedRearRight() {
        return getBytes(DATA_OUT, 112, 116).getFloat();
    }

    //WHEEL ON RUMBLE STRIP SPEED//
    public int getWheelOnRumbleStripFrontLeft() {
        return getBytes(DATA_OUT, 116, 120).getInt();
    }

    public int getWheelOnRumbleStripFrontRight() {
        return getBytes(DATA_OUT, 120, 124).getInt();
    }

    public int getWheelOnRumbleStripRearLeft() {
        return getBytes(DATA_OUT, 124, 128).getInt();
    }

    public int getWheelOnRumbleStripRearRight() {
        return getBytes(DATA_OUT, 128, 132).getInt();
    }

    //WHEEL IN PUDDLE DEPTH//
    public float getWheelInPuddleDepthFrontLeft() {
        return getBytes(DATA_OUT, 132, 136).getFloat();
    }

    public float getWheelInPuddleDepthFrontRight() {
        return getBytes(DATA_OUT, 136, 140).getFloat();
    }

    public float getWheelInPuddleDepthRearLeft() {
        return getBytes(DATA_OUT, 140, 144).getInt();
    }

    public float getWheelInPuddleDepthRearRight() {
        return getBytes(DATA_OUT, 144, 148).getFloat();
    }

    //SURFACE RUMBLE//
    public float getSurfaceRumbleFrontLeft() {
        return getBytes(DATA_OUT, 148, 152).getFloat();
    }

    public float getSurfaceRumbleFrontRight() {
        return getBytes(DATA_OUT, 152, 156).getFloat();
    }

    public float getSurfaceRumbleRearLeft() {
        return getBytes(DATA_OUT, 156, 160).getFloat();
    }

    public float getSurfaceRumbleRearRight() {
        return getBytes(DATA_OUT, 160, 164).getFloat();
    }

    //TIRE SLIP ANGLE//
    public float getTireSlipAngleFrontLeft() {
        return getBytes(DATA_OUT, 164, 168).getFloat();
    }

    public float getTireSlipAngleFrontRight() {
        return getBytes(DATA_OUT, 168, 172).getFloat();
    }

    public float getTireSlipAngleRearLeft() {
        return getBytes(DATA_OUT, 172, 176).getFloat();
    }

    public float getTireSlipAngleRearRight() {
        return getBytes(DATA_OUT, 176, 180).getFloat();
    }

    //TIRE COMBINED SLIP//
    public float getTireCombinedSlipFrontLeft() {
        return getBytes(DATA_OUT, 180, 184).getFloat();
    }

    public float getTireCombinedSlipFrontRight() {
        return getBytes(DATA_OUT, 184, 188).getFloat();
    }

    public float getTireCombinedSlipRearLeft() {
        return getBytes(DATA_OUT, 188, 192).getFloat();
    }

    public float getTireCombinedSlipRearRight() {
        return getBytes(DATA_OUT, 192, 196).getFloat();
    }

    //SUSPENSION TRAVEL METERS//
    public float getSuspensionTravelMetersFrontLeft() {
        return getBytes(DATA_OUT, 196, 200).getFloat();
    }

    public float getSuspensionTravelMetersFrontRight() {
        return getBytes(DATA_OUT, 200, 204).getFloat();
    }

    public float getSuspensionTravelMetersRearLeft() {
        return getBytes(DATA_OUT, 204, 208).getFloat();
    }

    public float getSuspensionTravelMetersRearRight() {
        return getBytes(DATA_OUT, 208, 212).getFloat();
    }

    //VEHICLE STATS//
    public int getCarOrdinal() {
        return getBytes(DATA_OUT, 212, 216).getInt();
    }

    public int getCarClass() {
        return getBytes(DATA_OUT, 216, 220).getInt();
    }

    public int getCarPerformanceIndex() {
        return getBytes(DATA_OUT, 220, 224).getInt();
    }

    public int getDriveTrain() {
        return getBytes(DATA_OUT, 224, 228).getInt();
    }

    public int getNumberOfCylinders() {
        return getBytes(DATA_OUT, 228, 232).getInt();
    }

    public int getCarCategory() {
        return getBytes(DATA_OUT, 232, 236).getInt();
    }

    public int getUnknown1() {
        return getBytes(DATA_OUT, 236, 240).getInt();
    }

    public int getUnknown2() {
        return getBytes(DATA_OUT, 240, 244).getInt();
    }

    //POSITION AXIS//
    public float getPositionX() {
        return getBytes(DATA_OUT, 244, 248).getFloat();
    }

    public float getPositionY() {
        return getBytes(DATA_OUT, 248, 252).getFloat();
    }

    public float getPositionZ() {
        return getBytes(DATA_OUT, 252, 256).getFloat();
    }

    //VEHICLE ENGINE STATS//
    public float getSpeed() {
        return getBytes(DATA_OUT, 256, 260).getFloat();
    }

    public float getPower() {
        return getBytes(DATA_OUT, 260, 264).getFloat();
    }

    public float getTorque() {
        return getBytes(DATA_OUT, 264, 268).getFloat();
    }

    //TIRE TEMP//
    public float getTireTempFrontLeft() {
        return getBytes(DATA_OUT, 268, 272).getFloat();
    }

    public float getTireTempFrontRight() {
        return getBytes(DATA_OUT, 272, 276).getFloat();
    }

    public float getTireTempRearLeft() {
        return getBytes(DATA_OUT, 276, 280).getFloat();
    }

    public float getTireTempRearRight() {
        return getBytes(DATA_OUT, 280, 284).getFloat();
    }

    //RACE STATS//
    public float getBoost() {
        return getBytes(DATA_OUT, 284, 290).getFloat();
    }

    public float getFuel() {
        return getBytes(DATA_OUT, 290, 294).getFloat();
    }

    public float getDistanceTraveled() {
        return getBytes(DATA_OUT, 294, 300).getFloat();
    }

    public float getBestLap() {
        return getBytes(DATA_OUT, 300, 304).getFloat();
    }

    public float getLastLap() {
        return getBytes(DATA_OUT, 304, 308).getFloat();
    }

    public float getCurrentLap() {
        return getBytes(DATA_OUT, 308, 312).getFloat();
    }

    //Thank you PinkiePie for fixing
    public short getLapNumber() {
        return (short) ((getBytes(DATA_OUT, 313, 314).get() << 8) |
                (getBytes(DATA_OUT, 312, 313).get() & 0xFF));
    }

    public byte getRacePosition() {
        return getBytes(DATA_OUT, 314, 315).get();
    }

    public byte getAccel() {
        return (byte) (getBytes(DATA_OUT, 315, 316).get() & 0xFF);
    }

    public byte getBrake() {
        return (byte) (getBytes(DATA_OUT, 316, 317).get() & 0xFF);
    }

    public byte getClutch() {
        return (byte) (getBytes(DATA_OUT, 317, 318).get() & 0xFF);
    }

    public byte getHandbrake() {
        return (byte) (getBytes(DATA_OUT, 318, 319).get() & 0xFF);
    }

    public byte getGear() {
        return (byte) (getBytes(DATA_OUT, 319, 320).get() & 0xFF);
    }

    public byte getSteer() {
        return (byte) (getBytes(DATA_OUT, 320, 321).get() & 0xFF);
    }

    //MISC//
    //Thank you PinkiePie for fixing
    public byte getNormalizedDrivingLine() {
        return (byte) (getBytes(DATA_OUT, 321, 322).get() & 0xFF);
    }

    public byte getNormalizedAIBrakeDifference() {
        return (byte) (getBytes(DATA_OUT, 322, 323).get() & 0xFF);
    }

    public float getVelocity() {
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

    private ByteBuffer getBytes(byte[] array, int a, int b) {
        return ByteBuffer.wrap(Arrays.copyOfRange(array, a, b)).order(ByteOrder.LITTLE_ENDIAN);
    }
}
