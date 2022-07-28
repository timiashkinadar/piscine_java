import preprocessor.PreProcessor;
import preprocessor.PreProcessorToUpperImpl;
import printer.PrinterWithPrefixImpl;
import renderer.Renderer;
import renderer.RendererErrImpl;

public class Program {
    public static void main(String[] args) {
        PreProcessor preProcessor = new PreProcessorToUpperImpl();
        Renderer renderer = new RendererErrImpl(preProcessor);
        PrinterWithPrefixImpl printer = new PrinterWithPrefixImpl(renderer);
        printer.setPrefix("Prefix");
        printer.print("Hello!");
    }
}
