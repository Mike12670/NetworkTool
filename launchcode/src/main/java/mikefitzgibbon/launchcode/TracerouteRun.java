package mikefitzgibbon.launchcode;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static mikefitzgibbon.launchcode.Frame.frame;

public class TracerouteRun extends Button{
    TracerouteBody body;
    TracerouteAddress addr;
    
    public TracerouteRun(TracerouteAddress addr, TracerouteBody body) {
        super("Run");
        this.body = body;
        this.addr = addr;
    }

    @Override
    public void buttonAction() {
        try{
            System.out.println("A");
            Process traceRt = Runtime.getRuntime().exec("tracert " + addr.getText());
            Scanner s = new Scanner(traceRt.getInputStream()).useDelimiter("\\A");
            String result = "";
            System.out.println("B");
            while(s.hasNext()){
            System.out.println("C");
                result += s.next();
            }
            System.out.println("D");
            body.setText(result);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(frame, "Invalid IP address.");
        }
    }

}
