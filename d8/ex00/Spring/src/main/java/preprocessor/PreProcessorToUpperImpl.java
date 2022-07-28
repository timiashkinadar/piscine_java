package preprocessor;

import java.util.Locale;

public class PreProcessorToUpperImpl implements PreProcessor{

    @Override
    public String preProcessor(String s) {
        return s.toUpperCase();
    }
}
