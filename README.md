# ForzaTelemetryWrapper
Forza DATA OUT telemetry wrapper. Used to pull data from in-game using its built in telemetry system.

# HOW TO USE

To begin using the ForzaTelemetryApi, implement it into the class you will be receiving data in.

```java
    class Main implements ForzaTelemetryApi
```

You will need all 5 methods from the ForzaTelemetryApi to be implemented into your class for it to work. This is where data will be received.

Here is an example of getting data from the API in onDataReceived:

```java
    @Override
    public void onDataReceived(ForzaTelemetryApi api) {
        //Data will be received here at 30 fps. Your main updating loop will be here.
        System.out.println("X Position: " + api.getPositionX());
        System.out.println("Y Position: " + api.getPositionY());
        System.out.println("Z Position: " + api.getPositionZ());
    }
```
