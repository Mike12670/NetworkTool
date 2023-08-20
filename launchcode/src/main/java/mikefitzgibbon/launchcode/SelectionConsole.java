package mikefitzgibbon.launchcode;

import static mikefitzgibbon.launchcode.Frame.frame;

public class SelectionConsole extends Button{
    public SelectionConsole(){
        super("Console");
    }
    
    @Override
    public void buttonAction(){
        frame.setPanel(new ConsolePanel());
        frame.setVisible(true);
    }
}
