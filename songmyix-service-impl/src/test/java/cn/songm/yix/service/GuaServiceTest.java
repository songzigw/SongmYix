package cn.songm.yix.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.songm.common.utils.DateUtils;
import cn.songm.yix.entity.Gua;
import cn.songm.yix.entity.Predict;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-yix.xml" })
public class GuaServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GuaService guaService;
    
//    @BeforeClass
//    public static void setUpBeforeClass() {
//        System.out.println("beforeClass");
//    }
//    
//    @AfterClass
//    public static void tearDownAfterClass() {
//        System.out.println("afterClass");
//    }
//    
//    @Before
//    public void setUp() {
//        System.out.println("setUp");
//    }
//    
//    @After
//    public void tearDown() {
//        System.out.println("tearDown");
//    }
    
    @Test
    public void testAddGua() {
        Gua gua = guaService.getGuaById("000000");
        System.out.println(gua);
    }
    
    @Test
    public void testAddPredict() {
        Date time = DateUtils.parseDate("2018-07-13 15:07:49", "yyyy-MM-dd HH:mm:ss");
        Predict predict = new Predict();
        predict.setMatter("");
        predict.setTime(time);
        predict.setNum1(2);
        predict.setNum2(9);
        predict.setNum3(3);
        Gua g = guaService.getGuaByIndex(predict.getGuaIndexS(), predict.getGuaIndexX());
        System.out.println(g);
        System.out.println(predict.getDongYao());
    }
    
    public static void main(String[] args) {
//        Date time = DateUtils.parseDate("2018-07-10 15:29:12", "yyyy-MM-dd HH:mm:ss");
//
//        Predict predict = new Predict();
//        predict.setMatter("");
//        predict.setTime(time);
//        predict.setNum1(2);
//        predict.setNum2(9);
//        predict.setNum3(3);
//        System.out.println(predict.getGuaIndexS());
//        System.out.println(predict.getGuaIndexX());
//        System.out.println(predict.getDongYao());
        
        

//        Predict predict = new Predict();
//        predict.setMatter("明天大盘如何");
//        predict.setTime(DateUtils.parseDate("2018-08-06 11:14:21", "yyyy-MM-dd HH:mm:ss"));
//        predict.setNum1(38);
//        predict.setNum2(69);
//        predict.setNum3(53);

//        Predict predict = new Predict();
//        predict.setMatter("中源协和明天我会把本钱捞回来吗");
//        predict.setTime(DateUtils.parseDate("2018-08-06 15:34:03", "yyyy-MM-dd HH:mm:ss"));
//        predict.setNum1(3);
//        predict.setNum2(9);
//        predict.setNum3(23);
        
//        Predict predict = new Predict();
//        predict.setMatter("8月8号，大盘走势");
//        predict.setTime(DateUtils.parseDate("2018-08-07 15:08:11", "yyyy-MM-dd HH:mm:ss"));
//        predict.setNum1(71);
//        predict.setNum2(82);
//        predict.setNum3(56);
        
//        Predict predict = new Predict();
//        predict.setMatter("8月8号，中源协和走势");
//        predict.setTime(DateUtils.parseDate("2018-08-07 15:23:12", "yyyy-MM-dd HH:mm:ss"));
//        predict.setNum1(51);
//        predict.setNum2(86);
//        predict.setNum3(73);
        
        // 32 86 57 
        Predict predict = new Predict();
        // 78 56 32
        //predict.setTime(DateUtils.parseDate("2018-10-11 08:14:14", "yyyy-MM-dd HH:mm:ss"));
        //predict.setNum1(38);
        //predict.setNum2(79);
        //predict.setNum3(51);
        
//        predict.setTime(DateUtils.parseDate("2018-10-22 09:55:07", "yyyy-MM-dd HH:mm:ss"));
//        predict.setNum1(55);
//        predict.setNum2(81);
//        predict.setNum3(63);
        
        predict.setTime(DateUtils.parseDate("2018-11-01 13:47:20", "yyyy-MM-dd HH:mm:ss"));
        predict.setNum1(38);//71 23 56
        predict.setNum2(59);//36 58 79
        predict.setNum3(63);//32 58 69 // 31 89 63 // 39 72 89 // 38 96 57 // 38 59 63
        
        System.out.println(predict.getGuaIndexS());
        System.out.println(predict.getGuaIndexX());
        System.out.println(predict.getDongYao());
        
    }
    
}
