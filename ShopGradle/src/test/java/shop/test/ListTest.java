package shop.test;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.shop.domain.Goods;
import org.fkit.shop.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ListTest {
	
	
	    
	    @Autowired
	    private GoodsService goodsService;
	@Test
	public  void testGoodsController(){
	    List<Goods> goods_list = goodsService.getAll();
      System.out.println(goods_list);
	}

	

}
