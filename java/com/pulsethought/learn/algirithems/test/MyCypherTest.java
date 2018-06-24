package com.pulsethought.learn.algirithems.test;

import com.pulsethought.learn.algirithems.MyCypher;
import org.junit.Assert;
import org.junit.Test;

public class MyCypherTest {

    @Test
    public void canCreateCypher() {
        verify(null, 0, null);
        verify("", 0, "");
        verify("A", 0, "A");
        verify("A", 1, "B");
        verify("ABC", 3, "DEF");
        verify("DEF", -3, "ABC");
        verify("DE F", -3, "AB C");
        verify("DE_F", -3, "AB_C");

        verify("A", 26, "A");
        verify("Z", -26, "Z");
    }

    private void verify(String input, int offser, String expected) {
        MyCypher cypher = new MyCypher();
        Assert.assertNotNull(cypher);
        String encryptedMessage = cypher.encrypt(input, offser);
        Assert.assertEquals(expected, encryptedMessage);
    }
}
