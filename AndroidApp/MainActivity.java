
import android.app.*;
import android.net.wifi.*;
import android.os.*;
import android.text.format.*;
import android.view.*;
import android.widget.*;
import java.io.*;
import java.net.*;
import java.nio.*;
import java.util.*;

import android.text.format.Formatter;
import java.math.*;

public class MainActivity extends Activity
{
	TextView isRaceOn_TextView;
	TextView timestamp_TextView;
	TextView engineMaxRPM_TextView;
	TextView engineIdleRPM_TextView;
	TextView engineCurrentRPM_TextView;
	TextView accelerationX_TextView;
	TextView accelerationY_TextView;
	TextView apiAccelerationZ_TextView;
	TextView velocityX_TextView;
	TextView velocityY_TextView;
	TextView velocityZ_TextView;
	TextView velocity_TextView;
	TextView angularVelocityX_TextView;
	TextView angularVelocityY_TextView;
	TextView angularVelocityZ_TextView;
	TextView yaw_TextView;
	TextView pitch_TextView;
	TextView roll_TextView;
	TextView normalizedSuspensionTravelFrontLeft_TextView;
	TextView normalizedSuspensionTravelFrontRight_TextView;
	TextView normalizedSuspensionTravelRearLeft_TextView;
	TextView normalizedSuspensionTravelRearRight_TextView;
	TextView tireSlipRatioFrontLeft_TextView;
	TextView tireSlipRatioFrontRight_TextView;
	TextView tireSlipRatioRearLeft_TextView;
	TextView tireSlipRatioRearRight_TextView;
	TextView wheelRotationSpeedFrontLeft_TextView;
	TextView wheelRotationSpeedFrontRight_TextView;
	TextView wheelRotationSpeedRearLeft_TextView;
	TextView wheelRotationSpeedRearRight_TextView;
	TextView wheelOnRumbleStripFrontLeft_TextView;
	TextView wheelOnRumbleStripFrontRight_TextView;
	TextView wheelOnRumbleStripRearLeft_TextView;
	TextView wheelOnRumbleStripRearRight_TextView;
	TextView wheelInPuddleDepthFrontLeft_TextView;
	TextView wheelInPuddleDepthFrontRight_TextView;
	TextView wheelInPuddleDepthRearLeft_TextView;
	TextView wheelInPuddleDepthRearRight_TextView;
	TextView surfaceRumbleFrontLeft_TextView;
	TextView surfaceRumbleFrontRight_TextView;
	TextView surfaceRumbleRearLeft_TextView;
	TextView surfaceRumbleRearRight_TextView;
	TextView tireSlipAngleFrontLeft_TextView;
	TextView tireSlipAngleFrontRight_TextView;
	TextView tireSlipAngleRearLeft_TextView;
	TextView tireSlipAngleRearRight_TextView;
	TextView tireCombinedSlipFrontLeft_TextView;
	TextView tireCombinedSlipFrontRight_TextView;
	TextView tireCombinedSlipRearLeft_TextView;
	TextView tireCombinedSlipRearRight_TextView;
	TextView suspensionTravelMetersFrontLeft_TextView;
	TextView suspensionTravelMetersFrontRight_TextView;
	TextView suspensionTravelMetersRearLeft_TextView;
	TextView suspensionTravelMetersRearRight_TextView;
	TextView carOrdinal_TextView;
	TextView carClass_TextView;
	TextView carPerformanceIndex_TextView;
	TextView driveTrain_TextView;
	TextView numberOfCylinders_TextView;
	TextView carCategory_TextView;
	TextView unknown1_TextView;
	TextView unknown2_TextView;
	TextView positionX_TextView;
	TextView positionY_TextView;
	TextView positionZ_TextView;
	TextView speedMps_TextView;
	TextView speedMph_TextView;
	TextView speedKph_TextView;
	TextView power_TextView;
	TextView horsepower_TextView;
	TextView torque_TextView;
	TextView tireTempFrontLeft_TextView;
	TextView tireTempFrontRight_TextView;
	TextView tireTempRearLeft_TextView;
	TextView tireTempRearRight_TextView;
	TextView tireTempAverageFront_TextView;
	TextView tireTempAverageRear_TextView;
	TextView boost_TextView;
	TextView fuel_TextView;
	TextView distanceTraveled_TextView;
	TextView bestLap_TextView;
	TextView lastLap_TextView;
	TextView currentLap_TextView;
	TextView currentRaceTime_TextView;
	TextView lapNumber_TextView;
	TextView racePosition_TextView;
	TextView accel_TextView;
	TextView brake_TextView;
	TextView clutch_TextView;
	TextView handbrake_TextView;
	TextView gear_TextView;
	TextView steer_TextView;
	TextView normalizedDrivingLine_TextView;
	TextView normalizedAIBrakeDifference_TextView;

