package homework.day5.stringtasks;

public class StringStaticRunner {
    public static void main(String[] args) {
        LettersPrinterStatic.printLetters("here we go again");
        WordDuplicatesFinderStatic.printDuplicates("this is text and next is also text");
        DigitsExtractorStatic.extractDigits("covid 19");

        String log = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied";
        LogParserStatic.parseLog(log);

        CurrentDatePrinterStatic.printNow();
        DateFormatterStatic.reformat("09.15 19.04.2014");
        VowelDateGeneratorStatic.generateDate("what does the fox say");
    }
}
