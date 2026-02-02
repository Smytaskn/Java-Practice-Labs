import java.util.*;

public class Main {
    public static void main(String[] args) {

        String inputText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Vestibulum commodo nisi eu condimentum porta. Mauris interdum eu dolor vitae consequat." +
                " Nam ligula felis, convallis ut dui interdum, ullamcorper maximus mi. " +
                "Nullam posuere ex libero, a tincidunt tortor suscipit nec. " +
                "Donec viverra est id leo lacinia sagittis. Pellentesque at" +
                " nulla tortor. Fusce turpis nulla, pharetra ac eros eget, luctus scelerisque mi. " +
                "Cras id mi vitae urna dictum dignissim. Praesent eu luctus diam. " +
                "Sed aliquet, risus ac ultricies mollis, quam augue consectetur lectus, a condimentum justo" +
                " felis vel justo. Nullam accumsan sem nulla, vitae hendrerit dolor " +
                "rhoncus vel. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;" +
                " Mauris eget gravida ligula.";

        // 1. Temizlik: Noktalama işaretlerini kaldır ve küçült
        inputText = inputText.toLowerCase()
                .replace(",", "")
                .replace(".", "")
                .replace("\n", "");

        // 2. Parçalama
        String[] words = inputText.split(" ");

        // 3. Sayma (HashMap ile Hızlı Yöntem)
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if(!word.isEmpty()) { // Boşlukları saymasın
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // 4. Alfabetik Sıralama ve Yazdırma
        System.out.println("--- Kelime Frekansları (Alfabetik) ---");
        List<String> uniqueWords = new ArrayList<>(wordCounts.keySet());
        Collections.sort(uniqueWords);

        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}