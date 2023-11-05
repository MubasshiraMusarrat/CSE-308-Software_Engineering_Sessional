import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnglishSpeechToTextEngine engine = new EnglishSpeechToTextEngine();
        BanglaSpeech banglaSpeech = new BanglaSpeech();
        ScriptGenerator adapter = new BanglaToEnglishAdapter(banglaSpeech);
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter quote: ");
            String s = sc.nextLine();
            banglaSpeech.audioFile(s);
            adapter.audioFile(banglaSpeech.getAudio());
            System.out.println(adapter.textFile());
        }
    }
}
