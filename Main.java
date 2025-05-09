import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 用於讀取使用者從主控台的輸入
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("請貼上您的資料 (每行格式為: SN TermNo)。");
        System.out.println("範例：");
        System.out.println("02085B4F00023F42 18900370");
        System.out.println("02085B4F00025426 S1007388");
        System.out.println("....");
        System.out.println("輸入完成後，請直接輸入一個空行 (按 Enter 兩次) 來結束輸入：");

        String line;
        // 迴圈讀取每一行輸入，直到使用者輸入空行
        while (true) {
            line = inputScanner.nextLine();

            // 如果讀取到空行，表示輸入結束，跳出迴圈
            if (line.isEmpty()) {
                break;
            }

            // 分割每一行的資料
            String[] parts = line.split(" ");
            if (parts.length == 2) {
                String sn = parts[0];
                String termNo = parts[1];
                System.out.println("UPDATE invsndata SET TermNo = '" + termNo + "' where sn = '" + sn + "';");
            } else {
                // 如果某一行格式不正確，可以選擇印出警告或忽略
                if (!line.trim().isEmpty()) { // 避免對完全是空白的行也報錯
                    System.out.println("警告：輸入行 '" + line + "' 格式不正確，已忽略。正確格式應為 'SN TermNo'");
                }
            }
        }

        // 關閉 inputScanner
        inputScanner.close();
        System.out.println("資料處理完成。");
    }
}