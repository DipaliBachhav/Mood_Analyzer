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
            if(message.length() == 0)
                throw new MoodAnalyzeException(MoodAnalyzeException.ExceptionType.ENTERED_EMPTY,"Please Enter Proper Message");

            else if (message.contains("Sad")) {
                return "SAD";
            }
            return "HAPPY";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalyzeException(MoodAnalyzeException.ExceptionType.ENTERED_NULL,"Null Message");

        }
    }
}
