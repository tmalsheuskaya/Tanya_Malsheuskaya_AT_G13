package playground.processors;

import playground.essence.creatures.Crawlable;
import playground.utils.DirectionGenerator;
import playground.utils.DistanceGenerator;

public class CrawlableProcessor {

    public void runCrawlable(Crawlable crawlable) {
        String randomDirection = DirectionGenerator.generateDirection();
        int randomDistance = DistanceGenerator.generateDistance();
        crawlable.crawl(randomDirection, randomDistance);
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        int randomDistance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, randomDistance);
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }

}
