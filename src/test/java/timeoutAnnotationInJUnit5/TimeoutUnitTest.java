package timeoutAnnotationInJUnit5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(5)
public class TimeoutUnitTest {
    @Test
    @Timeout(1)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    void shouldFailAfterDefaultTimeoutOfFiveSeconds() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Nested
    class NestedClassWithoutTimeout{
        @Test
        void shouldFailAfterParentsDefaultTimeoutOfFiveSeconds() throws InterruptedException {
            Thread.sleep(10_000);
        }
    }
}
