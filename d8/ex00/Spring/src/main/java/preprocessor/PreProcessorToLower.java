package preprocessor;

import java.util.Locale;

public class PreProcessorToLower implements PreProcessor{

    @Override
    public String preProcessor(String s) {
        return s.toLowerCase();
    }
}
