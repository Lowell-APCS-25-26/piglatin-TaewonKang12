package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
          for(int i = 0; i<sWord.length(); i++){
                if(sWord.substring(i,i+1).equals("a")||sWord.substring(i,i+1).equals("e")||sWord.substring(i,i+1).equals("i")||sWord.substring(i,i+1).equals("o")||sWord.substring(i,i+1).equals("u")){
                 return i;
                }
          }
       return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        if(findFirstVowel(sWord)!=-1){
           return sWord.substring(findFirstVowel(sWord),sWord.length())+sWord.substring(0,findFirstVowel(sWord))+"ay";
        }else{
           return sWord + "ay";
        }
    }
}
