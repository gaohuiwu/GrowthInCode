import com.google.zxing.WriterException;
import com.grow.utils.StringExUtil;
import com.grow.utils.qrcode.QrCodeUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * FileName:TestYou
 * Author:  ghw06
 * Date:    2018/4/11 10:31
 * Description:
 */
public class TestYou {

    private final static Logger logger= LoggerFactory.getLogger(TestYou.class);

    @Test
    public void test001(){
        logger.debug("debug测试过程中~~");
        System.out.println(StringExUtil.leftPad("123",8,"0"));
        System.out.println(StringExUtil.rightPad("123",8,"0"));
        logger.info("info测试过程中--");
        logger.warn("warn会出来吗");
        logger.error("error");
    }

    @Test
    public void testQrCode() throws IOException, WriterException {
        logger.info("测试二维码工具类");

        QrCodeUtil.makeEncode();
    }
}
