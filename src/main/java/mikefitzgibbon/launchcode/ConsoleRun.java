package mikefitzgibbon.launchcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRun extends Button{
    ConsoleField consoleField;
    ConsoleDisplay display;
    
    public ConsoleRun(ConsoleField cf, ConsoleDisplay cd) {
        super("Run");
        consoleField = cf;
        display = cd;
        
    }

    @Override
    public void buttonAction() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(consoleField.getText());
        
        try{
            Process process = processBuilder.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                display.setText(output.toString());
            } else {
                System.out.println("Problem getting commands from console.");
            }
        }
        catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }

}
