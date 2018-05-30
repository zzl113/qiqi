package  sousuo.biz;

import java.util.List;

import sousuo.entity.GoodCondition;
import sousuo.entity.Tgoods;

 
public interface IGoodService {
	public List<Tgoods> queryGoods(GoodCondition goodCon,int pageNo,int pageSize);
	public  int queryGoodsPages(GoodCondition goodCon,int pageSize);
}
