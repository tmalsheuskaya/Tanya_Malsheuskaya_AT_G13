package playground.runners;

import playground.processors.CrawlableProcessor;
import playground.essence.creatures.*;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {

        CrawlableProcessor processor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");

        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        processor.runCrawlable(crawlableCrocodile);
        processor.runCrawlable(crawlableBeetle);

        // processor.runCrawlable(vertebrataCrocodile) - Vertebrata не реализует Crawlable
        // processor.runCrawlable(insectBeetle) - Insect не реализует Crawlable

        processor.runCrawlable(aCrocodile);
        processor.runCrawlable(aBeetle);
        processor.runCrawlable(anonymousCrawlable);

        processor.runCrawlable(crawlableCrocodile, "никуда");
        processor.runCrawlable(aBeetle, "налево");

        processor.runCrawlable(crawlableBeetle, "назад", 37);

        processor.runCrawlable(new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        }, "вниз", 37);
    }
}
