package by.tc.task3.parser;

import by.tc.task3.parser.impl.AnalyzerImpl;

public class AnalyzerFactory {
    private static final AnalyzerFactory instance = new AnalyzerFactory();

    private final AnalyzerImpl analyzer = new AnalyzerImpl();

    private AnalyzerFactory() {
    }

    public AnalyzerImpl getAnalyzerFactory() {
        return analyzer;
    }

    public static AnalyzerFactory getInstance() {
        return instance;
    }
}
