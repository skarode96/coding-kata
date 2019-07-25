package com.mycompany.app;

import com.mycompany.model.InputModel;
import com.mycompany.model.OutputModel;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

public class TwChallenge {

    private static final String INPUT_URI = "https://http-hunt.thoughtworks-labs.net/challenge/input";
    private static final String OUTPUT_URI = "https://http-hunt.thoughtworks-labs.net/challenge/output";

    public static void main(String[] args) {
        ResponseEntity<InputModel> exchange = getInputExchange();
        final String text = exchange.getBody().getText();
        final OutputModel outputModel = getVowelCountMap(text);
        final ResponseEntity<OutputModel> outputExchange = getOutputExchange(outputModel.getVowelCountMap());
        System.out.println(" " + outputExchange.getStatusCode() + outputExchange.getBody());
    }

    private static ResponseEntity<OutputModel> getOutputExchange(final Map<String, Integer> vowelCountMap) {
        final RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = getHttpHeaders();
        final HttpEntity<Map<String, Integer>> mapHttpEntity = new HttpEntity<Map<String, Integer>>(vowelCountMap, headers);
        ResponseEntity<OutputModel> exchange = null;
        try {
            exchange = restTemplate.exchange(
                    OUTPUT_URI, HttpMethod.POST, mapHttpEntity, OutputModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exchange;
    }

    private static ResponseEntity<InputModel> getInputExchange() {
        final RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<InputModel> responseEntity = new HttpEntity<InputModel>(headers);
        ResponseEntity<InputModel> exchange = null;
        try {
            exchange = restTemplate.exchange(
                    INPUT_URI, HttpMethod.GET, responseEntity, InputModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exchange;
    }

    static int getCharCount(final String text) {
        return text.length();
    }

    static int getWordCount(String string)
    {
        int count=0;

        char ch[]= new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            ch[i]= string.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }

    static int getSentenceCount(final String string) {
        int count=0;

        char ch[]= new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            ch[i]= string.charAt(i);
            if( ((i>0)&&(ch[i] =='?')|| ((i>0)&&(ch[i]=='.'))))
                count++;
        }
        return count;
    }



    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("userid", "v-_-WXrcd");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return headers;
    }


    static OutputModel getVowelCountMap(final String string) {

        final OutputModel outputModel = new OutputModel();
        final Map<String, Integer> vowelCountMap = outputModel.getVowelCountMap();

        for(int i=0;i<string.length();i++)
        {
            final String c = String.valueOf(string.charAt(i));
            if(vowelCountMap.containsKey(c)) {
                Integer count = vowelCountMap.get(c);
                vowelCountMap.put(c, ++count);
            }
        }
        return new OutputModel(vowelCountMap);
    }
}
