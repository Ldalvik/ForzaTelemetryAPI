# ForzaTelemetryAPI
Forza DATA OUT telemetry API. Used to pull data from in-game using its built in telemetry system.

# HOW TO USE
## This is tutprial is for the ForzaTelemetryAPI JAVA 17+ non-android release. Please refer to the android version if you need to use a lower Java version.

To begin using the ForzaTelemetryApi, download the 4 required files, ```ForzaTelemetryApi.java```, ```ForzaTelemetryBuilder.java```, and ```ForzaInterface.java```

To use it in your code, implement it into the class you will be receiving data in.

```java
class Main implements ForzaTelemetryApi
```

You will need all 5 methods from the ```ForzaTelemetryApi``` to be implemented into your class for it to work. This is where data will be received.

To initialize the API and begin the thread, call ```ForzaTelemetryBuilder``` and start it like this:

```java
public static void main(String[] args) throws UnknownHostException {
        new ForzaTelemetryBuilder(/*Optional, default 5300*/)
                .addListener(new Main()) //Add listener, aka this main class
                .getThread() //Get created thread, will need to be set in your class if interrupts are needed
                .start(); //Start thread (this is being called on a Thread)
                
                System.out.println("Connect to: " + ForzaInterface.getDeviceIp()); //You can use this helper method to get your device IP
}
```


If you want to access the thread in the files scope, call ```getThread()``` like this instead:

```java
public static void main(String[] args) throws UnknownHostException {
        Thread dataStreamThread = null;
        ForzaTelemetryBuilder builder = new ForzaTelemetryBuilder(/*Optional, default 5300*/)
                .addListener(new Main()); 
                dataStreamThread = builder.getThread();
                dataStreamThread.start();
}

//You can now access the thread anywhere
public void doInterrupt() {
    if(dataStreamThread != null) {
        dataStreamThread.interrupt();
    }
}
```


## To get data, use the implemented methods from the ```ForzaTelemetryApi``` class as descibed below.


When the first set of bytes are received, the ```onConnected()``` method is triggered.
Heres an example on how to use it:

```java
  @Override
    public void onConnected(ForzaTelemetryApi api, DatagramPacket packet) {
        //Called once on first connection, first frame of data is accessible as well as the datagrampacket
        System.out.println("Connected to: " + packet.getSocketAddress());
        if(api != null) {
            System.out.println("Car Ordinal: " + api.getOrdinal());
        } else {
            System.out.println("Game is paused, (API returned null)");
        }
    }
```

After ```onConnected()``` is triggered, ```onDataReceived()``` will begin to get updates every 33.33ms (30fps)
Here's an example of getting the X, Y, and Z position of the car and printing it to the console.

```java
    @Override
    public void onDataReceived(ForzaTelemetryApi api) {
        //Data will be received here at 30 fps. Your main updating loop will be here.
        System.out.println("X Position: " + api.getPositionX());
        System.out.println("Y Position: " + api.getPositionY());
        System.out.println("Z Position: " + api.getPositionZ());
    }
```


When you pause and unpause the game, the ```onGamePaused()``` and ```onGameUnpaused()``` methods will be triggered. Because no data is returned while paused, ```onDataReceived()``` will not receive updates.

```java
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
```

And lastly, ```onCarChanged()``` is called when you change vehicles. This returns an extra class called ```VehicleData``` which holds on the static values of your car.
(Car Name, Car Class, Performance Index, Drivetrain, Number of Cylinders, Car Type, Ordinal)

```java
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
```
