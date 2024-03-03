package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LedSubsystem;


public class LedCommand extends Command {
    private LedSubsystem subsystem;

    public LedCommand(LedSubsystem subsystem) {
        this.subsystem = subsystem;

        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        subsystem.setColor(100, 255, 70);
    }
    

}
