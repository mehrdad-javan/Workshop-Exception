package se.lexicon.exceptions.workshop.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVReader_Writer {
	 /**
     * This method getMaleFirstNames should use a try-catch-finally without resources
     * Should catch FileNotFoundException and IOException
     * You should also close the Buffered reader in the finally block
     * @return List<String>of male firstnames
     */
    public static List<String> getMaleFirstNames(){

        BufferedReader reader = null;
        List <String> names = null;


        	reader = Files.newBufferedReader(Paths.get("firstname_males.txt"));
            names = reader.lines()
                    .flatMap(line -> Stream.of(line.split(",")))
                    .collect(Collectors.toList());

         	return names;
        }



    /**
     * This method getFemaleFirstNames should make use of a try-catch with resources
     * @return
     */
    public static List<String> getFemaleFirstNames(){

        List<String> names=null;

            BufferedReader reader = Files.newBufferedReader(Paths.get("firstname_female.txt"))
                names = reader.lines()
                        .flatMap(line -> Stream.of(line.split(",")))
                        .collect(Collectors.toList());

        return names;
    }


    /**
     * This method fetches strings from a file and put them into a list
     * This method might throw IOException which due to the throws clause need to
     * be handled by the caller.
     * @return List <String> of last names
     * @throws IOException
     */
    public static List<String> getLastNames() throws IOException{

        List<String> names = null;
        BufferedReader reader = null;

        try{
                reader = Files.newBufferedReader(Paths.get("lastnames.txt"));
                names = reader.lines()
                .flatMap(line -> Stream.of(line.split(",")))
                .collect(Collectors.toList());


        }finally{
            if(reader != null){
                reader.close();
            }
        }
        return names;
    }


    public static void saveLastNames(List <String> lastNames){

            BufferedWriter writer = Files.newBufferedWriter(Paths.get("lastnames.txt"));
            for(String toWrite : lastNames){
                writer.append(toWrite+",");
            }
            writer.flush();
      }

    public static void saveFemaleNames(List <String> femaleNames){
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("firstname_female.txt"));
            for(String toWrite : femaleNames){
                writer.append(toWrite+",");
            }
            writer.flush();

    }



    public static void saveMaleNames(List <String> maleNames){
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("firstname_males.txt"));
            for(String toWrite : maleNames){
                writer.append(toWrite+",");
            }
            writer.flush();


    }


}
