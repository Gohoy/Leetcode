public class niuke_022 {
    public int compare(String version1, String version2) {
        char[] chars1 = version1.toCharArray();
        char[] chars2 = version2.toCharArray();
        int i = 0;
        int j = 0;

        while (i < chars1.length || j < chars2.length) {
            int num1 = 0;
            int num2 = 0;

            while (i < chars1.length && chars1[i] != '.') {
                num1 = num1 * 10 + (chars1[i] - '0');
                i++;
            }

            while (j < chars2.length && chars2[j] != '.') {
                num2 = num2 * 10 + (chars2[j] - '0');
                j++;
            }

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }

            i++;
            j++;
        }

        return 0;
    }
}
