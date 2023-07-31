package mikefitzgibbon.launchcode;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import static mikefitzgibbon.launchcode.Frame.frame;

public class PingerRun extends Button{
    PingerInput in;
    PingerOutput out;
    public PingerRun(PingerInput pi, PingerOutput po){
        super("Run");
        in = pi;
        out = po;
    }

    @Override
    public void buttonAction() {
        try{
            InetAddress ia = InetAddress.getByName(in.getText());
            out.setText(out.getText() + "\n" + (ia.isReachable(5000) ? "Host is reachable at " + in.getText() : "Host is NOT reachable at " + in.getText()));
        }
        catch(UnknownHostException e){
            JOptionPane.showMessageDialog(frame, "Add a known address.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
