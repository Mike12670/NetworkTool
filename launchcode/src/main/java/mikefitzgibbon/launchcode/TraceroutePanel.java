package mikefitzgibbon.launchcode;

import javax.swing.JLabel;

public class TraceroutePanel extends Panel{
    public TraceroutePanel(){
        TracerouteBody body = new TracerouteBody();
        TracerouteAddress addr = new TracerouteAddress();
        add(new JLabel("IP address: "));
        add(addr);
        add(body.getPane());
        add(new TracerouteRun(addr, body));
    }
}
