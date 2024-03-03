package frc.robot.subsystems;

import com.ctre.phoenix.led.Animation;
import com.ctre.phoenix.led.CANdle;
import com.ctre.phoenix.led.CANdle.LEDStripType;
import com.ctre.phoenix.led.CANdle.VBatOutputMode;
import com.ctre.phoenix.led.CANdleConfiguration;
import com.ctre.phoenix.led.CANdleConfiguration;
import com.ctre.phoenix.led.ColorFlowAnimation;
import com.ctre.phoenix.led.ColorFlowAnimation.Direction;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class LedSubsystem extends SubsystemBase {
    
    private CANdle candle;
//    private final int ledCount = 8;
//    private Animation currentAnimation = null;




  public LedSubsystem() {
        this.candle = new CANdle(Constants.CANdleid);
   //     currentAnimation = new ColorFlowAnimation(0, 0, 255, 0, 0.7, ledCount, Direction.Forward);
   

        CANdleConfiguration configAll = new CANdleConfiguration();
        configAll.statusLedOffWhenActive = true;
        configAll.disableWhenLOS = false;
        configAll.stripType = LEDStripType.GRB;
        configAll.brightnessScalar = 0.1;
        configAll.vBatOutputMode = VBatOutputMode.Modulated;
        this.candle.configAllSettings(configAll, 100);
        
    }

    public void setColor(int r, int g, int b) {
        candle.setLEDs(r, g, b);
    }

    public void setColor(int r, int g, int b, int w, int startlid, int count) {
        candle.setLEDs(r, g, b, w, startlid, count);
        
    }


    @Override
    public void periodic() {
   //     setColor(255, 255, 255);

  //      candle.animate(currentAnimation);
    }

}