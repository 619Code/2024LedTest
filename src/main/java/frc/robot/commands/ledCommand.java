package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ledSubsystem;


public class ledCommand extends Command {
    private ledSubsystem subsystem;
    private boolean funny_mode = false;

    public ledCommand(ledSubsystem subsystem) {
        this.subsystem = subsystem;
        
        System.out.println("This was called");


        addRequirements(subsystem);

    }

    @Override 
    public void initialize(){
      //  subsystem.setColor(0, 255, 0, 0, 20, 20);
    //    subsystem.setColor(255, 0, 0, 0, 0, 20);
     //   subsystem.setColor(0, 0, 255);


        //subsystem.StartAnimation();
    }

    private int pos = 0;

    @Override
    public void execute(){


        // subsystem.setColor(0, 0, 127, 0, 0, 400);

        // subsystem.setColor(127, 0, 0, 0, pos, 10);
        // pos += 1;
        // if(pos > 400) {pos = 0;}

        // if(funny_mode){
        //     for(int i = 0; i < 400; i++){
        //         subsystem.setColor((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255), 0, i, 1);
        //     }
        // }
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
