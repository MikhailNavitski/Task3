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
        } catch (Exception e) {// Эм, тему исключеия мы уже расссматривали, и вот после тее ты осмеливаешься перехватывать один Exception
            // смелый, смелый.........
            throw new FileReaderException("Ошибка чтения файла");// 1 - почему на русском?
            // 2 - "Ошибка чтения файла" - сообщения должны быть информативными, а эту инфу можно почерпнуть из названия класса
        }
    }

}
