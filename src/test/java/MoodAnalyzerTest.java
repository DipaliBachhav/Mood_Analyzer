import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenSadMessage_whenProper_shouldReturnSad()
    {
        MoodAnalyzerMain analyzerMain = new MoodAnalyzerMain("I Am In Sad Mood");
        String mood=analyzerMain.moodAnalyzer();
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenHappyMessage_whenProper_shouldReturnHappy()
    {
        MoodAnalyzerMain analyzerMain = new MoodAnalyzerMain("I Am In Happy  Mood");
        String mood=analyzerMain.moodAnalyzer();
        Assert.assertEquals("HAPPY",mood);
    }

}
