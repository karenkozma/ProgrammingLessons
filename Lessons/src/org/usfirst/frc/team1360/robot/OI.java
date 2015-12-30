package org.usfirst.frc.team1360.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team1360.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * TEST KKozma
 */
public class OI 
{
    Joystick drive = new Joystick(0);
    double drive_LeftStickX = drive.getRawAxis(0);
}

