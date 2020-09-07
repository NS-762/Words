import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Words {

    public static void main(String[] args) {

        int amount;

        String[] str1 = new String[]{
                "клавиатура", "клавиатура", "мышь", "монитор", "принтер",
                "микрофон", "наушники", "наушники", "динамики", "клавиатура",
                "принтер", "мышь"
        };

        Set<String> str2 = new HashSet<String>();
        str2.addAll(Arrays.asList(str1));
        System.out.println("Без повтора слов: " + str2);
        System.out.println();

        for (String word2 : str2) {
            amount = 0;
            for (String word1 : str1) {
                if (word2.equals(word1))
                    amount++;
            }
            System.out.printf("Количество повторений слова \"%s\" - %d раз\n", word2, amount);
        }
    }
}
