public class MainActivity extends AppCompatActivity implements ForzaInterface {
    Thread udpThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Start a datasocket/datapacket process that will wait for Forza to establish a connection
    public void connect(View v) {
        ForzaTelemetryBuilder builder = new ForzaTelemetryBuilder(port)
                .addListener(this);

        udpThread = builder.getThread();
        udpThread.start();
    }

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

    @Override
    public void onDataReceived(ForzaTelemetryApi api) {
        runOnUiThread(() -> {
            //view_TextView.setText("Current Engine RPM: " + api.getCurrentEngineRPM();
        });
    }

    @Override
    public void onConnected(ForzaTelemetryApi api, DatagramPacket packet) {
        runOnUiThread(() -> Toast.makeText(MainActivity.this, "Connected.", Toast.LENGTH_SHORT).show());
    }

    @Override
    public void onGamePaused() {
        runOnUiThread(() -> Toast.makeText(MainActivity.this, "Game paused.", Toast.LENGTH_SHORT).show());
    }

    @Override
    public void onGameUnpaused() {
        runOnUiThread(() -> Toast.makeText(MainActivity.this, "Game unpaused.", Toast.LENGTH_SHORT).show());
    }

    @Override
    public void onCarChanged(ForzaTelemetryApi api, VehicleData data) {
        runOnUiThread(() -> {
//             new AlertDialog.Builder(this)
//                     .setTitle("New car!")
//                     .setMessage(Html.fromHtml("" +
//                             "<h3>Ordinal</h3></br>" +
//                             "<p>" + api.getOrdinal() + "</p></br>" +
//                             "<h3>Car Class</h3></br>" +
//                             "<p>" + api.getCarClass() + "</p></br>" +
//                             "<h3>Performance Index (PI)</h3></br>" +
//                             "<p>" + api.getPerformanceIndex() + "</p></br>" +
//                             "<h3>Drivetrain</h3></br>" +
//                             "<p>" + api.getDrivetrain() + "</p></br>" +
//                             "<h3>Cylinders</h3></br>" +
//                             "<p>" + api.getNumOfCylinders() + "</p></br>" +
//                             "<h3>Car Category</h3></br>" +
//                             "<p>" + api.getCarType() + "</p></br>" +
//                             "<h3>Engine Max RPM</h3></br>" +
//                             "<p>" + api.getEngineMaxRpm() + "</p></br>" +
//                             "<h3>Engine Idle RPM</h3></br>" +
//                             "<p>" + api.getEngineIdleRpm() + "</p></br>" +
//                             "", Html.FROM_HTML_MODE_LEGACY))
//                     .setCancelable(true)
//                     .setPositiveButton("CLOSE", null)
//                     .show();
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        if (udpThread != null) udpThread.interrupt();
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
