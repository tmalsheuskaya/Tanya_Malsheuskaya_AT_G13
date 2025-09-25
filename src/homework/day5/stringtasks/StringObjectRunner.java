package homework.day5.stringtasks;

public class StringObjectRunner {
    public static void main(String[] args) {
        new LettersPrinter().printLetters("Take a look on this amazing text");
        new WordDuplicatesFinder().printDuplicates("etis atis animatis etis atis amatis");
        new DigitsExtractor().extractDigits("99 dollars");

        String log = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied";
        new LogParser().parseLog(log);

        new CurrentDatePrinter().printNow();
        new DateFormatter().reformat("01.50 25.11.2014");
        new VowelDateGenerator().generateDate("что тут у нас за дата");
    }
}
