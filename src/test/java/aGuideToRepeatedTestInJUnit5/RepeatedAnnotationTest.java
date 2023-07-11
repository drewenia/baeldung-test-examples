package aGuideToRepeatedTestInJUnit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedAnnotationTest {

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    void repeatedTestWithLongName() {
        System.out.println("Executing repeated test with long name");

        assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("before each test");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("after each test");
        System.out.println("=====================");
    }

    @RepeatedTest(3)
    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo){
        System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition());

        assertEquals(3, repetitionInfo.getTotalRepetitions());
    }
}
