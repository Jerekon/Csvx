import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;
import java.util.Collections;

public class ClientLog {
    private String[] log new String[];
    public void log(int productNum, int amount) {

    }
    public <txtFile> void log(int productNum, int amount) {
        log += String.format (format:"%d,%d%n, productNum, amount);

public void exportAsCSV(File txtFile) {
            if (!txtFile.exists))) {
    log = "production,amount/n" + log;
            }
        }
        try (FileWriter writer new FileWriter(txtFile, append:true)) {
            writer.write(log);
        }
        try (CSVWriter writer = new CSVWriter (new FileWriter (file, true))) {
            writer.writeAll (Collections.singletonList (log));
        }

    }
}