	TextView deviceIp;
	EditText portNumber;
	Button   connect_Button;
	SeekBar  engine_rpm_SeekBar;

	ForzaApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		isRaceOn_TextView = (TextView) findViewById(R.id.isRaceOn_id);
		timestamp_TextView = (TextView) findViewById(R.id.timestamp_id);
		engineMaxRPM_TextView = (TextView) findViewById(R.id.engineMaxRPM_id);
		engineIdleRPM_TextView = (TextView) findViewById(R.id.engineIdleRPM_id);
		engineCurrentRPM_TextView = (TextView) findViewById(R.id.engineCurrentRPM_id);
		accelerationX_TextView = (TextView) findViewById(R.id.accelerationX_id);
		accelerationY_TextView = (TextView) findViewById(R.id.accelerationY_id);
		apiAccelerationZ_TextView = (TextView) findViewById(R.id.accelerationZ_id);
		velocityX_TextView = (TextView) findViewById(R.id.velocityX_id);
		velocityY_TextView = (TextView) findViewById(R.id.velocityY_id);
		velocityZ_TextView = (TextView) findViewById(R.id.velocityZ_id);
		velocity_TextView = (TextView) findViewById(R.id.averageVelocity_id);
		angularVelocityX_TextView = (TextView) findViewById(R.id.angularVelocityX_id);
		angularVelocityY_TextView = (TextView) findViewById(R.id.angularVelocityY_id);
		angularVelocityZ_TextView = (TextView) findViewById(R.id.angularVelocityZ_id);
		yaw_TextView = (TextView) findViewById(R.id.yaw_id);
		pitch_TextView = (TextView) findViewById(R.id.pitch_id);
		roll_TextView = (TextView) findViewById(R.id.roll_id);
		normalizedSuspensionTravelFrontLeft_TextView = (TextView) findViewById(R.id.normalizedSuspensionTravelFrontLeft_id);
		normalizedSuspensionTravelFrontRight_TextView = (TextView) findViewById(R.id.normalizedSuspensionTravelFrontRight_id);
		normalizedSuspensionTravelRearLeft_TextView = (TextView) findViewById(R.id.normalizedSuspensionTravelRearLeft_id);
		normalizedSuspensionTravelRearRight_TextView = (TextView) findViewById(R.id.normalizedSuspensionTravelRearRight_id);
		tireSlipRatioFrontLeft_TextView = (TextView) findViewById(R.id.tireSlipRatioFrontLeft_id);
		tireSlipRatioFrontRight_TextView = (TextView) findViewById(R.id.tireSlipRatioFrontRight_id);
		tireSlipRatioRearLeft_TextView = (TextView) findViewById(R.id.tireSlipRatioRearLeft_id);
		tireSlipRatioRearRight_TextView = (TextView) findViewById(R.id.tireSlipRatioRearRight_id);
		wheelRotationSpeedFrontLeft_TextView = (TextView) findViewById(R.id.wheelRotationSpeedFrontLeft_id);
		wheelRotationSpeedFrontRight_TextView = (TextView) findViewById(R.id.wheelRotationSpeedFrontRight_id);
		wheelRotationSpeedRearLeft_TextView = (TextView) findViewById(R.id.wheelRotationSpeedRearLeft_id);
		wheelRotationSpeedRearRight_TextView = (TextView) findViewById(R.id.wheelRotationSpeedRearRight_id);
		wheelOnRumbleStripFrontLeft_TextView = (TextView) findViewById(R.id.wheelOnRumbleStripFrontLeft_id);
		wheelOnRumbleStripFrontRight_TextView = (TextView) findViewById(R.id.wheelOnRumbleStripFrontRight_id);
		wheelOnRumbleStripRearLeft_TextView = (TextView) findViewById(R.id.wheelOnRumbleStripRearLeft_id);
		wheelOnRumbleStripRearRight_TextView = (TextView) findViewById(R.id.wheelOnRumbleStripRearRight_id);
		wheelInPuddleDepthFrontLeft_TextView = (TextView) findViewById(R.id.wheelInPuddleDepthFrontLeft_id);
		wheelInPuddleDepthFrontRight_TextView = (TextView) findViewById(R.id.wheelInPuddleDepthFrontRight_id);
		wheelInPuddleDepthRearLeft_TextView = (TextView) findViewById(R.id.wheelInPuddleDepthRearLeft_id);
		wheelInPuddleDepthRearRight_TextView = (TextView) findViewById(R.id.wheelInPuddleDepthRearRight_id);
		surfaceRumbleFrontLeft_TextView = (TextView) findViewById(R.id.surfaceRumbleFrontLeft_id);
		surfaceRumbleFrontRight_TextView = (TextView) findViewById(R.id.surfaceRumbleFrontRight_id);
		surfaceRumbleRearLeft_TextView = (TextView) findViewById(R.id.surfaceRumbleRearLeft_id);
		surfaceRumbleRearRight_TextView = (TextView) findViewById(R.id.surfaceRumbleRearRight_id);
		tireSlipAngleFrontLeft_TextView = (TextView) findViewById(R.id.tireSlipAngleFrontLeft_id);
		tireSlipAngleFrontRight_TextView = (TextView) findViewById(R.id.tireSlipAngleFrontRight_id);
		tireSlipAngleRearLeft_TextView = (TextView) findViewById(R.id.tireSlipAngleRearLeft_id);
		tireSlipAngleRearRight_TextView = (TextView) findViewById(R.id.tireSlipAngleRearRight_id);
		tireCombinedSlipFrontLeft_TextView = (TextView) findViewById(R.id.tireCombinedSlipFrontLeft_id);
		tireCombinedSlipFrontRight_TextView = (TextView) findViewById(R.id.tireCombinedSlipFrontRight_id);
		tireCombinedSlipRearLeft_TextView = (TextView) findViewById(R.id.tireCombinedSlipRearLeft_id);
		tireCombinedSlipRearRight_TextView = (TextView) findViewById(R.id.tireCombinedSlipRearRight_id);
		suspensionTravelMetersFrontLeft_TextView = (TextView) findViewById(R.id.suspensionTravelMetersFrontLeft_id);
		suspensionTravelMetersFrontRight_TextView = (TextView) findViewById(R.id.suspensionTravelMetersFrontRight_id);
		suspensionTravelMetersRearLeft_TextView = (TextView) findViewById(R.id.suspensionTravelMetersRearLeft_id);
		suspensionTravelMetersRearRight_TextView = (TextView) findViewById(R.id.suspensionTravelMetersRearRight_id);
		carOrdinal_TextView = (TextView) findViewById(R.id.carOrdinal_id);
		carClass_TextView = (TextView) findViewById(R.id.carClass_id);
		carPerformanceIndex_TextView = (TextView) findViewById(R.id.carPerformanceIndex_id);
		driveTrain_TextView = (TextView) findViewById(R.id.driveTrain_id);
		numberOfCylinders_TextView = (TextView) findViewById(R.id.numberOfCylinders_id);
		carCategory_TextView = (TextView) findViewById(R.id.carCategory_id);
		unknown1_TextView = (TextView) findViewById(R.id.unknown1_id);
		unknown2_TextView = (TextView) findViewById(R.id.unknown2_id);
		positionX_TextView = (TextView) findViewById(R.id.positionX_id);
		positionY_TextView = (TextView) findViewById(R.id.positionY_id);
		positionZ_TextView = (TextView) findViewById(R.id.positionZ_id);
		speedMps_TextView = (TextView) findViewById(R.id.speedMps_id);
		speedMph_TextView = (TextView) findViewById(R.id.speedMph_id);
		speedKph_TextView = (TextView) findViewById(R.id.speedKph_id);
		power_TextView = (TextView) findViewById(R.id.power_id);
		horsepower_TextView = (TextView) findViewById(R.id.horsepower_id);
		torque_TextView = (TextView) findViewById(R.id.torque_id);
		tireTempFrontLeft_TextView = (TextView) findViewById(R.id.tireTempFrontLeft_id);
		tireTempFrontRight_TextView = (TextView) findViewById(R.id.tireTempFrontRight_id);
		tireTempRearLeft_TextView = (TextView) findViewById(R.id.tireTempRearLeft_id);
		tireTempRearRight_TextView = (TextView) findViewById(R.id.tireTempRearRight_id);
		tireTempAverageFront_TextView = (TextView) findViewById(R.id.tireTempAverageFront_id);
		tireTempAverageRear_TextView = (TextView) findViewById(R.id.tireTempAverageRear_id);
		boost_TextView = (TextView) findViewById(R.id.boost_id);
		fuel_TextView = (TextView) findViewById(R.id.fuel_id);
		distanceTraveled_TextView = (TextView) findViewById(R.id.distanceTraveled_id);
		bestLap_TextView = (TextView) findViewById(R.id.bestLap_id);
		lastLap_TextView = (TextView) findViewById(R.id.lastLap_id);
		currentLap_TextView = (TextView) findViewById(R.id.currentLap_id);
		lapNumber_TextView = (TextView) findViewById(R.id.lapNumber_id);
		racePosition_TextView = (TextView) findViewById(R.id.racePosition_id);
		accel_TextView = (TextView) findViewById(R.id.accel_id);
		brake_TextView = (TextView) findViewById(R.id.brake_id);
		clutch_TextView = (TextView) findViewById(R.id.clutch_id);
		handbrake_TextView = (TextView) findViewById(R.id.handbrake_id);
		gear_TextView = (TextView) findViewById(R.id.gear_id);
		steer_TextView = (TextView) findViewById(R.id.steer_id);
		normalizedDrivingLine_TextView = (TextView) findViewById(R.id.normalizedDrivingLine_id);
		normalizedAIBrakeDifference_TextView = (TextView) findViewById(R.id.normalizedAIBrakeDifference_id);
		connect_Button = (Button) findViewById(R.id.connect_button);
		engine_rpm_SeekBar = (SeekBar) findViewById(R.id.engine_rpm_SeekBar_id);
		engine_rpm_SeekBar.setMax(10000);

