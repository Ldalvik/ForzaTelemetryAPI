package root.forza.telemetry;

public class ForzaTelemetryBuilder {
    ForzaInterface listener;
    int port = 5300;

    public ForzaTelemetryBuilder(){} //Used for default
    public ForzaTelemetryBuilder(int port) {
        this.port = port;
    }

    ForzaTelemetryBuilder addListener(ForzaInterface listener) {
        this.listener = listener;
        return this;
    }

    Thread getThread() {
        return listener.startConnection(port);
    }
}
