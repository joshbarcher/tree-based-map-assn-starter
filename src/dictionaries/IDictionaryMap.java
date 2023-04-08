package dictionaries;

import java.util.List;

public interface IDictionaryMap
{
    /**
     * Adds a word/definition pair to the dictionary if the input word is not presently
     * in the dictionary. Otherwise, the method will update the definition for an
     * already existing word.
     *
     * @param word the new word
     * @param definition the associated definition
     * @return true if the word was found and updates, or otherwise false
     */
    boolean add(String word, String definition);

    /**
     * Returns true if the word is in the dictionary map.
     *
     * @param word the word to search for
     * @return true if the word is found, or otherwise false
     */
    boolean containsWord(String word);

    /**
     * Returns the definition of the input word found in the dictionary.
     *
     * @param word the word to search for
     * @return the definition of the input word
     *
     * @throws java.util.NoSuchElementException if the word is not found in the dictionary.
     */
    String define(String word);

    /**
     * Returns an ordered list of words from the dictionary.
     * There should be no duplicates in the list.
     *
     * @return a list of words
     */
    List<String> words();

    /**
     * Returns an unordered list of definitions from the dictionary.
     * @return a list of definitions
     */
    List<String> definitions();

    /**
     * Returns the number of words in the dictionary.
     * @return the number of words
     */
    int size();

    /**
     * Returns whether the dictionary is empty or not
     * @return true if the dictionary has no words, otherwise false
     */
    boolean isEmpty();

    /**
     * Removes all words from the dictionary.
     */
    void clear();
}
