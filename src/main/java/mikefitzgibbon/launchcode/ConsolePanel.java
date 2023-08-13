package mikefitzgibbon.launchcode;

public class ConsolePanel extends Panel{
    public ConsolePanel(){
        ConsoleField field = new ConsoleField();
        ConsoleDisplay display = new ConsoleDisplay();
        
        add(field);
        add(display.getPane());
        add(new ConsoleRun(field,display));
    }
}
