// Last updated: 7/9/2026, 9:09:34 AM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {

            int j = i;
            int lineLength = 0;

            // Find words that fit in current line
            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {

                lineLength += words[j].length();
                j++;
            }

            int numWords = j - i;
            int spacesNeeded = maxWidth - lineLength;

            StringBuilder line = new StringBuilder();

            // Last line OR only one word
            if (j == words.length || numWords == 1) {

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1)
                        line.append(" ");
                }

                while (line.length() < maxWidth)
                    line.append(" ");
            }
            else {

                int gaps = numWords - 1;

                int eachSpace = spacesNeeded / gaps;
                int extraSpace = spacesNeeded % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        for (int s = 0; s < eachSpace; s++)
                            line.append(" ");

                        if (extraSpace > 0) {
                            line.append(" ");
                            extraSpace--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}