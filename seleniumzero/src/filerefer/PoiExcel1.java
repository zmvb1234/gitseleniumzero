/**
 * 
 */
package filerefer;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��13�� ����9:43:58 
 * ��˵�� 
 */
import java.io.File;  
import java.io.FileInputStream;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * @author Administrator
 *
 */
public class PoiExcel1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try{  
            
            // ָ��excel��·��  
            File src = new File(".\\Files\\test-data.xlsx");  
            // �����ļ�  
            FileInputStream fis = new FileInputStream(src);  
            // ����workbook  
            @SuppressWarnings("resource")  
            XSSFWorkbook wb=new XSSFWorkbook(fis);  
            //����sheet����������ֻ��һ��sheet,Ĭ����sheet1  
            XSSFSheet sh1= wb.getSheetAt(0);  
            // ��ʼ��ȡ��һ�е�һ�е�����  
            System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());  
            // ��ȡ��һ�еڶ�������  
            System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());  
            // ��ȡ�ڶ��еڶ�������  
            System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());  
            // ��ȡ�ڶ��еڶ�������  
            System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());  
            // ��ȡʵ��������  
            System.out.println(sh1.getPhysicalNumberOfRows());  
            // ��ȡʵ��������  
            System.out.println(sh1.getPhysicalNumberOfRows());  
           }
		catch (Exception e)
		{  
            System.out.println(e.getMessage());    
        }  

	}

}
