/**
 * 
 */
package filerefer;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��15�� ����5:55:54 
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
public class PoiExcel2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
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
            // i ������  
            for(int i=0;i<sh1.getPhysicalNumberOfRows();i++)
            {  
                // j�ǿ����У���������������2��  
                for(int j=0;j<2;j++)
                {  
                      
                    System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());  
                }  
            }  
          
        } 
		catch (Exception e)
		{  
              
            System.out.println(e.getMessage());  
              
        }  
	}

}
