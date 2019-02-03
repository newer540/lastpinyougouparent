import com.lastpinyougou.mapper.TbBrandMapper;
import com.lastpinyougou.pojo.TbBrand;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        Test test=new Test();
        test.showBrands(applicationContext);
    }
    @Autowired
    private TbBrandMapper brandMapper;
    @org.junit.Test
    public void testAutoWire(){
        List<TbBrand> tbBrands = brandMapper.selectByExample(null);
        for (TbBrand brand:tbBrands)
            System.out.println(brand.getName());
    }
    private void showBrands(ApplicationContext applicationContext){
        TbBrandMapper brandMapper = (TbBrandMapper) applicationContext.getBean("tbBrandMapper");
        List<TbBrand> tbBrands = brandMapper.selectByExample(null);
        for (TbBrand brand:tbBrands)
            System.out.println(brand.getName());
    }
}
