import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price is 23.95, the discount is 2, final: 21.95";

        try {
            if (text == null) throw new Exception("Текст отсутствует");

            Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println("Найдено число: " + matcher.group());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при поиске чисел: " + e.getMessage());
        }
    }
}
