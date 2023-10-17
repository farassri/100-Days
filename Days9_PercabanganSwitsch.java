
package days9_percabanganswitch;


public class Days9_PercabanganSwitch {


    public static void main(String[] args) {
        int day = 9;
        String dayName;

        switch (day) {
            case 1:
                dayName = "senin";
                break;
            case 2:
                dayName = "selasa";
                break;
            case 3:
                dayName = "rabu";
                break;
            case 4:
                dayName = "kamis";
                break;
            case 5:
                dayName = "jumat";
                break;
            case 6:
                dayName = "sabtu";
                break;
            case 7:
                dayName = "ahad";
                break;
            default:
                dayName = "tidak di baca oleh program";
        }

        System.out.println("Hari ini adalah :" + dayName); 
    }
}
