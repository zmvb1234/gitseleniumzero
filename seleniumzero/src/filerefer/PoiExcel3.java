/**
 * 
 */
package filerefer;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��22�� ����2:17:16 
 * ��˵�� 
 */
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * @author Administrator
 *
 */
public class PoiExcel3 {

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
	            //д��excel����  
	            sh1.getRow(0).createCell(2).setCellValue("Pass");  
	            sh1.getRow(1).createCell(2).setCellValue("Fail");  
	            sh1.getRow(2).createCell(2).setCellValue("N/A");  
	            sh1.getRow(3).createCell(2).setCellValue("Pass");  
	            // �����ļ�  
	            FileOutputStream fout=new FileOutputStream(new File(".\\Files\\test-data.xlsx"));   
	            //����д������   
	            wb.write(fout);  
	            // �ر��ļ�  
	            fout.close();  
	          } 
		 catch (Exception e)
		      { 
	            System.out.println(e.getMessage());   
	          }  

		

	}

}
