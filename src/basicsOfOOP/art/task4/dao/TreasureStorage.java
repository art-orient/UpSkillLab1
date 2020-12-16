package basicsOfOOP.art.task4.dao;

import basicsOfOOP.art.task4.bean.Treasure;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TreasureStorage {
    private final String dir = System.getProperty("user.dir");
    private final File file = new File(dir + "/resourses/treasures.csv");
    private final String separator = ",";

    public void saveTreasures(List<Treasure> treasures) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Treasure treasure : treasures) {
            writer.newLine(treasure.getName() + separator + treasure.getPrice());
        }
        writer.flush();
    }

    public List<Treasure> loadTreasures() throws IOException {
        List<Treasure> treasures = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        while((line = reader.readLine()) != null) {
            String[] data = line.split(separator);
            Treasure treasure = new Treasure(data[0], Integer.parseInt(data[1]));
            treasures.add(treasure);
        }
        return treasures;
    }

    public String getDir() {
        return dir;
    }
}
