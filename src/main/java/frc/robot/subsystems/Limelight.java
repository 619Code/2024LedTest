
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.helpers.Crashboard;
import frc.robot.helpers.LimelightHelpers;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Limelight extends SubsystemBase{

    //NetworkTableInstance pipeline;

    public Limelight(){

    }

    public void getEntry(){ //throws InterruptedException{
        NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
        NetworkTableEntry tx = table.getEntry("tx");
        NetworkTableEntry ty = table.getEntry("ty");
        NetworkTableEntry ta = table.getEntry("ta");
        double id = LimelightHelpers.getFiducialID("");

        
        //System.out.println();
        //System.out.println(LimelightHelpers.getTX(""));
        //System.out.println( LimelightHelpers.getTY(""));
        //System.out.println( LimelightHelpers.getTA(""));
        System.out.println(LimelightHelpers.getBotPose_TargetSpace("")[0]);
        //System.out.println(id);


        Crashboard.toDashboard("tx", tx.getDouble(0.0), "Limelight");
        Crashboard.toDashboard("ty", ty.getDouble(0.0), "Limelight");
        Crashboard.toDashboard("ta", ta.getDouble(0.0), "Limelight");
        Crashboard.toDashboard("Pose", LimelightHelpers.getBotPose_TargetSpace("")[0], "Limelight");

        //Thread.sleep(50000);
    }

    public void periodic() {
       // try {
            getEntry();
       /*  } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }

    
}
