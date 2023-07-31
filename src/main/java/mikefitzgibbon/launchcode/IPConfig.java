package mikefitzgibbon.launchcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPConfig extends TextArea{
    @SuppressWarnings("CallToPrintStackTrace")
    public IPConfig(){
        super(10,40);
        setEditable(false);
        
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("cd C:\\");
        processBuilder.command("ipconfig");
        
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
                setText(output.toString());
            } else {
                System.out.println("Problem getting IP config from console.");
            }
        }
        catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
