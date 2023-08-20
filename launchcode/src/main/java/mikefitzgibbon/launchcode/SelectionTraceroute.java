package mikefitzgibbon.launchcode;

import static mikefitzgibbon.launchcode.Frame.frame;

public class SelectionTraceroute extends Button{
    public SelectionTraceroute(){
        super("Traceroute");
    }
    
    @Override
    public void buttonAction(){
        TraceroutePanel panel = new TraceroutePanel();
        frame.setPanel(panel);
        frame.setVisible(true);
    }
}
