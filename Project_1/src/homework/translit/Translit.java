package homework.translit;

public class Translit {
    public String rusToEngTranlit(String text) {
        char[] abcCyr = {' ', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        String[] abcLat = {" ", "a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "y", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "ts", "ch", "sh", "sch", "", "i", "", "e", "ju", "ja", "A", "B", "V", "G", "D", "E", "E", "Zh", "Z", "I", "Y", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "H", "Ts", "Ch", "Sh", "Sch", "'", "I", "'", "E", "Ju", "Ja"};
        String[] arrayText = new String[text.length()];
        String lastText = "";
        String charString = "";

        for (int i = 0; i < text.length(); i++) {
            for (int x = 0; x < abcCyr.length; x++) {
                if (text.charAt(i) == abcCyr[x]) {
                    arrayText[i] = abcLat[x];
                    break;
                }
                if ((text.charAt(i) != abcCyr[x]) && (x >= text.length())) {
                    charString = String.valueOf(text.charAt(i));
                    arrayText[i] = charString;
                }
            }
        }

        for (int i = 0; i < arrayText.length; i++) {
            lastText = lastText + arrayText[i];
        }
        return lastText;
    }
}

