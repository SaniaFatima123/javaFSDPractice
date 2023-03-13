package collectionTasks.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class WordStore {
    List<Word> wordsList = new ArrayList<>();
    public void addWords(String filename){
        Reader reader = null;
        try {
            reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //apple mango banana apple orange mango mango pineapple
                String[] value = line.split(" ");
                //[apple, mango, banana, apple, orange, mango, mango, pineapple]
                for (String word : value) {
                    addWord(word);
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            closeFile(reader);
        }
    }
    private void addWord(String wordName){
        for(Word word:wordsList){
            if(word.getName().equalsIgnoreCase(wordName)){
                word.setCount(word.getCount()+1);
                return;
            }
        }
        wordsList.add(new Word(wordName,1));
    }
    private void closeFile(Reader reader){
        try {
            if (reader != null) {
                reader.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public List<Word> showWordList(){
        return wordsList;
    }
    public List<Word> sortWordInAscendingOrder(){
        List<Word> sortedList = new ArrayList<>();
        //copying list from wordsList into sorted list
        sortedList.addAll(wordsList);
        AscendingWordComparator wordComparator = new AscendingWordComparator();
        sortedList.sort(wordComparator);
        return  sortedList;
    }
    public List<Word> sortWordInDescendingOrder(){
        //copying list from wordsList into sorted list
        List<Word> sortedList = new ArrayList<>();
        sortedList.addAll(wordsList);
        DescendingWordComparator wordComparator = new DescendingWordComparator();
        sortedList.sort(wordComparator);
        return  sortedList;
    }
    public List<Word> sortWordInDescendingOrderOfFrequency(){
        //copying list from wordsList into sorted list
        List<Word> sortedList = new ArrayList<>(wordsList);
        FrequencyComparatorInDescendingOrder frequencyComparatorInDescendingOrder = new FrequencyComparatorInDescendingOrder();
        sortedList.sort(frequencyComparatorInDescendingOrder);
        return  sortedList;
    }
}
