package by.tc.task3.parser.reader.impl;

import by.tc.task3.parser.reader.XMLFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ResourceBundle;

public class XMLFileReaderImpl implements XMLFileReader, AutoCloseable {

    private final static XMLFileReaderImpl instance = new XMLFileReaderImpl();
    private static String filePath = ResourceBundle.getBundle("source_name").getString("source.name");
    private static BufferedReader reader;

    private XMLFileReaderImpl() {

    }

    public static XMLFileReaderImpl getInstance() {
        return instance;
    }

    static {
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }


    public String readingFile() throws IOException {
        StringBuilder buffer = new StringBuilder();
        int symbol;

        while ((symbol = reader.read()) != -1) {

            if ((char) symbol == ('>') || (char) symbol == '/') {
                buffer.append((char) symbol);
                break;
            }

            buffer.append((char) symbol);

        }
        if (symbol == -1) {
            return null;
        }
        return buffer.toString().trim();

    }

    @Override
    public void close() throws Exception {
        reader.close();
    }


}
