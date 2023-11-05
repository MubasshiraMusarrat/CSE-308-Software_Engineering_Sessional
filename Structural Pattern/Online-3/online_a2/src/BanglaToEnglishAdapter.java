public class BanglaToEnglishAdapter implements ScriptGenerator{
    BanglaSpeech banglaSpeech;
    String translation;

    public BanglaToEnglishAdapter( BanglaSpeech banglaSpeech){
        this.banglaSpeech = banglaSpeech;
    }

    @Override
    public void audioFile(String s) {
        translation = "";
        String st = s.substring(1,s.length()-1);
        String[] tokens = st.split(" ");
        for(String var : tokens){
            if(var.equalsIgnoreCase("Ami")){
                translation += "I ";
            }
            else if(var.equalsIgnoreCase("Amra")){
                translation += "We ";
            }
            else if(var.equalsIgnoreCase("Bhat")){
                translation += "Rice ";
            }
            else if(var.equalsIgnoreCase("Roti")){
                translation += "Bread ";
            }
            else if(var.equalsIgnoreCase("Khai")){
                translation += "Eat ";
            }
            else if(var.equalsIgnoreCase("Banai")){
                translation += "Prepare ";
            }
            else {
                translation += var+" ";
            }
        }
    }

    @Override
    public String textFile() {
        return translation;
    }
}
