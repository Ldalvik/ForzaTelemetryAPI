# ForzaTelemetryAPI (ANDROID)

## HOW TO USE

To begin using the ForzaTelemetryAPI, download the 4 required files, ```ForzaTelemetryApi.java```, ```ForzaTelemetryBuilder.java```, ```VehicleData.java``` and ```ForzaInterface.java```

To use it in your code, implement it into the main activity class you will be receiving data in.

```java
public class MainActivity extends AppCompatActivity implements ForzaInterface
```

To allow us to access the UDP thread anywhere in the class, we will create a global variable to populate later on.

```java
public class MainActivity extends AppCompatActivity implements ForzaInterface {
  Thread udpThread;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    //...
  }
}
```

We will begin searching for the UDP data on a button press. Assume your view has a button with an ```onClick``` value of "connect".

The port will default to 5300 if not initialized, but ideally you would want to allow users to put their own port.
```java
public void connect(View v) {
  ForzaTelemetryBuilder builder = new ForzaTelemetryBuilder(/* 5300 if empty */) // Telemetry builder object
    .addListener(this);             // Add this (interface) activity to builder
    
  udpThread = builder.getThread();  // Pass the thread to global variable
  udpThread.start();                // Start the UDP thread, will begin searching for incoming packets of 323 bytes.
}
```

To receive data, override the following methods in your class. (You will get compile errors until you do this anyway, as they are required by the ```ForzaInterface.java``` interface.)

```java
@Override
public void onDataReceived(ForzaTelemetryApi api) {}

@Override
public void onConnected(ForzaTelemetryApi api, DatagramPacket packet) {}

@Override
public void onGamePaused() {}

@Ovveride
public void onGameUnpaused() {}

@Override
public void onCarChanged(ForzaTelemetryApi api, VehicleData data) {}
```

While these will work by themselves and data can be read, you will not be able to update views on the UI thread. Because these overrides are being triggered in the telemetry thread, you will have to use ```runOnUiThread```.

```java
@Override
public void onDataReceived(ForzaTelemetryApi api) {
  runOnUiThread(() -> {
    //yourTextView.setText("Current Engine RPM: " + api.getCurrentEngineRPM());
  });
}
```
For more information on how the override methods work, please read the README.md for the java version.


To make sure the thread is paused and resumed properly, make sure interrupt the thread.

```java
@Override
  public void onPause() {
    super.onPause();
    if(udpThread != null) udpThread.interrupt();
  }

@Override
public void onResume() {
  super.onResume();
}
```

Last but not least, here is a helper method to get your device IP address to put in Forza. 
Remember to add ```<uses-permission android:name="android.permission.INTERNET"/>``` to your AndroidManifest.xml

```java
public String getDeviceIp() throws UnknownHostException {
  WifiManager wm = (WifiManager) this.getApplicationContext().getSystemService(WIFI_SERVICE);
  return InetAddress.getByAddress(
      ByteBuffer
        .allocate(Integer.BYTES)
        .order(ByteOrder.LITTLE_ENDIAN)
        .putInt(wm.getConnectionInfo().getIpAddress())
        .array()
      ).getHostAddress();
 }
```
