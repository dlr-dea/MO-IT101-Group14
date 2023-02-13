import java.io.*;

public class FileHandling {

    public static void main (String[] args) throws IOException {

        String employee [] = {"Crisostomo, Jose", "Mata, Christian", "San Jose, Brad",
                "Salcedo, Anthony", "Romualdez, Alice", "Atienza, Rosie", "Farala, Martha",
                "Martinez, Leila", "San Jose, Allison", "Rosario, Cydney", "Lopez, Josie",
                "De leon, Selena", "Romualdez, Fredrick", "Bautista, Mark", "Lazaro, Darlen",
                "Delos Santos, Kolby", "Santos, Vella", "Del Rosario, Tomas", "Tolentino, Jacklyn",
                "Gutierrez, Percival"};
        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("filehandling.txt"));
            writer.write("MotorPH List of Employees");

            for (String name : employee) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
