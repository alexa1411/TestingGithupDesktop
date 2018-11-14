/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4645.robot.subsystems;

import org.usfirst.frc.team4645.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Motor extends Subsystem 
{
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	/*basicMotorPort is the port number on the robot/testbench that the motor is plugged into.
	 * This is usually placed in the RobotMap.java file to keep track of all ports being used
	 */
	public static int basicMotorPort = 1;
	private Talon basicMotor = new Talon(basicMotorPort);

	public void initDefaultCommand() 
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	/*"moveForward" is a method. Method are named using camel case (first word lower case, 
	 * all others upper case). "Public" means that I can retrieve this method in another file. 
	 * "Void" means this method doesn't return anything. These are java terms you can google. 
	 */
    public void moveForward()
    {
    	/*1 is the highest motor speed. Never set it to 1 or -1 while your code is in the 
    	testing stage*/
    	basicMotor.set(1);
    }
    
    public void moveBackward()
    {
    	//-1 is the highest motor speed in reverse
    	basicMotor.set(-1); 
    }
 
    public void stop()
    {
    	basicMotor.set(0); 
    }
    
    
}
