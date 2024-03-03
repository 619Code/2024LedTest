package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ledSubsystem;


public class ledCommand extends Command {
    private ledSubsystem subsystem;

    public ledCommand(ledSubsystem subsystem) {
        this.subsystem = subsystem;
        
        System.out.println("This was called");


        addRequirements(subsystem);

    }

    @Override 
    public void initialize(){
        subsystem.setColor(255,255,255, 255, 0, 116);
        //subsystem.StartAnimation();
    }
    
    @Override 
    public boolean isFinished(){
        return false;
    }

    @Override
    public void end(boolean interrupted){
        subsystem.StopAnimation();
        subsystem.TurnOffLEDs();
    }
}
