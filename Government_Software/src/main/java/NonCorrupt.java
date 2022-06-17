public class NonCorrupt implements Politician{
    double x = Math.random()*1000;
    double cz = 150000 + x;

    @Override
    public boolean getSupportFromPolitician(double money) {
        if(money >= cz){
            return true;
        }
        return false;
    }
}
