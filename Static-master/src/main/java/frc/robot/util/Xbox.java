package frc.robot.util;

import edu.wpi.first.wpilibj.XboxController;

public class Xbox extends XboxController {

    public Xbox(int port) {
        super(port);
    }

    public double getLeftYAxis() {
        return getRawAxis(0); // TODO: find out these values
    }
    public double getRightYAxis() {
        return getRawAxis(0); // TODO: find out these values
    }
    public double getLeftXAxis() {
        return getRawAxis(0); // TODO: find out these values
     }
    public double getRightXAxis() {
        return getRawAxis(0); // TODO: find out these values
     }

    public double getLeftTrigger() {
        return getRawAxis(0); // TODO: find out these values
    } 
    public double getRightTrigger() {
        return getRawAxis(0); // TODO: find out these values
    }

    public boolean getAButton() {
        return getRawButton(0); // TODO: find out these values
    }
    public boolean getBButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getXButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getYButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getLeftBumperButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getRightBumperButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getStartButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getBackButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getLeftStickButton() {
        return getRawButton(0); // TODO: find out these values
     }
    public boolean getRightStickButton() {
        return getRawButton(0); // TODO: find out these values
     }

    /**
     * vibrates the controller
     * 
     * @param time = seconds to vibrate the controller
     * @param enable = to enable the controller 
     */
    public void vibrate(double time, boolean enable) {
        if (enable) {
            setRumble(RumbleType.kLeftRumble, 1);
            setRumble(RumbleType.kRightRumble, 1);
        } else {
            setRumble(RumbleType.kLeftRumble, 0);
            setRumble(RumbleType.kRightRumble, 0);
        }
    }
}


