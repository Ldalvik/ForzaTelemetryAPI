package root.forza.telemetry;

public record VehicleData(ForzaTelemetryApi forzaApi) {

    public String getCarName() {
        return forzaApi.getCarName();
    }

    public String getCarClass() {
        return forzaApi.getCarClass();
    }

    public Integer getPerformanceIndex() {
        return forzaApi.getPerformanceIndex();
    }

    public String getDrivetrain() {
        return forzaApi.getDrivetrain();
    }

    public Integer getNumOfCylinders() {
        return forzaApi.getNumOfCylinders();
    }

    public String getCarType() {
        return forzaApi.getCarType();
    }

    public Integer getOrdinal() {
        return forzaApi.getOrdinal();
    }
}
