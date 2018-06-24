package com.pulsethought.learn.algirithems.test;

import com.pulsethought.learn.algirithems.LogFileFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LogFileFormatterTest {

    @Test
    public void canCreateObject() {
        LogFileFormatter fileFormatter = new LogFileFormatter();

        List<String> input = Arrays.asList(
                "al 9 2 3 1",
                "g1 Act car",
                "zo4 4 7",
                "abl off KEY dog",
                "a8 act zoo"
        );

        List<String> expected = Arrays.asList(
                "g1 Act car",
                "a8 act zoo",
                "abl off KEY dog",
                "al 9 2 3 1",
                "zo4 4 7"
        );

        List<String> formattedString = fileFormatter.format(input, input.size());
        Assert.assertNotNull(formattedString);

        assertListEquals(expected, formattedString);

    }

    private void assertListEquals(List<String> expected, List<String> input) {

        if (null == input)
            Assert.assertNull(expected);

        Assert.assertEquals(expected.size(), input.size());

        for (int i = 0; i < input.size(); i++) {
            Assert.assertEquals("["+expected.get(i)+"]","["+input.get(i)+"]");
        }
    }
}
