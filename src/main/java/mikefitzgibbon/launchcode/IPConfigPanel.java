package mikefitzgibbon.launchcode;

public class IPConfigPanel extends Panel{
    public IPConfigPanel(){
        add(new IPConfig().getPane());
    }
}
