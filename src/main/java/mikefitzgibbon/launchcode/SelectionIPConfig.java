package mikefitzgibbon.launchcode;

import static mikefitzgibbon.launchcode.Frame.frame;

public class SelectionIPConfig extends Button{
    public SelectionIPConfig(){
        super("IPConfig");
    }
    
    @Override
    public void buttonAction(){
        frame.setPanel(new IPConfigPanel());
        frame.setVisible(true);
    }
}
