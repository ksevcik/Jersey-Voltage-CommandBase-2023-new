// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class ArmAdjustPosition extends CommandBase {
  /** Creates a new MidCube. */
  private double m_position;
  public ArmAdjustPosition(double position) {
    addRequirements(Arm.getInstance());
    m_position = position;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {   
    Arm.getInstance().gotoPosition(m_position, false);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Arm.getInstance().gotoPosition(m_position, false);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }}
