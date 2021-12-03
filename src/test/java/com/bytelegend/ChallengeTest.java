package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("Hello"));
        capture.expect(Matchers.containsStringIgnoringCase("42"));
        Challenge.main(new String[0]);
    }

    @Test
    public void hasHelloAndAddMethods() throws Exception {
        Assertions.assertTrue("Hello".equalsIgnoreCase(Challenge.hello()));
        Assertions.assertEquals(3, Challenge.add(1, 2));
    }
}
