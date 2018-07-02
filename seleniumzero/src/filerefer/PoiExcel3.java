/**
 * 
 */
package filerefer;
/** 
 * @author 
 * @version 创建时间：2017年9月22日 下午2:17:16 
 * 类说明 
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
     
	            // 指定excel的路径  
	            File src = new File(".\\Files\\test-data.xlsx");  
	            // 加载文件  
	            FileInputStream fis = new FileInputStream(src);  
	            // 加载workbook  
	            @SuppressWarnings("resource")  
	            XSSFWorkbook wb=new XSSFWorkbook(fis);  
	            //加载sheet，这里我们只有一个sheet,默认是sheet1  
	            XSSFSheet sh1= wb.getSheetAt(0);  
	            //写入excel数据  
	            sh1.getRow(0).createCell(2).setCellValue("Pass");  
	            sh1.getRow(1).createCell(2).setCellValue("Fail");  
	            sh1.getRow(2).createCell(2).setCellValue("N/A");  
	            sh1.getRow(3).createCell(2).setCellValue("Pass");  
	            // 保存文件  
	            FileOutputStream fout=new FileOutputStream(new File(".\\Files\\test-data.xlsx"));   
	            //覆盖写入内容   
	            wb.write(fout);  
	            // 关闭文件  
	            fout.close();  
	          } 
		 catch (Exception e)
		      { 
	            System.out.println(e.getMessage());   
	          }  

		

	}

}
