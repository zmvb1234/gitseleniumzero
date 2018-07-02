/**
 * 
 */
package filerefer;
/** 
 * @author 
 * @version 创建时间：2017年9月15日 下午5:55:54 
 * 类说明 
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
            
            // 指定excel的路径  
            File src = new File(".\\Files\\test-data.xlsx");  
            // 加载文件  
            FileInputStream fis = new FileInputStream(src);  
            // 加载workbook  
            @SuppressWarnings("resource")  
            XSSFWorkbook wb=new XSSFWorkbook(fis);  
            //加载sheet，这里我们只有一个sheet,默认是sheet1  
            XSSFSheet sh1= wb.getSheetAt(0);  
            // i 控制行  
            for(int i=0;i<sh1.getPhysicalNumberOfRows();i++)
            {  
                // j是控制列，我们上面数据是2列  
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
