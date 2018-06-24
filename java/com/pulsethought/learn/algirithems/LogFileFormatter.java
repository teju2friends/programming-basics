package com.pulsethought.learn.algirithems;

import java.util.ArrayList;
import java.util.List;

/*
Write an algorithm to reorder the data in the log file.

The input to the function/method consists of two arguments -

logFileSize: an integer representing the number of lines in the log file,
logLines: a list of strings representing the log file.

Output:
Return a list of strings representing the reordered log file data.

Note:
Identifier consists of only English letters and numbers.
 The lines with words are not required to match case and the sort needs to be case insensitive.

Example:
Input:
logFileSize = 5
logLines =
[al 9 2 3 1]
[g1 Act car]
[zo4 4 7]
[abl off KEY dog]
[a8 act zoo]

Output:
[gl Act car]
[a8 act zoo]
[ab1 off KEY dog]
[al 9 2 3 1]
[zo4 4 7]

Explanation:
Second, fourth. and fifth lines are the lines with words.
 According to the lexicographical order, the second line will be reordered first in the log file,
  then fifth, and the fourth comes in the log file.
   Next, the lines with numbers come in the order in which these lines were in the input.

 */
public class LogFileFormatter {

    private static int compare(String firstString, String secondString) {
        String firstSubstring = firstString.substring(firstString.indexOf(' ')).toLowerCase();
        String secondSubstring = secondString.substring(secondString.indexOf(' ')).toLowerCase();
        return firstSubstring.compareTo(secondSubstring);
    }

    public List<String> format(List<String> input, int size) {

        List<String> formattedList = new ArrayList<>();
        List<String> dataList = new ArrayList<>();
        List<String> nonDataList = new ArrayList<>();

        for (String s: input) {
            String[] logParts = s.split(" ");
            if (partsContainWords(logParts)) {
                dataList.add(s);
            } else {
                nonDataList.add(s);
            }
        }

        dataList.sort(LogFileFormatter::compare);

        formattedList.addAll(dataList);
        formattedList.addAll(nonDataList);


        return formattedList;
    }

    private boolean partsContainWords(String[] logParts) {
        boolean firstIgnored = false;
        for (String part: logParts) {

            if (!firstIgnored) {
                firstIgnored = true;
                continue;
            }

            try {
                Long.valueOf(part);
            } catch (Exception e) {
                return true;
            }
        }
        return false;
    }
}
