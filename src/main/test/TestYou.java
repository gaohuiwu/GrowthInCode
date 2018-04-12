import com.grow.utils.StringExUtil;
import org.junit.Test;

/**
 * FileName:TestYou
 * Author:  ghw06
 * Date:    2018/4/11 10:31
 * Description:
 */
public class TestYou {

    @Test
    public void test001(){
        System.out.println(StringExUtil.leftPad("123",8,"0"));
        System.out.println(StringExUtil.rightPad("123",8,"0"));
    }
}
