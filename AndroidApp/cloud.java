

        String[] arr = {
                "timestamp",
                "engineMaxRPM",
                "engineIdleRPM",
                "engineCurrentRPM",
                "accelerationX",
                "accelerationY",
                "apiAccelerationZ",
                "velocityX",
                "velocityY",
                "velocityZ",
                "angularVelocityX",
                "angularVelocityY",
                "angularVelocityZ",
                "yaw",
                "pitch",
                "roll",
                "normalizedSuspensionTravelFrontLeft",
                "normalizedSuspensionTravelFrontRight",
                "normalizedSuspensionTravelRearLeft",
                "normalizedSuspensionTravelRearRight",
                "tireSlipRatioFrontLeft",
                "tireSlipRatioFrontRight",
                "tireSlipRatioRearLeft",
                "tireSlipRatioRearRight",
                "wheelRotationSpeedFrontLeft",
                "wheelRotationSpeedFrontRight",
                "wheelRotationSpeedRearLeft",
                "wheelRotationSpeedRearRight",
                "wheelOnRumbleStripFrontLeft",
                "wheelOnRumbleStripFrontRight",
                "wheelOnRumbleStripRearLeft",
                "wheelOnRumbleStripRearRight",
                "wheelInPuddleDepthFrontLeft",
                "wheelInPuddleDepthFrontRight",
                "wheelInPuddleDepthRearLeft",
                "wheelInPuddleDepthRearRight",
                "surfaceRumbleFrontLeft",
                "surfaceRumbleFrontRight",
                "surfaceRumbleRearLeft",
                "surfaceRumbleRearRight",
                "tireSlipAngleFrontLeft",
                "tireSlipAngleFrontRight",
                "tireSlipAngleRearLeft",
                "tireSlipAngleRearRight",
                "tireCombinedSlipFrontLeft",
                "tireCombinedSlipFrontRight",
                "tireCombinedSlipRearLeft",
                "tireCombinedSlipRearRight",
                "suspensionTravelMetersFrontLeft",
                "suspensionTravelMetersFrontRight",
                "suspensionTravelMetersRearLeft",
                "suspensionTravelMetersRearRight",
                "carOrdinal",
                "carClass",
                "carPerformanceIndex",
                "driveTrain",
                "numberOfCylinders",
                "positionX",
                "positionY",
                "positionZ",
                "speed",
                "power",
                "torque",
                "tireTempFrontLeft",
                "tireTempFrontRight",
                "tireTempRearLeft",
                "tireTempRearRight",
                "boost",
                "fuel",
                "distanceTraveled",
                "bestLap",
                "lastLap",
                "currentLap",
                "currentRaceTime",
                "lapNumber",
                "racePosition",
                "accel",
                "brake",
                "clutch",
                "handbrake",
                "gear",
                "steer",
                "normalizedDrivingLine",
                "normalizedAIBrakeDifference"};

        for (String s : arr) {
            System.out.println("TextView " + s + "_TextView;");
        }

        for (String s : arr) {
            System.out.println(s + "_TextView = (TextView) findViewById(R.id." + s + "_id);");
        }


        for (String s : arr) {
            System.out.println("updateText(" + s + "_TextView" + ", \"" + s + ": \" + " + s + ");");
        }


        for (String s : arr) {
            System.out.println("<TextView android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:padding=\"5dp\"\n" +
                    "android:text=\"" + s + ": 0\"\n" +
                    "android:id=\"@+id/" + s + "_id\" />");
        }





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
TextView positionX_TextView;
TextView positionY_TextView;
TextView positionZ_TextView;
TextView speed_TextView;
TextView power_TextView;
TextView torque_TextView;
TextView tireTempFrontLeft_TextView;
TextView tireTempFrontRight_TextView;
TextView tireTempRearLeft_TextView;
TextView tireTempRearRight_TextView;
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
timestamp_TextView = (TextView) findViewById(R.id.timestamp_id);
engineMaxRPM_TextView = (TextView) findViewById(R.id.engineMaxRPM_id);
engineIdleRPM_TextView = (TextView) findViewById(R.id.engineIdleRPM_id);
engineCurrentRPM_TextView = (TextView) findViewById(R.id.engineCurrentRPM_id);
accelerationX_TextView = (TextView) findViewById(R.id.accelerationX_id);
accelerationY_TextView = (TextView) findViewById(R.id.accelerationY_id);
apiAccelerationZ_TextView = (TextView) findViewById(R.id.apiAccelerationZ_id);
velocityX_TextView = (TextView) findViewById(R.id.velocityX_id);
velocityY_TextView = (TextView) findViewById(R.id.velocityY_id);
velocityZ_TextView = (TextView) findViewById(R.id.velocityZ_id);
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
positionX_TextView = (TextView) findViewById(R.id.positionX_id);
positionY_TextView = (TextView) findViewById(R.id.positionY_id);
positionZ_TextView = (TextView) findViewById(R.id.positionZ_id);
speed_TextView = (TextView) findViewById(R.id.speed_id);
power_TextView = (TextView) findViewById(R.id.power_id);
torque_TextView = (TextView) findViewById(R.id.torque_id);
tireTempFrontLeft_TextView = (TextView) findViewById(R.id.tireTempFrontLeft_id);
tireTempFrontRight_TextView = (TextView) findViewById(R.id.tireTempFrontRight_id);
tireTempRearLeft_TextView = (TextView) findViewById(R.id.tireTempRearLeft_id);
tireTempRearRight_TextView = (TextView) findViewById(R.id.tireTempRearRight_id);
boost_TextView = (TextView) findViewById(R.id.boost_id);
fuel_TextView = (TextView) findViewById(R.id.fuel_id);
distanceTraveled_TextView = (TextView) findViewById(R.id.distanceTraveled_id);
bestLap_TextView = (TextView) findViewById(R.id.bestLap_id);
lastLap_TextView = (TextView) findViewById(R.id.lastLap_id);
currentLap_TextView = (TextView) findViewById(R.id.currentLap_id);
currentRaceTime_TextView = (TextView) findViewById(R.id.currentRaceTime_id);
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
updateText(timestamp_TextView, "timestamp: " + timestamp);
updateText(engineMaxRPM_TextView, "engineMaxRPM: " + engineMaxRPM);
updateText(engineIdleRPM_TextView, "engineIdleRPM: " + engineIdleRPM);
updateText(engineCurrentRPM_TextView, "engineCurrentRPM: " + engineCurrentRPM);
updateText(accelerationX_TextView, "accelerationX: " + accelerationX);
updateText(accelerationY_TextView, "accelerationY: " + accelerationY);
updateText(apiAccelerationZ_TextView, "apiAccelerationZ: " + apiAccelerationZ);
updateText(velocityX_TextView, "velocityX: " + velocityX);
updateText(velocityY_TextView, "velocityY: " + velocityY);
updateText(velocityZ_TextView, "velocityZ: " + velocityZ);
updateText(angularVelocityX_TextView, "angularVelocityX: " + angularVelocityX);
updateText(angularVelocityY_TextView, "angularVelocityY: " + angularVelocityY);
updateText(angularVelocityZ_TextView, "angularVelocityZ: " + angularVelocityZ);
updateText(yaw_TextView, "yaw: " + yaw);
updateText(pitch_TextView, "pitch: " + pitch);
updateText(roll_TextView, "roll: " + roll);
updateText(normalizedSuspensionTravelFrontLeft_TextView, "normalizedSuspensionTravelFrontLeft: " + normalizedSuspensionTravelFrontLeft);
updateText(normalizedSuspensionTravelFrontRight_TextView, "normalizedSuspensionTravelFrontRight: " + normalizedSuspensionTravelFrontRight);
updateText(normalizedSuspensionTravelRearLeft_TextView, "normalizedSuspensionTravelRearLeft: " + normalizedSuspensionTravelRearLeft);
updateText(normalizedSuspensionTravelRearRight_TextView, "normalizedSuspensionTravelRearRight: " + normalizedSuspensionTravelRearRight);
updateText(tireSlipRatioFrontLeft_TextView, "tireSlipRatioFrontLeft: " + tireSlipRatioFrontLeft);
updateText(tireSlipRatioFrontRight_TextView, "tireSlipRatioFrontRight: " + tireSlipRatioFrontRight);
updateText(tireSlipRatioRearLeft_TextView, "tireSlipRatioRearLeft: " + tireSlipRatioRearLeft);
updateText(tireSlipRatioRearRight_TextView, "tireSlipRatioRearRight: " + tireSlipRatioRearRight);
updateText(wheelRotationSpeedFrontLeft_TextView, "wheelRotationSpeedFrontLeft: " + wheelRotationSpeedFrontLeft);
updateText(wheelRotationSpeedFrontRight_TextView, "wheelRotationSpeedFrontRight: " + wheelRotationSpeedFrontRight);
updateText(wheelRotationSpeedRearLeft_TextView, "wheelRotationSpeedRearLeft: " + wheelRotationSpeedRearLeft);
updateText(wheelRotationSpeedRearRight_TextView, "wheelRotationSpeedRearRight: " + wheelRotationSpeedRearRight);
updateText(wheelOnRumbleStripFrontLeft_TextView, "wheelOnRumbleStripFrontLeft: " + wheelOnRumbleStripFrontLeft);
updateText(wheelOnRumbleStripFrontRight_TextView, "wheelOnRumbleStripFrontRight: " + wheelOnRumbleStripFrontRight);
updateText(wheelOnRumbleStripRearLeft_TextView, "wheelOnRumbleStripRearLeft: " + wheelOnRumbleStripRearLeft);
updateText(wheelOnRumbleStripRearRight_TextView, "wheelOnRumbleStripRearRight: " + wheelOnRumbleStripRearRight);
updateText(wheelInPuddleDepthFrontLeft_TextView, "wheelInPuddleDepthFrontLeft: " + wheelInPuddleDepthFrontLeft);
updateText(wheelInPuddleDepthFrontRight_TextView, "wheelInPuddleDepthFrontRight: " + wheelInPuddleDepthFrontRight);
updateText(wheelInPuddleDepthRearLeft_TextView, "wheelInPuddleDepthRearLeft: " + wheelInPuddleDepthRearLeft);
updateText(wheelInPuddleDepthRearRight_TextView, "wheelInPuddleDepthRearRight: " + wheelInPuddleDepthRearRight);
updateText(surfaceRumbleFrontLeft_TextView, "surfaceRumbleFrontLeft: " + surfaceRumbleFrontLeft);
updateText(surfaceRumbleFrontRight_TextView, "surfaceRumbleFrontRight: " + surfaceRumbleFrontRight);
updateText(surfaceRumbleRearLeft_TextView, "surfaceRumbleRearLeft: " + surfaceRumbleRearLeft);
updateText(surfaceRumbleRearRight_TextView, "surfaceRumbleRearRight: " + surfaceRumbleRearRight);
updateText(tireSlipAngleFrontLeft_TextView, "tireSlipAngleFrontLeft: " + tireSlipAngleFrontLeft);
updateText(tireSlipAngleFrontRight_TextView, "tireSlipAngleFrontRight: " + tireSlipAngleFrontRight);
updateText(tireSlipAngleRearLeft_TextView, "tireSlipAngleRearLeft: " + tireSlipAngleRearLeft);
updateText(tireSlipAngleRearRight_TextView, "tireSlipAngleRearRight: " + tireSlipAngleRearRight);
updateText(tireCombinedSlipFrontLeft_TextView, "tireCombinedSlipFrontLeft: " + tireCombinedSlipFrontLeft);
updateText(tireCombinedSlipFrontRight_TextView, "tireCombinedSlipFrontRight: " + tireCombinedSlipFrontRight);
updateText(tireCombinedSlipRearLeft_TextView, "tireCombinedSlipRearLeft: " + tireCombinedSlipRearLeft);
updateText(tireCombinedSlipRearRight_TextView, "tireCombinedSlipRearRight: " + tireCombinedSlipRearRight);
updateText(suspensionTravelMetersFrontLeft_TextView, "suspensionTravelMetersFrontLeft: " + suspensionTravelMetersFrontLeft);
updateText(suspensionTravelMetersFrontRight_TextView, "suspensionTravelMetersFrontRight: " + suspensionTravelMetersFrontRight);
updateText(suspensionTravelMetersRearLeft_TextView, "suspensionTravelMetersRearLeft: " + suspensionTravelMetersRearLeft);
updateText(suspensionTravelMetersRearRight_TextView, "suspensionTravelMetersRearRight: " + suspensionTravelMetersRearRight);
updateText(carOrdinal_TextView, "carOrdinal: " + carOrdinal);
updateText(carClass_TextView, "carClass: " + carClass);
updateText(carPerformanceIndex_TextView, "carPerformanceIndex: " + carPerformanceIndex);
updateText(driveTrain_TextView, "driveTrain: " + driveTrain);
updateText(numberOfCylinders_TextView, "numberOfCylinders: " + numberOfCylinders);
updateText(positionX_TextView, "positionX: " + positionX);
updateText(positionY_TextView, "positionY: " + positionY);
updateText(positionZ_TextView, "positionZ: " + positionZ);
updateText(speed_TextView, "speed: " + speed);
updateText(power_TextView, "power: " + power);
updateText(torque_TextView, "torque: " + torque);
updateText(tireTempFrontLeft_TextView, "tireTempFrontLeft: " + tireTempFrontLeft);
updateText(tireTempFrontRight_TextView, "tireTempFrontRight: " + tireTempFrontRight);
updateText(tireTempRearLeft_TextView, "tireTempRearLeft: " + tireTempRearLeft);
updateText(tireTempRearRight_TextView, "tireTempRearRight: " + tireTempRearRight);
updateText(boost_TextView, "boost: " + boost);
updateText(fuel_TextView, "fuel: " + fuel);
updateText(distanceTraveled_TextView, "distanceTraveled: " + distanceTraveled);
updateText(bestLap_TextView, "bestLap: " + bestLap);
updateText(lastLap_TextView, "lastLap: " + lastLap);
updateText(currentLap_TextView, "currentLap: " + currentLap);
updateText(currentRaceTime_TextView, "currentRaceTime: " + currentRaceTime);
updateText(lapNumber_TextView, "lapNumber: " + lapNumber);
updateText(racePosition_TextView, "racePosition: " + racePosition);
updateText(accel_TextView, "accel: " + accel);
updateText(brake_TextView, "brake: " + brake);
updateText(clutch_TextView, "clutch: " + clutch);
updateText(handbrake_TextView, "handbrake: " + handbrake);
updateText(gear_TextView, "gear: " + gear);
updateText(steer_TextView, "steer: " + steer);
updateText(normalizedDrivingLine_TextView, "normalizedDrivingLine: " + normalizedDrivingLine);
updateText(normalizedAIBrakeDifference_TextView, "normalizedAIBrakeDifference: " + normalizedAIBrakeDifference);
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="timestamp: 0"
android:id="@+id/timestamp_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="engineMaxRPM: 0"
android:id="@+id/engineMaxRPM_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="engineIdleRPM: 0"
android:id="@+id/engineIdleRPM_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="engineCurrentRPM: 0"
android:id="@+id/engineCurrentRPM_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="accelerationX: 0"
android:id="@+id/accelerationX_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="accelerationY: 0"
android:id="@+id/accelerationY_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="apiAccelerationZ: 0"
android:id="@+id/apiAccelerationZ_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="velocityX: 0"
android:id="@+id/velocityX_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="velocityY: 0"
android:id="@+id/velocityY_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="velocityZ: 0"
android:id="@+id/velocityZ_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="angularVelocityX: 0"
android:id="@+id/angularVelocityX_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="angularVelocityY: 0"
android:id="@+id/angularVelocityY_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="angularVelocityZ: 0"
android:id="@+id/angularVelocityZ_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="yaw: 0"
android:id="@+id/yaw_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="pitch: 0"
android:id="@+id/pitch_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="roll: 0"
android:id="@+id/roll_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="normalizedSuspensionTravelFrontLeft: 0"
android:id="@+id/normalizedSuspensionTravelFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="normalizedSuspensionTravelFrontRight: 0"
android:id="@+id/normalizedSuspensionTravelFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="normalizedSuspensionTravelRearLeft: 0"
android:id="@+id/normalizedSuspensionTravelRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="normalizedSuspensionTravelRearRight: 0"
android:id="@+id/normalizedSuspensionTravelRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipRatioFrontLeft: 0"
android:id="@+id/tireSlipRatioFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipRatioFrontRight: 0"
android:id="@+id/tireSlipRatioFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipRatioRearLeft: 0"
android:id="@+id/tireSlipRatioRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipRatioRearRight: 0"
android:id="@+id/tireSlipRatioRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelRotationSpeedFrontLeft: 0"
android:id="@+id/wheelRotationSpeedFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelRotationSpeedFrontRight: 0"
android:id="@+id/wheelRotationSpeedFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelRotationSpeedRearLeft: 0"
android:id="@+id/wheelRotationSpeedRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelRotationSpeedRearRight: 0"
android:id="@+id/wheelRotationSpeedRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelOnRumbleStripFrontLeft: 0"
android:id="@+id/wheelOnRumbleStripFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelOnRumbleStripFrontRight: 0"
android:id="@+id/wheelOnRumbleStripFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelOnRumbleStripRearLeft: 0"
android:id="@+id/wheelOnRumbleStripRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelOnRumbleStripRearRight: 0"
android:id="@+id/wheelOnRumbleStripRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelInPuddleDepthFrontLeft: 0"
android:id="@+id/wheelInPuddleDepthFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelInPuddleDepthFrontRight: 0"
android:id="@+id/wheelInPuddleDepthFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelInPuddleDepthRearLeft: 0"
android:id="@+id/wheelInPuddleDepthRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="wheelInPuddleDepthRearRight: 0"
android:id="@+id/wheelInPuddleDepthRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="surfaceRumbleFrontLeft: 0"
android:id="@+id/surfaceRumbleFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="surfaceRumbleFrontRight: 0"
android:id="@+id/surfaceRumbleFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="surfaceRumbleRearLeft: 0"
android:id="@+id/surfaceRumbleRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="surfaceRumbleRearRight: 0"
android:id="@+id/surfaceRumbleRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipAngleFrontLeft: 0"
android:id="@+id/tireSlipAngleFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipAngleFrontRight: 0"
android:id="@+id/tireSlipAngleFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipAngleRearLeft: 0"
android:id="@+id/tireSlipAngleRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireSlipAngleRearRight: 0"
android:id="@+id/tireSlipAngleRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireCombinedSlipFrontLeft: 0"
android:id="@+id/tireCombinedSlipFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireCombinedSlipFrontRight: 0"
android:id="@+id/tireCombinedSlipFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireCombinedSlipRearLeft: 0"
android:id="@+id/tireCombinedSlipRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireCombinedSlipRearRight: 0"
android:id="@+id/tireCombinedSlipRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="suspensionTravelMetersFrontLeft: 0"
android:id="@+id/suspensionTravelMetersFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="suspensionTravelMetersFrontRight: 0"
android:id="@+id/suspensionTravelMetersFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="suspensionTravelMetersRearLeft: 0"
android:id="@+id/suspensionTravelMetersRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="suspensionTravelMetersRearRight: 0"
android:id="@+id/suspensionTravelMetersRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="carOrdinal: 0"
android:id="@+id/carOrdinal_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="carClass: 0"
android:id="@+id/carClass_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="carPerformanceIndex: 0"
android:id="@+id/carPerformanceIndex_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="driveTrain: 0"
android:id="@+id/driveTrain_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="numberOfCylinders: 0"
android:id="@+id/numberOfCylinders_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="positionX: 0"
android:id="@+id/positionX_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="positionY: 0"
android:id="@+id/positionY_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="positionZ: 0"
android:id="@+id/positionZ_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="speed: 0"
android:id="@+id/speed_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="power: 0"
android:id="@+id/power_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="torque: 0"
android:id="@+id/torque_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireTempFrontLeft: 0"
android:id="@+id/tireTempFrontLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireTempFrontRight: 0"
android:id="@+id/tireTempFrontRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireTempRearLeft: 0"
android:id="@+id/tireTempRearLeft_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="tireTempRearRight: 0"
android:id="@+id/tireTempRearRight_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="boost: 0"
android:id="@+id/boost_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="fuel: 0"
android:id="@+id/fuel_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="distanceTraveled: 0"
android:id="@+id/distanceTraveled_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="bestLap: 0"
android:id="@+id/bestLap_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="lastLap: 0"
android:id="@+id/lastLap_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="currentLap: 0"
android:id="@+id/currentLap_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="currentRaceTime: 0"
android:id="@+id/currentRaceTime_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="lapNumber: 0"
android:id="@+id/lapNumber_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="racePosition: 0"
android:id="@+id/racePosition_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="accel: 0"
android:id="@+id/accel_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="brake: 0"
android:id="@+id/brake_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="clutch: 0"
android:id="@+id/clutch_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="handbrake: 0"
android:id="@+id/handbrake_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="gear: 0"
android:id="@+id/gear_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="steer: 0"
android:id="@+id/steer_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="normalizedDrivingLine: 0"
android:id="@+id/normalizedDrivingLine_id" />
<TextView android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:padding="5dp"
android:text="normalizedAIBrakeDifference: 0"
android:id="@+id/normalizedAIBrakeDifference_id" />

Process finished with exit code 0
