public class EnglishSpeechToTextEngine implements ScriptGenerator{
    private String speech;
    @Override
    public void audioFile(String s) {
        speech = s.substring(1,s.length()-1);
    }

    @Override
    public String textFile() {
        return speech;
    }
}
