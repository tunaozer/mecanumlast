// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ClimbSub. */
  CANSparkMax intake;

  public IntakeSubsystem() {
    intake = new CANSparkMax(Constants.ClimbConstants.climbUstPort, MotorType.kBrushless);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intakeActive(){
    intake.set(1);
    
  }
  public void intakeDisable(){
    intake.set(-0.5);
    
  }
  public void intakeStop(){
    intake.set(0);
  }
}

