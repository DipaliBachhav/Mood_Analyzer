
    public class MoodAnalyzeException extends Exception {
        enum ExceptionType {
            ENTERED_NULL, ENTERED_EMPTY;
        }

        ExceptionType type;

        public MoodAnalyzeException(ExceptionType type, String message) {
            super(message);
            this.type = type;

        }
    }


