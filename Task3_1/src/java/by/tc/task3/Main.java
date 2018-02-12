package by.tc.task3;

import by.tc.task3.parser.Analyzer;
import by.tc.task3.parser.AnalyzerFactory;
import by.tc.task3.parser.exception.FileReaderException;

public class Main {
    public static void main(String[] args) {
        try {
            AnalyzerFactory factory = AnalyzerFactory.getInstance();
            Analyzer analyzer = factory.getAnalyzerFactory();
            analyzer.analysis();
        } catch (FileReaderException e) {
            e.getMessage();
        }
    }
}
