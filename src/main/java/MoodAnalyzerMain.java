public class MoodAnalyzerMain {

    public String moodAnalyzer(String message) {
        if(message.contains("Sad"))
        {
            return "SAD";
        }
            return "HAPPY";
    }
}
