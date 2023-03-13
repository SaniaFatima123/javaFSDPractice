package collectionTasks.task4;

import java.util.Comparator;

public class DescendingWordComparator implements Comparator<Word> {
    public int compare(Word word1, Word word2){

        return word2.getName().compareTo(word1.getName());
    }
}
