package org.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class ForzaApi {
     byte[] DATA_OUT;
    public ForzaApi(byte[] bytes){
        DATA_OUT = bytes;
    }

    public boolean getIsRaceOn(){
        boolean isRaceOn = false;
        if(getBytes(DATA_OUT, 0, 4).getInt() == 0) isRaceOn = false;
        if(getBytes(DATA_OUT, 0, 4).getInt() == 1) isRaceOn = true;
        return isRaceOn;
    }
    public int getTimeStampMS(){
        return getBytes(DATA_OUT, 4, 8).getInt();
    }

    //ENGINE RPM//
    public int getEngineMaxRPM(){
        return getBytes(DATA_OUT, 8, 12).getInt();
    }
    public float getEngineIdleRPM(){
        return getBytes(DATA_OUT, 12, 16).getFloat();
    }
    public float getEngineCurrentRPM(){
        return getBytes(DATA_OUT, 16, 20).getFloat();
    }

    //ACCELERATION AXIS//
    public float getAccelerationX(){
        return getBytes(DATA_OUT, 20, 24).getFloat();
    }
    public float getAccelerationY(){
        return getBytes(DATA_OUT, 24, 28).getFloat();
    }
    public float getAccelerationZ(){
        return getBytes(DATA_OUT, 28, 32).getFloat();
    }

    //VELOCITY AXIS//
    public float getVelocityX(){
        return getBytes(DATA_OUT, 32, 36).getFloat();
    }
    public float getVelocityY(){
        return getBytes(DATA_OUT, 36, 40).getFloat();
    }
    public float getVelocityZ(){
        return getBytes(DATA_OUT, 40, 44).getFloat();
    }

    //ANGULAR VELOCITY AXIS//
    public float getAngularVelocityX(){
        return getBytes(DATA_OUT, 44, 48).getFloat();
    }
    public float getAngularVelocityY(){
        return getBytes(DATA_OUT, 48, 52).getFloat();
    }
    public float getAngularVelocityZ(){
        return getBytes(DATA_OUT, 52, 56).getFloat();
    }

    //ROTATION//
    public float getYaw(){
        return getBytes(DATA_OUT, 56, 60).getFloat();
    }
    public float getPitch(){
        return getBytes(DATA_OUT, 60, 64).getFloat();
    }
    public float getRoll(){
        return getBytes(DATA_OUT, 64, 68).getFloat();
    }

    private ByteBuffer getBytes(byte[] array, int offset, int length) {
        return ByteBuffer.wrap(Arrays.copyOfRange(array, offset, length)).order(ByteOrder.LITTLE_ENDIAN);
    }
}
