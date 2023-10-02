import java.util.*;
public class switch_demo {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        switch(number) {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("wedenesday");
            break;
            case 4:System.out.println("thursday");
            break;
            case 5:System.out.println("friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            default:
                System.out.println("Invalid");
        }
}
}
