package collectionTasks.task4;

import java.util.Comparator;

public class FrequencyComparatorInDescendingOrder implements Comparator<Word>{

    @Override
    public int compare(Word word1,Word word2) {
       int val = word2.getCount()-word1.getCount();
       if(val==0){
           return word1.getName().compareTo(word2.getName());
       }
       return val;
    }
}
