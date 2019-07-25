package com.mycompany.app;

import com.mycompany.model.OutputModel;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TwChallengeTest{

    @Test
    public void shouldTestGetCharLength() {

        String sampleInput = "This specification does not indicate the behavior, rendering or otherwise, of space characters other than those explicitly identified here as white space characters. For this reason, authors should use appropriate elements and styles to achieve visual formatting effects that involve white space, rather than space characters.For all HTML elements except PRE, sequences of white space separate 'words' (we use the term 'word' here to mean 'sequences of non-white space characters'). When formatting text, user agents should identify these words and lay them out according to the conventions of the particular written language (script) and target medium.";

        final int length = TwChallenge.getCharCount(sampleInput);
        Assert.assertEquals(653, length);
    }

    @Test
    public void shouldTestGetWordCount() {
        String sampleInput = "Sunset is the time of day when our sky meets the outer space solar winds. There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a blender. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that still must be done. There is a coolness, a calmness, when the sun does set.";

        final int length = TwChallenge.getWordCount(sampleInput);
        Assert.assertEquals(84, length);
    }

    @Test
    public void shouldTestGetSentenceCount() {
        String sampleInput = "Sunset is the time of day when our sky meets the outer space solar winds. There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a blender. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that still must be done. There is a coolness, a calmness, when the sun does set.";

        final OutputModel actualVowelCountMap = TwChallenge.getVowelCountMap(sampleInput);
        OutputModel expectedOutputModel = new OutputModel();
        final Map<String, Integer> vowelCountMap = expectedOutputModel.getVowelCountMap();
        vowelCountMap.put("a", 20);
        vowelCountMap.put("e", 49);
        vowelCountMap.put("i", 23);
        vowelCountMap.put("o", 27);
        vowelCountMap.put("u", 11);
        expectedOutputModel.setVowelCountMap(vowelCountMap);
        final Map<String, Integer> vowelCountMap1 = actualVowelCountMap.getVowelCountMap();
        System.out.println();
        Assert.assertEquals(expectedOutputModel.getVowelCountMap(), vowelCountMap1);
    }

    @Test
    public void shouldTestGetVowelCount() {

    }
}