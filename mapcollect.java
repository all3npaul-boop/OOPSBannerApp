import java.util.HashMap;
import java.util.Map;
public class OOPSBannerUC8 {
    public static void main(String[] args) {
        String word = "OOPS";
        CharacterPatternMap patternMap = new CharacterPatternMap();
        displayBanner(word, patternMap);
    }
    public static void displayBanner(String text, CharacterPatternMap map) {
        int height = 9; 
        for (int row = 0; row < height; row++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char ch : text.toCharArray()) {
                String[] pattern = map.getPattern(ch);
                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  "); 
                }
            }
            System.out.println(lineBuilder);
        }
    }
    static class CharacterPatternMap {
        private final Map<Character, String[]> patternMap;
        public CharacterPatternMap() {
            patternMap = new HashMap<>();
            initializePatterns();
        }
        private void initializePatterns() {
            patternMap.put('O', new String[]{
                    "   *****   ",
                    " **     ** ",
                    "**       **",
                    "**       **",
                    "**       **",
                    "**       **",
                    "**       **",
                    " **      **",
                    "   *****   "
            });
            patternMap.put('P', new String[]{
                    "******    ",
                    "**     ** ",
                    "**     ** ",
                    "**     ** ",
                    "******    ",
                    "**        ",
                    "**        ",
                    "**        ",
                    "**        "
            });
            patternMap.put('S', new String[]{
                    "  *****   ",
                    " **    **",
                    "**        ",
                    "**        ",
                    "  *****   ",
                    "       ** ",
                    "        **",
                    " **     **",
                    "   *****   "
            });
        }
        public String[] getPattern(char character) {
            return patternMap.get(Character.toUpperCase(character));
        }
    }
}
