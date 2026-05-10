
package cis2900_ioexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.StandardOpenOption;
import javax.imageio.ImageIO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class CIS2900_IOExample {


    public static void main(String[] args) {
        // TODO code application logic here
        // Writing examples
        writeFile("output.txt");
        writeFilewithResource("output2.txt");
        newWriteFile("output3.txt");
        saveCSVFile("data.csv");
        saveJsonFile("data.json");
        createImage("half_image.png");

        // Reading examples
        readFile("output.txt");
        newReadFile("output2.txt");
        readCSV("data.csv");
        readHTMLTitle("labnews.html");  // Requires external HTML file
     
    }

    public static void writeFile(String fileName) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println("Hello, this is Java File I/O!");
            writer.println("Line1");
            writer.println("Line2");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void writeFilewithResource(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Hello, this is Java File I/O!");
            writer.println("Line1");
            writer.println("Line2");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void newWriteFile(String fileName) {
        try {
            Files.write(
                    Path.of(fileName),
                    List.of(
                            "Hello, this is Java File I/O!",
                            "Line1",
                            "Line2"
                    )
            );

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void saveCSVFile(String fileName) {
        try {
            List<String> lines = List.of(
                    "Name,Age",
                    "Alice,20",
                    "Bob,25"
            );

            Files.write(Path.of(fileName), lines);

            System.out.println("CSV file saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing CSV file: " + e.getMessage());
        }
    }

    public static void saveJsonFile(String fileName) {
        try {
            String json = """
            {
                "name": "Alice",
                "age": 25,
                "city": "New York"
            }
            """;

            Files.writeString(Path.of(fileName), json);

            System.out.println("JSON file created.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void createImage(String fileName) {

        int width = 200;
        int height = 200;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Loop through pixels
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                if (x < width / 2) {
                    //blue
                    image.setRGB(x, y, 0x0000FF);
                } else {
                    //yellow
                    image.setRGB(x, y, 0xFFFF00);
                }
            }
        }

        try {
            ImageIO.write(image, "png", new File("half_image.png"));
            System.out.println("Image created successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("File read successfully.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void newReadFile(String fileName) {
        try {
            Files.lines(Path.of(fileName))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void readCSV(String fileName) {
        try (var lines = Files.lines(Path.of(fileName))) {
            lines.forEach(line -> {
                String[] values = line.split(",");
                System.out.println("Name: " + values[0] + ", Age: " + values[1]);
            });
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

public static void readHTMLTitle (String fileName) {
   
        try {
            File file = new File(fileName);

            Document doc = Jsoup.parse(file, "UTF-8");

            String title = doc.title();

            System.out.println("Title: " + title);

        } catch (IOException e) {
            System.out.println("Error reading HTML file: " + e.getMessage());
        }
    }

}
