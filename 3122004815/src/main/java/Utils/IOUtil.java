package Utils;

import java.io.*;

public class IOUtil {

   /**
    * Description:  读取TXT文件
    * date: 2024/9/10
    * @param txtPath 读取文件的路径
    * @author: cjx
    * @return:
    */
    public static String readTxt(String txtPath) {
        String str = "";
        String strLine;
        // 将 txt文件按行读入 str中
        File file = new File(txtPath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 字符串拼接
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

   /**
    * Description:
    * date: 2024/9/10
    * @param str
    * @param txtPath
    * @author: cjx
    * @return:
    */
    public static void writeTxt(String  str,String txtPath){

        File file = new File(txtPath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str, 0, str.length());
            fileWriter.write("\r\n");
            // 关闭资源
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
