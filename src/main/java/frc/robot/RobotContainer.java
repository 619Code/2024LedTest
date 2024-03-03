// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.ledCommand;
import frc.robot.subsystems.ledSubsystem;

public class RobotContainer {
  //private ledSubsystem subsystem;
  private ledSubsystem subsystem;

  public RobotContainer() {
    subsystem = new ledSubsystem();
    //controller = new XboxController(0);

    //subsystem.setDefualtCommand(new Limelight());
    subsystem.setDefaultCommand(new ledCommand(subsystem));
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
