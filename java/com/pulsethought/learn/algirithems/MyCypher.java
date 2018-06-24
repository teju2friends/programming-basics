package com.pulsethought.learn.algirithems;

public class MyCypher {
    public String encrypt(String input, int offser) {

        if (null == input)
            return null;

        if (input.length() <= 0)
            return input;

        StringBuilder builder = new StringBuilder();
        for (char c: input.toCharArray()) {
            char replacedChar = (' ' == c || '_' == c) ? c : (char) (c + offser % 26);
            builder.append(replacedChar);
        }

        return builder.toString();
    }
}
