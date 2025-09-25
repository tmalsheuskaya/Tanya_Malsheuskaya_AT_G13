package homework.day5.stringtasks;

public class LogParserStatic {
    public static void parseLog(String logText) {
        String[] lines = logText.split("\\n");

        String[] ips = new String[lines.length];
        int[] okCount = new int[lines.length];
        int[] failCount = new int[lines.length];
        int uniqueCount = 0;

        for (String line : lines) {
            String[] parts = line.split(" ");
            String ip = parts[1];
            String status = parts[2];

            int index = -1;
            for (int i = 0; i < uniqueCount; i++) {
                if (ips[i].equals(ip)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                ips[uniqueCount] = ip;
                if ("granted".equals(status)) {
                    okCount[uniqueCount] = 1;
                } else {
                    failCount[uniqueCount] = 1;
                }
                uniqueCount++;
            } else {
                if ("granted".equals(status)) {
                    okCount[index]++;
                } else {
                    failCount[index]++;
                }
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.printf("ip %s: ok - %d, failed - %d%n", ips[i], okCount[i], failCount[i]);
        }
    }
}
