package beginnersprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ImportCsvFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String csvFile = "D:/Eclipse_Workspaces/Java_Programs/Java_Programs/src/beginnersprogram/importcablemodem.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        HashMap<String,String> map = new HashMap<String, String>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] device = line.split(cvsSplitBy);
                for(int i=0;i<device.length;i++){
                map.put(device[0], device[1]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
