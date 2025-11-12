package people.junit;

import hometaskday16.BookingFirstTest;
import hometaskday16.WeatherTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        //WeatherTest.class
        BookingFirstTest.class
})

public class JUnitRunner {
}
