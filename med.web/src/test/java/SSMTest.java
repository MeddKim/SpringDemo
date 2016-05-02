

import com.med.web.domain.Member;
import com.med.web.service.IMemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by LittleXuan on 2015/10/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class SSMTest {
    private static Logger logger = LoggerFactory.getLogger(SSMTest.class);

    @Resource
    private IMemberService memberService;

    @Test
    public void test1() {
//        long beginTime=System.nanoTime();
//        User user = userService.getUserById(1);
//        long endTime=System.nanoTime();
//        System.out.println("查询时间 :" + (endTime-beginTime));
//        logger.info("姓名："+user.getUserName());
//        logger.info(JSON.toJSONString(user));


        long beginTime=System.nanoTime();
        Member member = memberService.getMemberById(1);
        long endTime=System.nanoTime();
        System.out.println("查询时间 :" + (endTime-beginTime));
        logger.info("姓名："+member.getUname());
    }
}
