package timeoutAnnotationInJUnit5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Nested
@Timeout(3)
public class NestedClassWithTimeoutTest {
    @Test
    void shouldFailAfterNestedClassTimeoutOfThreeSeconds() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    @Timeout(1)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(10_000);
    }
}
