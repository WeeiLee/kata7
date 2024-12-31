package es.software.ulpgc.kata7;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Main extends JFrame {
    public static void main(String[] args) throws IOException {
        new Main().setVisible(true);
    }
    public Main() throws IOException {
        this.setTitle("kata7");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(loadIcon());
    }

    private static Image loadIcon() throws IOException {
        InputStream imageStream = Main.class.getClassLoader().getResourceAsStream("pig.png");
        assert imageStream != null;
        return ImageIO.read(imageStream);
    }
}
