
package org.usfirst.frc.team1360.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem
{
    
    Jaguar left = new Jaguar(RobotMap.DRIVE_LEFT);
    Jaguar left2 = new Jaguar(RobotMap.DRIVE_LEFT)
    Jaguar right = new Jaguar(RobotMap.DRIVE_LEFT)
	Jaguar right2 = new Jaguar(RobotMap.DRIVE_LEFT);

    public void initDefaultCommand()
    {
    }

    public boolean drive(float left, float right)
    {
    	this.left.set(-left)
    	left2.set(-left)
    	right.set(right);
    	right2.set(right);
    }
}

