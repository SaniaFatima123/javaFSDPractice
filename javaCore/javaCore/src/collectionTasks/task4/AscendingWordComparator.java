package collectionTasks.task4;

import java.util.Comparator;

public class AscendingWordComparator implements Comparator<Word> {
    public int compare(Word word1, Word word2){
        return word1.getName().compareTo(word2.getName());
    }
}
