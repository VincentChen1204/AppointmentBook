import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        for(int i = 50; i < 60; i++) schedule[1][i] = true;
        a.printPeriod(2);
//        System.out.println(a.findFreeBlock(2, 15));
//        System.out.println(a.findFreeBlock(2, 9));
//        System.out.println(a.findFreeBlock(2, 20));
        schedule = new boolean[8][60];
        for(int i = 25; i < 30; i++) schedule[1][i] = true;
        for(int i = 0; i < 15; i++) schedule[2][i] = true;
        for(int i = 41; i < 60; i++) schedule[2][i] = true;
        for(int i = 5; i < 30; i++) schedule[3][i] = true;
        for(int i = 44; i < 60; i++) schedule[3][i] = true;
        AppointmentBook b = new AppointmentBook(schedule);

        System.out.println(b.makeAppointment(2, 4, 22));
        //int period = 2;
//        while(period < 5) {
//            System.out.println("Period: " + period);
//            b.printPeriod(period);
//            period++;
//        }
//        for(int i = 0; i < 24; i++) schedule[2][i] = false;
//        for(int i = 25; i < 29; i++) schedule[2][i] = true;
//        for(int i = 30; i < 59; i++) schedule[2][i] = false;
//        for(int i = 0; i < 14; i++) schedule[3][i] = true;
//        for(int i = 15; i < 40; i++) schedule[3][i] = false;
//        for(int i = 41; i < 59; i++) schedule[3][i] = true;
//        for(int i = 0; i < 4; i++) schedule[4][i] = false;
//        for(int i = 5; i < 29; i++) schedule[4][i] = true;
//        for(int i = 30; i < 43; i++) schedule[4][i] = false;
//        for(int i = 44; i < 59; i++) schedule[4][i] = true;
//        a.printPeriod(3);
//        for(int i = 0; i < 24; i++) schedule[2][i] = false;
//        for(int i = 25; i < 29; i++) schedule[2][i] = true;
//        for(int i = 30; i < 59; i++) schedule[2][i] = false;
//        for(int i = 0; i < 2; i++) schedule[3][i] = false;
//        for(int i = 3; i < 14; i++) schedule[3][i] = true;
//        for(int i = 15; i < 40; i++) schedule[3][i] = false;
//        for(int i = 41; i < 59; i++) schedule[3][i] = true;
//        for(int i = 0; i < 26; i++) schedule[3][i] = false;
//        for(int i = 27; i < 29; i++) schedule[3][i] = true;
//        for(int i = 30; i < 43; i++) schedule[3][i] = false;
//        for(int i = 44; i < 59; i++) schedule[3][i] = true;
//        a.printPeriod(4);
    }
}
