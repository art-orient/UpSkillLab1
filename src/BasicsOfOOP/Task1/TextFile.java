package BasicsOfOOP.Task1;

import java.io.*;

public class TextFile {
    private Directory directory;
    private String name;
    private File file;

    public TextFile(Directory dir, String name) {
        this.directory = dir;
        this.name = name;
    }

    public void createFile() {
        file = new File(directory.getPath(), name);
        if (!file.exists()) {
            try {
                boolean isCreated = file.createNewFile();
                if (isCreated){
                    System.out.println("File created.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File exists.");
        }
    }

    public void add (String str){
        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(str);
        } catch (IOException e){
            e.getMessage();
        }
        System.out.println("String added in file.");
    }

    public void renameFile (String name){
        File newTextFile = new File(this.directory.getPath(), name);
        file.renameTo(newTextFile);
        file = newTextFile;
    }

    public void printToConsole (){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        file.delete();
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
