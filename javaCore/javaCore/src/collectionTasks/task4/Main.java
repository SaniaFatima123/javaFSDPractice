package collectionTasks.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        WordStore wordStore = new WordStore();
        wordStore.addWords("jobms/src/collectionTasks/task4/resouces/data.txt");
        System.out.println("Found all the Words***********************************");
        List<Word> foundWords = wordStore.showWordList();
        obj.display(foundWords);
        System.out.println("*******************************************************");
        System.out.println("Sorting in Ascending Order*****************************");
        List<Word> foundSortedWordsAsc = wordStore.sortWordInAscendingOrder();
        obj.display(foundSortedWordsAsc);
        System.out.println("*******************************************************");
        System.out.println("Sorting in Descending Order*****************************");
        List<Word> foundSortedWordsDsc = wordStore.sortWordInDescendingOrder();
        obj.display(foundSortedWordsDsc);
        System.out.println("*******************************************************");
        System.out.println("Sorting in Descending Order of Frequency****************");
        List<Word> foundSortedWordsDscFrq = wordStore.sortWordInDescendingOrderOfFrequency();
        obj.display(foundSortedWordsDscFrq);
    }
    public void display(List<Word> lists){
        for(Word word:lists){
            if(word!=null){
                System.out.println(word);
            }
        }
    }
}
