package by.tc.task3.parser.impl;


import by.tc.task3.creator.command.CommandDeterminant;
import by.tc.task3.parser.Analyzer;
import by.tc.task3.parser.exception.FileReaderException;
import by.tc.task3.parser.reader.impl.XMLFileReaderImpl;

import java.util.Objects;


public class AnalyzerImpl implements Analyzer {


    public void analysis() throws FileReaderException {
        String tagType;
        try (XMLFileReaderImpl reader = XMLFileReaderImpl.getInstance()) {
            while ((tagType = reader.readingFile()) != null) {
                if (!Objects.equals(tagType, "</")) {
                    CommandDeterminant.commandIdentify(tagType);
                }


            }
        } catch (Exception e) {
            throw new FileReaderException("Ошибка чтения файла");
        }
    }

}
