package MoneyExchangeMK;

import java.io.*;

public class MenuvacnicaFilter {

        public static <String> void main(String[] args) {
            String path = "C:/Users/Media/Desktop/Domasna1/data.csv";
            String line = "";
            try(FileWriter writer = new FileWriter("C:/Users/Media/Desktop/Domasna1/final_data1.csv");
                BufferedWriter bw = new BufferedWriter(writer))
            {
                BufferedReader br = new BufferedReader(new FileReader(path));

                while ((line = br.readLine()) != null){
                    String[] values = line.split(",");

                    bw.append(values[0] + "\n" + values[1]);
                    System.out.println(values[0] + values[1]);

                }
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }


