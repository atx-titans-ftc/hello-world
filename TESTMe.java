package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;

@TeleOp
public class TESTMe extends LinearOpMode {
    private Gyroscope imu;
    private DcMotor motor0;
    private DcMotor motor3;
    private DigitalChannel digitalTouch;
    private DistanceSensor sensorColorRange;
    private Servo servo0;

    private ServoController controlHub_ServoController;

    @Override
    public void runOpMode() {
        DcMotor motor0 = hardwareMap.get(DcMotor.class, "motor0");
        motor0.setPower(1);
        motor0 =

        motor0 = hardwareMap.get(DcMotor.class, "motor0");
        motor3 = hardwareMap.get(DcMotor.class, "motor3");
        servo0 = hardwareMap.get(Servo.class, "servo0");


        //telemetry if the code is initialized
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        controlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");

        controlHub_ServoController.pwmEnable();

        // run until the end of the match (driver presses STOP)

        while (opModeIsActive()) {
            telemetry.addData("Status", "Running");
            telemetry.update();
            if(gamepad1.x) {
                motor0.setPower(1);
            }
            if(gamepad1.y) {
                motor0.setPower(0);
            }
            motor0.setPower(gamepad1.left_stick_y * -1);
            motor3.setPower(gamepad1.right_stick_y);
        }
    }
}
