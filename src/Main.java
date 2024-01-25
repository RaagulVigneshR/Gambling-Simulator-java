import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Gambler g1 = new Gambler();

        Main m = new Main();
        m.gamble(g1);
        if (m.gamble(g1) == 1){
            System.out.println("THE GAMBLE IS SUCCESSFULL");
            g1.amtwon= g1.amtwon+1;
        }
        else{
            System.out.println("The gamble is Unsucessfull");
        }
        System.out.println("The total amount won is :"+g1.amtwon);

    }
    public int gamble(Gambler g){
        int stakein;
        Random r1 = new Random();
        stakein=1;
        g.stake=g.stake-1;
        return r1.nextInt(2);
    }
}