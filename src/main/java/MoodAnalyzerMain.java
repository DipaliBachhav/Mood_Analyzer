public class MoodAnalyzerMain {

     String message;

    //Default Constructor
    public MoodAnalyzerMain() {
    }

    //Parameterized Constructor With String Parameter
    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    public String moodAnalyzer() throws MoodAnalyzeException {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
            return "HAPPY";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalyzeException("Please Enter Proper Message");
        }
    }
}
