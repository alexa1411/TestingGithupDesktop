/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4645.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4645.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class MoveForward extends Command {
	public MoveForward() {
		// Use requires() here to declare subsystem dependencies
		//motorSubsystem is what we named the subsystem in the Robot.java file
		requires(Robot.motorSubsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		//notice the syntax here when I call the moveForward method from our Motor.java file
		Robot.motorSubsystem.moveForward();
	}

	// Make this return true when this Command no longer needs to run execute()
	/*this command will stop executing when visFinished returns true. Since it is always returning 
	 * false here, it will always execute
	*/
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
