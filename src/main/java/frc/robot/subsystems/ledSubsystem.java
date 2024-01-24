package frc.robot.subsystems;

import com.ctre.phoenix.led.CANdle;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ledSubsystem extends SubsystemBase {
    
    private CANdle led;

    public ledSubsystem(CANdle led) {
        this.led = led;
    }

    public void setColor(int r, int g, int b) {
        led.setLEDs(r, g, b);
    }

    @Override
    public void periodic() {
        setColor(255, 255, 255);
    }

}