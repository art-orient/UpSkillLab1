package BasicsOfOOP.Task1;
// Создать объект класса Текстовый файл, используя классы Файл, Директория.
// Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("C:\\Users\\Sasha\\UpSkillLab1\\src\\BasicsOfOOP\\Task1");
        TextFile textFile = new TextFile(dir, "myfile.txt");
        textFile.createFile();
        String str1 = "First string\n";
        textFile.add(str1);
        String str2 = "Second string\n";
        textFile.add(str2);
        String newName = "file22.txt";
        textFile.renameFile(newName);
        String str3 = "Third string\n";
//        System.out.println(textFile.getFile().getAbsolutePath());
        textFile.add(str3);
        System.out.println();
        textFile.printToConsole();
        textFile.deleteFile();
    }
}
