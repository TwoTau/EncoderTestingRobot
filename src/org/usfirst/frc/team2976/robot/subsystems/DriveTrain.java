package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void runMotor(double power) {
		putDataOnDashboard();
	}
	
	public void putDataOnDashboard() {
		int count = Robot.enc.get();
		double rawDistance = Robot.enc.getRaw();
		double distance = Robot.enc.getDistance();
		double rate = Robot.enc.getRate();
		boolean direction = Robot.enc.getDirection();
		boolean stopped = Robot.enc.getStopped();
		
		SmartDashboard.putNumber("enc-count", count);
		SmartDashboard.putNumber("enc-rawDistance", rawDistance);
		SmartDashboard.putNumber("enc-distance", distance);
		SmartDashboard.putNumber("enc-rate", rate);
		SmartDashboard.putBoolean("enc-direction", direction);
		SmartDashboard.putBoolean("enc-stopped", stopped);
		
		SmartDashboard.putNumber("test", Math.random());
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

