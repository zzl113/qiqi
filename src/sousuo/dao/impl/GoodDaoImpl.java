package sousuo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sousuo.dao.IGoodDao;
import sousuo.dao.JdbcUtil;
import sousuo.entity.GoodCondition;
import sousuo.entity.Tgoods;

 

public class GoodDaoImpl implements IGoodDao {
 
	 

	@Override
	public List<Tgoods> queryGoods(GoodCondition goodCon,int pageNo,int pageSize) { 
		String sql = "select tg.*,ts.catesname,tc.catename from tgoods "
				+ "tg,tcategorysecond ts,tcategory tc where  tg.catesecid=ts.id "; 
		 
		if(goodCon!=null) { 
		   if(goodCon.getBigCateId()!=null) {
			  sql += " and tc.id=?";
		   }
		   if(goodCon.getSmallCateId()!=null) {
			   sql += " and ts.id=?";
		   }
		   if(goodCon.getLowPrice()!=null) {
			   sql += " and tg.price>?";
		   }
		   if(goodCon.getHightPrice()!=null) {
			   sql += " and tg.price<?";
		   }  
		} 
		 sql+= " and ts.pid=tc.id order by tg.id desc";
		Connection conn = JdbcUtil.openConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			sql = "select taby.* from (select tabx.*,rownum r from ("+sql+") tabx  where rownum<=?) taby where taby.r>?";
			st = conn.prepareStatement(sql);
			int paramIndex = 0;//由于不确定每个参数的具体位置 因此采用变量做参数索引 每绑定一个参数 就加一
			if(goodCon!=null) {//绑定参数
				  if(goodCon.getBigCateId()!=null) { 
					  st.setLong(++paramIndex,goodCon.getBigCateId());
				   }
				   if(goodCon.getSmallCateId()!=null) {
					   st.setLong(++paramIndex,goodCon.getSmallCateId());
				   }
				   if(goodCon.getLowPrice()!=null) {
					   st.setFloat(++paramIndex, goodCon.getLowPrice());
				   }
				   if(goodCon.getHightPrice()!=null) {
					   st.setFloat(++paramIndex, goodCon.getHightPrice());
				   } 
				   st.setInt(++paramIndex, pageSize*pageNo);
				   st.setInt(++paramIndex, pageSize*(pageNo-1)); 
			} 
			rs = st.executeQuery();
			List<Tgoods> goodsList = new ArrayList<>();
			while (rs.next()) {
				Tgoods good = new Tgoods();
				good.setSpic(rs.getString("spic"));
				good.setCreattime(rs.getDate("Creattime"));
				good.setCreatuser(rs.getInt("Creatuser"));
				good.setCatesecid(rs.getInt("catesecid"));
				good.setGdescribe(rs.getString("Gdescribe"));
				good.setGoodsname(rs.getString("Goodsname"));
				good.setId(rs.getInt("id"));
				good.setIstop(rs.getInt("istop"));
				good.setModifytime(rs.getDate("Modifytime"));
				good.setModifyuser(rs.getInt("Modifyuser"));
				good.setPrice(rs.getInt("price"));
				// good.setSpic(rs.getString("spic"));
				good.setSucount(rs.getInt("sucount"));
				good.setCatename(rs.getString("catename"));
				good.setCatesname(rs.getString("catesname"));
				goodsList.add(good);
			}
			return goodsList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, st, rs);
		}
		return null;
	}
 
	public  int queryGoodsPages(GoodCondition goodCon,int pageSize) { 
		String sql = "select count(*) from tgoods "
				+ "tg,tcategorysecond ts,tcategory tc where  tg.catesecid=ts.id "; 
		 
		if(goodCon!=null) { 
		   if(goodCon.getBigCateId()!=null) {
			  sql += " and tc.id=?";
		   }
		   if(goodCon.getSmallCateId()!=null) {
			   sql += " and ts.id=?";
		   }
		   if(goodCon.getLowPrice()!=null) {
			   sql += " and tg.price>?";
		   }
		   if(goodCon.getHightPrice()!=null) {
			   sql += " and tg.price<?";
		   }  
		} 
		 sql+= " and ts.pid=tc.id ";
		Connection conn = JdbcUtil.openConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try { 
			st = conn.prepareStatement(sql);
			int paramIndex = 0;//由于不确定每个参数的具体位置 因此采用变量做参数索引 每绑定一个参数 就加一
			if(goodCon!=null) {//绑定参数
				  if(goodCon.getBigCateId()!=null) { 
					  st.setLong(++paramIndex,goodCon.getBigCateId());
				   }
				   if(goodCon.getSmallCateId()!=null) {
					   st.setLong(++paramIndex,goodCon.getSmallCateId());
				   }
				   if(goodCon.getLowPrice()!=null) {
					   st.setFloat(++paramIndex, goodCon.getLowPrice());
				   }
				   if(goodCon.getHightPrice()!=null) {
					   st.setFloat(++paramIndex, goodCon.getHightPrice());
				   } 
				   
			} 
			rs = st.executeQuery();
		    rs.next();
		    int totalRows = rs.getInt(1);//总行数
		    int totalPages = totalRows/pageSize;
		    if(totalPages%pageSize>0) {
		    	totalPages ++;
		    }
		    return totalPages;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, st, rs);
		}
		return 0;
	}

}
