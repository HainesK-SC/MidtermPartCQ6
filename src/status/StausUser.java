/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 * @author Kyle Haines 991501735
 */
public class StausUser 
{
    public enum StatusCodes {
        ZERO,
        ONE,
        TWO,
        THREE
    }
   public void statusDetail(StatusCodes code)
{
switch(code)
        {
        case ZERO:
            System.out.println("REJECTED");
            break;
        case ONE:
            System.out.println("PENDING");
            break;
        case TWO:
            System.out.println("PROCESSING");
            break;
        case THREE: 
            System.out.println("APPROVED");
            break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
