public class ExceptionDemo3 {
    public static void main(String[] args) {
        LowAttendanceException l=new LowAttendanceException("check my attendance");
        try{
            l.checkAttendance(50);
        }
        catch(LowAttendanceException ready to pay fine");

        }
        
    }
}
class LowAttendanceException extends RuntimeException
{
    public LowAttendanceException(String msg)
    {
        System.out.println(msg);
    }
    public void checkAttendance(int percentage)
    {
        if(percentage>60)
        {
            System.out.println("allow for exam");
        }
        else{
            try{
                //exception possible area
                //anonymous object
                throw new LowAttendanceException("Cat attendance is low");
                
            }
        }

    }
}
