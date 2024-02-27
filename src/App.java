import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    private static  String senha = "";

    private static void gerarSenha(){
        senha = "";

        for (int i = 0; i <= 8; i++) {
            Random numero = new Random();
            char a = (char) (33 + numero.nextInt(125));
            senha = senha + a;
        }


    }

    private static void looping() {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
           public void run() {
            gerarSenha();

            System.out.println(senha);
           }

        }, 0, 5000);
    }

    public static void main(String[] args) throws Exception {
       looping();
    }
}
