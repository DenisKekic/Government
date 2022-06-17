import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TestDriver {
    public static void main(String[] args) {
        Government government = new Government();
        String s = "Das kann nicht sein!!!";
        System.out.println(government.calmSpeech(s));

        List<String> list = new ArrayList<>();
        list.add("SPÖ");
        list.add("ÖVP");
        list.add("Pilz");

        List<String> list2 = new ArrayList<>();
        list2 = government.calmAttendees(list);

        System.out.println(list2);

        if(government.getSupportFromGov(300000)){
            System.out.println("Es ist corrupt");
        }
        else{
            System.out.println("Es ist noncorrupt");
        }

    }
}
