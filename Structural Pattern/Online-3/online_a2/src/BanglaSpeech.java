public class BanglaSpeech {
    String bangla;
    public void audioFile(String s){
        bangla = "\"";
        String st = s.substring(1,s.length()-1);
        String[] tokens = st.split(" ");
        bangla +=tokens[0] + " ";
        bangla += tokens[tokens.length-1] + " ";
        for (int i =1; i< tokens.length-1; i++){
            bangla += tokens[i];
        }
        bangla += "\"";
    }

    public String getAudio(){
        return bangla;
    }
}
