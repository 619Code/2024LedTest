// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.led.CANdle;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.ledCommand;
import frc.robot.subsystems.ledSubsystem;

public class RobotContainer {
  private ledSubsystem subsystem;
  private XboxController controller;

  public RobotContainer() {
    subsystem = new ledSubsystem();
    controller = new XboxController(0);
    subsystem.setDefaultCommand(new ledCommand(subsystem, controller));
    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
