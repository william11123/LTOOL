import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data = "02085B4F00023F42 18900370\n" +
                      "02085B4F00025426 S1007388\n" +
                      "02024C0300043F43 19101078\n" +
                      "02024C0300043F44 19101079\n" +
                      "02024C0300043F45 19101080\n" +
                      "02024C0300043F47 19101082\n" +
                      "02024C0300043F48 19101083\n" +
                      "02024C0300043F4A 19101085\n" +
                      "02024C0300043F4D 19101088\n" +
                      "02024C0300043F4F 19101092\n" +
                      "02024C0300043F50 19101093\n" +
                      "02024C0300043F52 19101094\n" +
                      "02024C030004404E 19101095\n" +
                      "02024C0300043F49 19101084\n" +
                      "02024C0300043F4E 19101089\n" +
                      "02024C0300014D18 19101076\n" +
                      "02024C0300043F42 19101077\n" +
                      "02024C0300043F46 19101081\n" +
                      "02024C0300043F4B 19101086\n" +
                      "02024C0300043F4C 19101087";

        Scanner scanner = new Scanner(data);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" "); // 將分隔符號從 "\t" 改為 " "
            if (parts.length == 2) {
                String sn = parts[0];
                String termNo = parts[1];
                System.out.println("UPDATE invsndata SET TermNo = '" + termNo + "' where sn = '" + sn + "';");
            }
        }
        scanner.close();
    }
}