		deviceIp = (TextView) findViewById(R.id.device_ip);
		portNumber = (EditText) findViewById(R.id.port);
		deviceIp.setText(getDeviceIp());
		
						
	
				
    }

	public String getDeviceIp()
	{
		WifiManager wm = (WifiManager) this.getSystemService(this.WIFI_SERVICE);
		String ip = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
		return ip;
	}


	public void connect(View v)
	{
		connect_Button.setEnabled(false);
		connect_Button.setText("Awaiting data...");
		Thread udpSendThread = new Thread(new Runnable() {
				@Override
				public void run() {
					DatagramSocket ds = null;
					try {
					    ds = new DatagramSocket(Integer.valueOf(portNumber.getText().toString()));
					} catch (Exception e) {
						toast(e.toString());
					}
					
					byte[] receive = new byte[323];
					DatagramPacket dp;
					
					boolean connection = true;
				
						while (true) {
							dp = new DatagramPacket(receive, receive.length);
							try	{		
								ds.receive(dp);
								if(connection){
									if(new ForzaApi(dp.getData()).getTimeStampMS()!=0){
											setButtonText("Connected.");
											connection = false;
										}
									}
							} catch (IOException e) {
								toast(e.toString());
							}
							
							api = new ForzaApi(dp.getData());
							//System.out.println(Arrays.toString(dp.getData()));
							
							runOnUiThread(new Runnable() {

									@Override
									public void run()
									{
										engine_rpm_SeekBar.setMax((int)api.getEngineMaxRPM());
										engine_rpm_SeekBar.setProgress((int)api.getEngineCurrentRPM());
										updateText(isRaceOn_TextView, "isRaceOn: " + api.getIsRaceOn());
										updateText(timestamp_TextView, "timestamp: " + api.getTimeStampMS());
										updateText(engineMaxRPM_TextView, "engineMaxRPM: " + api.getEngineMaxRPM());
										updateText(engineIdleRPM_TextView, "engineIdleRPM: " + api.getEngineIdleRPM());
										updateText(engineCurrentRPM_TextView, "engineCurrentRPM: " + api.getEngineCurrentRPM());
										updateText(accelerationX_TextView, "accelerationX: " + api.getAccelerationX());
										updateText(accelerationY_TextView, "accelerationY: " + api.getAccelerationY());
										updateText(apiAccelerationZ_TextView, "accelerationZ: " + api.getAccelerationZ());
										updateText(velocityX_TextView, "velocityX: " + api.getVelocityX());
										updateText(velocityY_TextView, "velocityY: " + api.getVelocityY());
										updateText(velocityZ_TextView, "velocityZ: " + api.getVelocityZ());
										updateText(velocity_TextView, "*averageVelocity: " + api.getAverageVelocity());
										updateText(angularVelocityX_TextView, "angularVelocityX: " + api.getAngularVelocityX());
										updateText(angularVelocityY_TextView, "angularVelocityY: " + api.getAngularVelocityY());
										updateText(angularVelocityZ_TextView, "angularVelocityZ: " + api.getAngularVelocityZ());
										updateText(yaw_TextView, "yaw: " + api.getYaw());
										updateText(pitch_TextView, "pitch: " + api.getPitch());
										updateText(roll_TextView, "roll: " + api.getRoll());
										updateText(normalizedSuspensionTravelFrontLeft_TextView, "normalizedSuspensionTravelFrontLeft: " + api.getNormalizedSuspensionTravelFrontLeft());
										updateText(normalizedSuspensionTravelFrontRight_TextView, "normalizedSuspensionTravelFrontRight: " + api.getNormalizedSuspensionTravelFrontLeft());
										updateText(normalizedSuspensionTravelRearLeft_TextView, "normalizedSuspensionTravelRearLeft: " + api.getNormalizedSuspensionTravelRearLeft());
										updateText(normalizedSuspensionTravelRearRight_TextView, "normalizedSuspensionTravelRearRight: " + api.getNormalizedSuspensionTravelRearRight());
										updateText(tireSlipRatioFrontLeft_TextView, "tireSlipRatioFrontLeft: " + api.getTireSlipRatioRearLeft());
										updateText(tireSlipRatioFrontRight_TextView, "tireSlipRatioFrontRight: " + api.getTireSlipRatioFrontRight());
										updateText(tireSlipRatioRearLeft_TextView, "tireSlipRatioRearLeft: " + api.getTireSlipRatioRearLeft());
										updateText(tireSlipRatioRearRight_TextView, "tireSlipRatioRearRight: " + api.getTireSlipRatioRearRight());
										updateText(wheelRotationSpeedFrontLeft_TextView, "wheelRotationSpeedFrontLeft: " + api.getWheelRotationSpeedFrontLeft());
										updateText(wheelRotationSpeedFrontRight_TextView, "wheelRotationSpeedFrontRight: " + api.getWheelRotationSpeedFrontRight());
										updateText(wheelRotationSpeedRearLeft_TextView, "wheelRotationSpeedRearLeft: " + api.getWheelRotationSpeedRearLeft());
										updateText(wheelRotationSpeedRearRight_TextView, "wheelRotationSpeedRearRight: " + api.getWheelRotationSpeedRearRight());
										updateText(wheelOnRumbleStripFrontLeft_TextView, "wheelOnRumbleStripFrontLeft: " + api.getWheelOnRumbleStripFrontLeft());
										updateText(wheelOnRumbleStripFrontRight_TextView, "wheelOnRumbleStripFrontRight: " + api.getWheelOnRumbleStripFrontRight());
										updateText(wheelOnRumbleStripRearLeft_TextView, "wheelOnRumbleStripRearLeft: " + api.getWheelOnRumbleStripRearLeft());
										updateText(wheelOnRumbleStripRearRight_TextView, "wheelOnRumbleStripRearRight: " + api.getWheelOnRumbleStripRearRight());
										updateText(wheelInPuddleDepthFrontLeft_TextView, "wheelInPuddleDepthFrontLeft: " + api.getWheelInPuddleDepthFrontLeft());
										updateText(wheelInPuddleDepthFrontRight_TextView, "wheelInPuddleDepthFrontRight: " + api.getWheelInPuddleDepthFrontRight());
										updateText(wheelInPuddleDepthRearLeft_TextView, "wheelInPuddleDepthRearLeft: " + api.getWheelInPuddleDepthRearLeft());
										updateText(wheelInPuddleDepthRearRight_TextView, "wheelInPuddleDepthRearRight: " + api.getWheelInPuddleDepthRearRight());
										updateText(surfaceRumbleFrontLeft_TextView, "surfaceRumbleFrontLeft: " + api.getSurfaceRumbleFrontLeft());
										updateText(surfaceRumbleFrontRight_TextView, "surfaceRumbleFrontRight: " + api.getSurfaceRumbleFrontRight());
										updateText(surfaceRumbleRearLeft_TextView, "surfaceRumbleRearLeft: " + api.getSurfaceRumbleRearLeft());
										updateText(surfaceRumbleRearRight_TextView, "surfaceRumbleRearRight: " + api.getSurfaceRumbleRearRight());
										updateText(tireSlipAngleFrontLeft_TextView, "tireSlipAngleFrontLeft: " + api.getTireSlipAngleFrontLeft());
										updateText(tireSlipAngleFrontRight_TextView, "tireSlipAngleFrontRight: " + api.getTireSlipAngleFrontRight());
										updateText(tireSlipAngleRearLeft_TextView, "tireSlipAngleRearLeft: " + api.getTireSlipAngleRearLeft());
										updateText(tireSlipAngleRearRight_TextView, "tireSlipAngleRearRight: " + api.getTireSlipAngleRearRight());
										updateText(tireCombinedSlipFrontLeft_TextView, "tireCombinedSlipFrontLeft: " + api.getTireCombinedSlipFrontLeft());
										updateText(tireCombinedSlipFrontRight_TextView, "tireCombinedSlipFrontRight: " + api.getTireCombinedSlipFrontRight());
										updateText(tireCombinedSlipRearLeft_TextView, "tireCombinedSlipRearLeft: " + api.getTireCombinedSlipRearLeft());
										updateText(tireCombinedSlipRearRight_TextView, "tireCombinedSlipRearRight: " + api.getTireCombinedSlipRearRight());
										updateText(suspensionTravelMetersFrontLeft_TextView, "suspensionTravelMetersFrontLeft: " + api.getSuspensionTravelMetersFrontLeft());
										updateText(suspensionTravelMetersFrontRight_TextView, "suspensionTravelMetersFrontRight: " + api.getSuspensionTravelMetersFrontRight());
										updateText(suspensionTravelMetersRearLeft_TextView, "suspensionTravelMetersRearLeft: " + api.getSuspensionTravelMetersRearLeft());
										updateText(suspensionTravelMetersRearRight_TextView, "suspensionTravelMetersRearRight: " + api.getSuspensionTravelMetersRearRight());
										updateText(carOrdinal_TextView, "carOrdinal: " + api.getCarOrdinal());
										updateText(carClass_TextView, "carClass: " + api.getCarClass());
										updateText(carPerformanceIndex_TextView, "carPerformanceIndex: " + api.getCarPerformanceIndex());
										updateText(driveTrain_TextView, "driveTrain: " + api.getDriveTrain());
										updateText(numberOfCylinders_TextView, "numberOfCylinders: " + api.getNumberOfCylinders());
										updateText(carCategory_TextView, "carCategory: " + api.getCarCategory());
										updateText(unknown1_TextView, "unknown1: " + api.getUnknown1());
										updateText(unknown2_TextView, "unknown2: " + api.getUnknown2());
										updateText(positionX_TextView, "positionX: " + api.getPositionX());
										updateText(positionY_TextView, "positionY: " + api.getPositionY());
										updateText(positionZ_TextView, "positionZ: " + api.getPositionZ());
										updateText(speedMps_TextView, "speed (m/s): " + api.getSpeedMps());
										updateText(speedMph_TextView, "speed (mph): " + api.getSpeedMph());
										updateText(speedKph_TextView, "speed (kph): " + api.getSpeedKph());
										updateText(power_TextView, "power (watts): " + api.getPower());
										updateText(horsepower_TextView, "horsepower: " + api.getHorsePower());
										updateText(torque_TextView, "torque: " + api.getTorque());
										updateText(tireTempFrontLeft_TextView, "tireTempFrontLeft: " + api.getTireTempFrontLeft());
										updateText(tireTempFrontRight_TextView, "tireTempFrontRight: " + api.getTireTempFrontRight());
										updateText(tireTempRearLeft_TextView, "tireTempRearLeft: " + api.getTireTempRearLeft());
										updateText(tireTempRearRight_TextView, "tireTempRearRight: " + api.getTireTempRearRight());
										updateText(tireTempAverageFront_TextView, "*tireTempAverageFront: " + api.getTireTempAverageFront());
										updateText(tireTempAverageRear_TextView, "*tireTempAverageRear: " + api.getTireTempAverageRear());
										updateText(boost_TextView, "boost: " + api.getBoost());
										updateText(fuel_TextView, "fuel: " + api.getFuel());
										updateText(distanceTraveled_TextView, "distanceTraveled: " + api.getDistanceTraveled());
										updateText(bestLap_TextView, "bestLap: " + api.getBestLap());
										updateText(lastLap_TextView, "lastLap: " + api.getLastLap());
										updateText(currentLap_TextView, "currentLap: " + api.getCurrentLap());
										updateText(lapNumber_TextView, "lapNumber: " + api.getLapNumber());
										updateText(racePosition_TextView, "racePosition: " + api.getRacePosition());
										updateText(accel_TextView, "accel: " + api.getAccel());
										updateText(brake_TextView, "brake: " + api.getBrake());
										updateText(clutch_TextView, "clutch: " + api.getClutch());
										updateText(handbrake_TextView, "handbrake: " + api.getHandbrake());
										updateText(gear_TextView, "gear: " + api.getGear());
										updateText(steer_TextView, "steer: " + api.getSteer());
										updateText(normalizedDrivingLine_TextView, "normalizedDrivingLine: " + api.getNormalizedDrivingLine());
										updateText(normalizedAIBrakeDifference_TextView, "normalizedAiBrakeDifference: " + api.getNormalizedAIBrakeDifference());
									}});

							receive = new byte[323];
						} 
				}
			});

		int port = Integer.valueOf(portNumber.getText().toString());
		if (port == 0 || port > 65535)
		{
			Toast.makeText(this, "Type in a port from 0 to 65535", Toast.LENGTH_SHORT).show();
		}
		else
		{
			udpSendThread.start();
		}
	}


	public void updateText(final TextView tv, final String text)
	{
		tv.setText(text);
	}

	public void setButtonText(final String s){
		runOnUiThread(new Runnable() {
				public void run() {
					connect_Button.setText(s);
			}
		});
	}
	
	public void toast(final String s)
	{
		runOnUiThread(new Runnable() {
				public void run()
				{
					Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
				}
			});
	}
}
