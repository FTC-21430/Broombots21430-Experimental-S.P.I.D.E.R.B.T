package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.robotcore.external.navigation.CurrentUnit;

@TeleOp
public class Testing extends LinearOpMode {

    private DcMotorEx motor = null;
    @Override
    public void runOpMode() throws InterruptedException {
        motor = hardwareMap.get(DcMotorEx.class, "motor");

        waitForStart();
        while (opModeIsActive()){
            motor.setPower(0.1);
            telemetry.addData("current", motor.getCurrent(CurrentUnit.AMPS));
            telemetry.update();

        }
    }
}
