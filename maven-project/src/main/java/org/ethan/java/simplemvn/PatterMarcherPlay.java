package org.ethan.java.simplemvn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMarcherPlay {
    public static void main(String[] args) {

        String DATE_STRING = "2017-04-25";
        /**
         * Regular expressions allow us to not just match text but also to extract information for further processing. 
         * This is done by defining groups of characters and capturing them using the special parentheses ( and ) metacharacters
         */
        String regexGroupCapturing = "(\\d{4})-((\\d{2})-(\\d{2}))"; 
 
        Pattern pattern = Pattern.compile(regexGroupCapturing);
        Matcher matcher = pattern.matcher(DATE_STRING);
        System.out.printf("how many groups are presenting in thie regex: %d", matcher.groupCount());
        if(matcher.find()) {
            System.out.printf("\nmatcher.group(0) value:%s", matcher.group(0)); // group 0 is always the original string
            System.out.printf("\nmatcher.group(1) value:%s", matcher.group(1));
            System.out.printf("\nmatcher.group(2) value:%s", matcher.group(2));
            System.out.printf("\nmatcher.group(3) value:%s", matcher.group(3));
            System.out.printf("\nmatcher.group(4) value:%s", matcher.group(4));
        }
    }
    
}