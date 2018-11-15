package frc.robot.util;

/**
 * Enum Class to deal with any problems that could happen to a motor. <p>
 * NONE = no problems with the Motor <p>
 * MOTOR_INTERNALLY_FLIPPED = when the motor is given a positive value it spins counter clockwise <p>
 * MOTOR_CONTROLLER_FLIPPED = when the motor contoller is wired backwards
 */
public enum MotorFix {
    NONE,
    MOTOR_INTERNALLY_FLIPPED,
    MOTOR_CONTROLLER_FLIPPED

}