import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void givenSadMessage_whenProper_shouldReturnSad() throws MoodAnalyzeException {
        MoodAnalyzerMain analyzerMain = new MoodAnalyzerMain("I Am In Sad Mood");
        String mood=analyzerMain.moodAnalyzer();
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenHappyMessage_whenProper_shouldReturnHappy() throws MoodAnalyzeException {
        MoodAnalyzerMain analyzerMain = new MoodAnalyzerMain("I Am In Happy  Mood");
        String mood=analyzerMain.moodAnalyzer();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_shouldReturnHappy() throws MoodAnalyzeException {
        MoodAnalyzerMain analyzerMain = new MoodAnalyzerMain(null);
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalyzeException.class);
            expectedException.expectMessage("There Is No Mood");
            String mood = analyzerMain.moodAnalyzer();
            Assert.assertEquals("HAPPY", mood);
        }
        catch(MoodAnalyzeException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMood_whenNull_shouldReturnCustomMessage()
    {
        MoodAnalyzerMain mood = new MoodAnalyzerMain();
        try
        {
            mood.moodAnalyzer();
        }
        catch (MoodAnalyzeException e)
        {
            Assert.assertEquals(MoodAnalyzeException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenMood_whenEmpty_shouldThrowException()
    {
        MoodAnalyzerMain mood = new MoodAnalyzerMain("");
        try
        {
            mood.moodAnalyzer();
        }
        catch (MoodAnalyzeException e)
        {
            Assert.assertEquals(MoodAnalyzeException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }


}
