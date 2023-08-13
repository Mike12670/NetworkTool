package mikefitzgibbon.launchcode;

public class ConsoleDisplay extends TextArea{
    @SuppressWarnings("CallToPrintStackTrace")
    public ConsoleDisplay(){
        super(10,40);
        setEditable(false);
    }
}
