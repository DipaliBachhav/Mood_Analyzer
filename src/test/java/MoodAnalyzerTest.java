import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenSadMessage_whenProper_shouldReturnSad()
    {
        MoodAnalyzerMain analyzerMain = new MoodAnalyzerMain();
        String mood=analyzerMain.moodAnalyzer("I Am In Sad Mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenHappyMessage_whenProper_shouldReturnHappy()
    {
        MoodAnalyzerMain analyzerMain = new MoodAnalyzerMain();
        String mood=analyzerMain.moodAnalyzer("I Am In Any Mood");
        Assert.assertEquals("HAPPY",mood);
    }

}
