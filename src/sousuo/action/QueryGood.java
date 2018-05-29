package sousuo.action;

import java.util.ArrayList;
import java.util.List;

import sousuo.biz.ICateService;
import sousuo.biz.IGoodService;
import sousuo.biz.impl.CateServiceImpl;
import sousuo.biz.impl.GoodServiceImpl;
import sousuo.entity.GoodCondition;
 
import sousuo.entity.Tcategory;
import sousuo.entity.Tcategorysecond;
 
import sousuo.entity.Tgoods;

import com.opensymphony.xwork2.ActionSupport;

public class QueryGood extends ActionSupport {
private GoodCondition goodCon;//接受请求参数的 
	
	private int pageNo;
	private int totalPage;
	
	
	
	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public GoodCondition getGoodCon() {
		return goodCon;
	} 

	public void setGoodCon(GoodCondition goodCon) {
		this.goodCon = goodCon;
	} 
	private List<Tgoods> goods;//存放查询的商品列表 将来在页面中展示 
	public List<Tgoods> getGoods() {
		return goods;
	}

	public void setGoods(List<Tgoods> goods) {
		this.goods = goods;
	}

	public List<Tcategory> getBigCates() {
		return bigCates;
	}

	public void setBigCates(List<Tcategory> bigCates) {
		this.bigCates = bigCates;
	}

	public List<Tcategorysecond> getSmallCates() {
		return smallCates;
	}

	public void setSmallCates(List<Tcategorysecond> smallCates) {
		this.smallCates = smallCates;
	}
	private List<Tcategory> bigCates;//存放大分类列表 将来页面中展示
	private List<Tcategorysecond>smallCates;//存放小分类列表 将来页面中展示
    
	 

	public void setCateBiz(ICateService cateBiz) {
		this.cateBiz = cateBiz;
	}
	private IGoodService goodService = new GoodServiceImpl();
	private ICateService cateBiz = new CateServiceImpl();
	
	@Override
	public String execute() throws Exception {
		System.out.println(pageNo);
		totalPage = goodService.queryGoodsPages(goodCon,6);//总页数
		if(pageNo<1)
			pageNo = 1;
		if(pageNo>totalPage)
			pageNo = totalPage;
		//1.根据goodCon对象得到的参数值  查询数据库 得到商品列表  
		goods = goodService.queryGoods(goodCon,pageNo,6);		
		//2.查询大分类列表  页面上要有下拉框
		bigCates = cateBiz.queryAllCatergrys2();
		//3.如果goodCon中大分类id不为空  查询小分类列表
		if(goodCon!=null&&goodCon.getBigCateId()!=null) {
			smallCates = cateBiz.querySmallByBig(goodCon.getBigCateId());
		}else {
			smallCates = new ArrayList<>();
		} //4.返回页面展示 
		return super.execute();
	} 

}
