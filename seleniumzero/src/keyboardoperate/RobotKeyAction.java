/**
 * 
 */
package keyboardoperate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/** 
 * 
 * @version ����ʱ�䣺2017��12��8�� ����10:47:10 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class RobotKeyAction {
	// �������� ����Table��
    public static void keyPressWithTab() throws AWTException 
    { 
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_TAB);
    	r.keyRelease(KeyEvent.VK_TAB);
    	r.delay(1000);
    }
    //Enter
    public static void keyPressWithENTER() throws AWTException 
    { 
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	r.delay(1000);
    }
    //PageDown
    public static void keyPressWithPagedown() throws AWTException 
    { 
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_PAGE_DOWN);
    	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	r.delay(1000);
    }
  //PageUp
    public static void keyPressWithPageup() throws AWTException 
    { 
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_PAGE_UP);
    	r.keyRelease(KeyEvent.VK_PAGE_UP);
    	r.delay(1000);
    }
}
