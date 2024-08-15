package se.lexicon.exceptions.workshop;

import java.io.IOException;
import java.util.List;

import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.exception.DuplicateNameException;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

    public static void main(String[] args) {
        try {
            List<String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
            List<String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();
            List<String> lastNames = CSVReader_Writer.getLastNames();
            NameService nameService = new NameService(maleFirstNames, femaleFirstNames, lastNames);
            Person test = nameService.getNewRandomPerson();
            nameService.addFemaleFirstName("Test");
            System.out.println(test);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (DuplicateNameException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Ops! something with IO is went wrong! " + e.getMessage());
            e.printStackTrace();
        }

    }

}
