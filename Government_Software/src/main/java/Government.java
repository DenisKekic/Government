import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleToIntFunction;

public class Government{

    List<Politician> list = new ArrayList();

    public Government(){
        list.add(new Corrupt());
        list.add(new Corrupt());
        list.add(new Corrupt());
        list.add(new Corrupt());
        list.add(new Corrupt());
        list.add(new NonCorrupt());
        list.add(new NonCorrupt());
        list.add(new NonCorrupt());
        list.add(new NonCorrupt());
        list.add(new NonCorrupt());
        list.add(new NonCorrupt());
    }

    public String calmSpeech(String eingabe){
        if(eingabe != null){
            char[] array = eingabe.toCharArray();
            for(int i = 0; i<eingabe.length(); i++){
                if(array[i] == '!'){
                    array[i] = '.';
                }
            }
            String s = new String( array);
            return s;
        }
        return null;
    }

    public List<String> calmAttendees(List list){
        if(list.contains("ÖVP")&&list.contains("SPÖ")){
            double x = Math.random();
            int y = (int) Math.round(x);
            if(y == 0){
                list.remove("ÖVP");

            }
            else if(y==1){
                list.remove("SPÖ");
            }

            if(list.contains("Pilz")){
                list.remove("Pilz");
            }

            if (list.contains("NEOS") && !list.contains("ÖVP")) {
                list.remove("FPÖ");
            }

            if (list.contains("Grüne")){
                list.remove("ÖVP");
                list.remove("SPÖ");
            }

            if(list.contains(null)){
                return null;
            }
        }
        return list;
    }

    public boolean getSupportFromGov(double money){
        //list.iter
        boolean temp = true;
        int x = 0;
        for (Politician politician : list) {
            if(politician.getSupportFromPolitician(money)){
                x++;
                if(x == list.size()){
                    return true;
                }
            }

        }
        return false;
    }
}
