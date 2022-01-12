# ForzaTelemetryWrapper
Forza DATA OUT telemetry wrapper. Used to pull data from in-game using its built in telemetry system.

# HOW TO USE

If you want to run and see realtime data in the terminal, use the ExampleFile.java in an IDE (alongside ForzaApi of course),
which has the variables for every set of data. It also contains the full UDP socket connection process which I will explain below.

This will also work on android, but note that you cannot update any views on the main thread so runOnUiThread() is required.
This goes for using the Datagram functions as well (no network on main thread), which can be overriden with a Thread/Runnable.


To use ForzaApi, initialize it and with a value of null. It will be re-initialized in a loop when data is ready to be received and parsed.

    ForzaApi api = null;


Now, create a DatagramSocket and choose a port number. You can pick any, just set it to the same one in your forza settings.

    DatagramSocket ds = null;  //Initialize UDP stream socket
        try {
            ds = new DatagramSocket(5300);
        } catch (SocketException e) {
            e.printStackTrace();
        }

Create your byte buffer/packet size. In this case, 323 bytes are received by the UDP stream.

    byte[] receive = new byte[323];  //Create packet buffer size, which in this case is 323

Here is the fun part. Create a DatagramPacket and give it a value of null, and create an infinite (while) loop below it.

    DatagramPacket dp;
        while (true) {
        
        }
        
To receive packet data from the socket, you must initialize the DatagramPacket with the byte buffer and length, 
then pass it to the DatagramSocket. Add this to your loop.

    dp = new DatagramPacket(receive, receive.length); //Pass bytes and packet size

            try {
                ds.receive(dp); //receive UDP data stream and pass it to DatagramPacket
            } catch (IOException e) {
                e.printStackTrace();
            }
            
To clear the byte buffer after every loop, add this to the bottom of your loop. Don't put anything below it.

    receive = new byte[323]; //Clear byte buffer

Now, to start getting data you have to initialize ForzaApi in the loop and pass it the bytes from DatagramPacket using getData().

    api = new ForzaApi(dp.getData()); //Initialize ForzaApi and pass stream data to be parsed
    
    
You can now start getting data! Use ExampleFile.java to see all possible functions, aswell as what they return.

    float engineMaxRPM     = api.getEngineMaxRPM();
    float engineIdleRPM    = api.getEngineIdleRPM();
    float engineCurrentRPM = api.getEngineCurrentRPM();
    
    System.out.println("Current RPM: " + engineCurrentRPM);
    System.out.println("Max RPM: " + engineMaxRPM);
    System.out.println("Current RPM: " + engineIdleRPM);
    
To get all the data in raw byte array form, use this:

    Arrays.toString(dp.getData());
    
## IMPORTANT!

If you are a developer and want to know how to read the data for usage in other langauges or applications, read through ForzaApi.java
and hopefully you can recreate it. You must receive a UDP stream of data from a socket, each chunk of data is 320 bytes. To parse it, you must
order the bytes into an array using the LITTLE ENDIAN order. You can see how it works in the getBytes() method in ForzaApi.java.
Each set of data is 4 bytes long, with an exception for some of the last ones which are 1 and 2 bytes long. Most of them return floats,
but some of them will return ints, booleans, or bytes, one even returns a short.
