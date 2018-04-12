package com.grow.utils.qrcode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import org.apache.ibatis.javassist.NotFoundException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * FileName:QrCodeUtil
 * Author:  ghw06
 * Date:    2018/4/12 19:02
 * Description: 使用google的zxing生成二维码
 */
public class QrCodeUtil {
    /**
     * 生成二维码
     *
     * @throws WriterException
     * @throws IOException
     */
    public static void makeEncode() throws WriterException, IOException {
        String filePath = "G://";
        String fileName = "zxing.png";
        String content = "测试zxing生成二维码";//会出现在扫描二维码之后
        int width = 300;//图像宽度
        int height = 300;//图像高度
        String format = "png";//图像类型

        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
                BarcodeFormat.QR_CODE, width, height, hints);//生成矩阵
        Path path = FileSystems.getDefault().getPath(filePath, fileName);
        MatrixToImageWriter.writeToPath(bitMatrix, format, path);//输出图像
        System.out.println("输出成功");
    }

    /**
     * 解析二维码
     */
    public static void makeDecode() {
        String filePath = "G://zxing.png";
        BufferedImage image;
        try {
            image = ImageIO.read(new File(filePath));
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            Binarizer binarizer = new HybridBinarizer(source);
            BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
            Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
            hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
            Result result = new MultiFormatReader().decode(binaryBitmap, hints);//对图像进行解码
            System.out.println("图片中内容：");
            System.out.println("author：" + result.getText());
            System.out.println("图片中格式：");
            System.out.println("encode:" + result.getBarcodeFormat());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (com.google.zxing.NotFoundException e) {
            e.printStackTrace();
        }
    }
}
