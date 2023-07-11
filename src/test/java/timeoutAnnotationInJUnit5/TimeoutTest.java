package timeoutAnnotationInJUnit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {
    @Test
    @Timeout(1)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    @Timeout(value = 2,unit = TimeUnit.MINUTES)
    void shouldFailAfterTwoMinutes() throws InterruptedException {
        Thread.sleep(1_000);
    }

    @Test
    @Timeout(value = 5,unit = TimeUnit.MINUTES,threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
    void shouldUseADifferentThread() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(10_000);
    }

    @Timeout(1)
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void eachTestShouldFailAfterOneSecond(int input) throws InterruptedException {
        Thread.sleep(1_100);
    }
}
