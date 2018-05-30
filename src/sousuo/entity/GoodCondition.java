package sousuo.entity;

public class GoodCondition {
    public Integer getSmallCateId() {
		return smallCateId;
	}
	public void setSmallCateId(Integer smallCateId) {
		this.smallCateId = smallCateId;
	}
	public Integer getBigCateId() {
		return bigCateId;
	}
	public void setBigCateId(Integer bigCateId) {
		this.bigCateId = bigCateId;
	}
	public Float getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(Float lowPrice) {
		this.lowPrice = lowPrice;
	}
	public Float getHightPrice() {
		return HightPrice;
	}
	public void setHightPrice(Float hightPrice) {
		HightPrice = hightPrice;
	}
	private Integer smallCateId;//小分类
    private Integer bigCateId; //大分类
    private Float lowPrice;//最低价
    private Float HightPrice;//最高价格
	 
    
}
