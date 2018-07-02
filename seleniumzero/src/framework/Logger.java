/**
 * 
 */
package framework;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��12�� ����10:07:54 
 * ��˵�� 
 */
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.OutputStreamWriter;  
import java.text.SimpleDateFormat;  
import java.util.Date;
/**
 * @author Administrator
 *
 */
public class Logger 
{
	public static String OutputFileName = getDateTimeByFormat(new Date(), "yyyyMMdd_HHmmss");  
    private static OutputStreamWriter outputStreamWriter;  
    private static String logFileName;  
    public static boolean LogFlag = true;  
  
    public Logger() 
    {  
  
    }  
  
    private static void WriteLog(String logEntry) {  
  
        try 
        {  
               // ������־�ļ�����·������־�ļ�����  
                logFileName = ".\\Log" + "\\" + OutputFileName + ".log";  
                if (outputStreamWriter == null) 
                {  
                    File logFile = new File(logFileName);  
                  
                if (!logFile.exists())  
                        logFile.createNewFile();  
                //����OutputStreamWriter����־�ļ�д���ݣ��ַ�������unicode  
                //outputStreamWriter = new OutputStreamWriter(new FileOutputStream(logFileName), "utf-8");
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(logFileName), "GBK");
                }  
            outputStreamWriter.write(logEntry, 0, logEntry.length());  
            outputStreamWriter.flush();  
  
        } 
        catch (Exception e) 
        {  
            System.out.println(LogType.LogTypeName.ERROR.toString() + ": Failed to write the file " + logFileName);  
            e.printStackTrace();  
        }  
  
    }  
  
    //��ȡ��ǰϵͳʱ�䣬�õ���ʽ��ʱ���ַ���  
    private static String getDateTimeByFormat(Date date, String format) 
    {  
        SimpleDateFormat df = new SimpleDateFormat(format);  
        return df.format(date);  
  
    }  
    public static void Output(LogType.LogTypeName logTypeName, String logMessage) 
    {  
        Date date = new Date();  
        String logTime = getDateTimeByFormat(date, "yyyy-MM-dd HH:mm:ss.SSS");  
        String logEntry = logTime + " " + logTypeName.name() + ": " + logMessage + "\r\n";  
        System.out.print(logEntry);  
        // ����һ�����أ�ΪTrue�������־������㲻��������ĳ�False  
        if (LogFlag) 
        {
            WriteLog(logEntry);  
        }
    } 
	
	
	
}
