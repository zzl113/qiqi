package com.lechenggu.tgoods.dao.impl;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 

import org.springframework.stereotype.Repository;

import Util.BaseDaoImpl;
 


import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.dao.IgoodsDao;
import com.lechenggu.tgoods.entity.Tgoods;
@Repository
public class IgoodsDaoImpl extends BaseDaoImpl implements IgoodsDao {

	@Override
	public int QueryGoods() {

		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select count(*) cu from tgoods");
			rs = ps.executeQuery();
			rs.next();
			return rs.getInt("cu");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			//JdbcUtil.CloseAll(con, ps, rs);
		}
	}

	@Override
	public List<Tgoods> querGoods(int pgNo, int pgSe) {
		// 打开连接
		Connection con = getConnection();
		PreparedStatement pss = null;
		ResultSet rs = null;

		List<Tgoods> a = new ArrayList<Tgoods>();
		try {
			// 创建执行sql语句的statment/PreparedStatement 对象
			pss = con
					.prepareStatement("select * from tgoods a inner join tcategorysecond b on a.catesecid=b.id inner join (select * from(select t.*,rownum rn from(select * from tgoods order by id desc) t where rownum<=?) where rn>?)d on a.id=d.id");

			pss.setInt(1, pgNo * pgSe);
			pss.setInt(2, (pgNo - 1) * pgSe);
			// 得到结果集，变成实体类对象
			rs = pss.executeQuery();
			while (rs.next()) {
				Tgoods p = new Tgoods();
				p.setGoodsname(rs.getString("goodsname"));
				p.setPrice(rs.getInt("Price"));
				p.setCatesecid(rs.getInt("catesecid"));
				p.setId(rs.getInt("id"));
				p.setSucount(rs.getInt("sucount"));
				p.setSpic(rs.getString("spic"));

				p.setGdescribe(rs.getString("Gdescribe"));
				p.setIstop(rs.getInt("istop"));
				p.setCatesname(rs.getString("catesname"));

				a.add(p);
			}
			return a;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} finally {

			//JdbcUtil.CloseAll(con, pss, rs);

		}
	}

	@Override
	public int addTgoods(Tgoods good) {
		// 打开连接
		Connection conn = getConnection();
		PreparedStatement pss = null;
		ResultSet rss = null;

		int i = -1;
		try {

			pss = conn
					.prepareStatement("INSERT INTO tgoods (id, goodsname, price, catesecid, sucount, spic, gdescribe,creatuser, creattime, modifyuser, modifytime ) VALUES (null, ?, ?, ?, ?, ?, ?, ?, sysdate, ?, sysdate)");
			pss.setString(1, good.getGoodsname());
			pss.setInt(2, good.getPrice());
			pss.setInt(3, good.getCatesecid());
			pss.setInt(4, good.getSucount());
			pss.setString(5, good.getSpic());

			pss.setString(6, good.getGdescribe());
			pss.setInt(7, good.getCreatuser());
			pss.setInt(8, good.getModifyuser());

			i = pss.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//JdbcUtil.CloseAll(conn, pss, null);
		}
		return i;

	}

	@Override
	public List<Tcategorysecond> querySmallBig(int BigId) {
		// 打开连接
		Connection conn = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Tcategorysecond> a = new ArrayList<Tcategorysecond>();

		try {

			ps = conn
					.prepareStatement("SELECT  * FROM tcategorysecond t where pid=?");
			ps.setInt(1, BigId);

			rs = ps.executeQuery();

			while (rs.next()) {

				Tcategorysecond p = new Tcategorysecond();
				p.setCatesname(rs.getString("catesname"));
				p.setCreattime(rs.getDate("creattime"));
				p.setCreatuser(rs.getInt("creatuser"));
				p.setId(rs.getInt("id"));
				p.setPid(rs.getInt("pid"));
				p.setModifytime(rs.getDate("modifytime"));
				p.setModifyuser(rs.getInt("modifyuser"));

				a.add(p);
			}

			return a;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} finally {

			//JdbcUtil.CloseAll(conn, ps, rs);
		}
	}

	@Override
	public Tgoods queryGoods(int id) {
		// 打开连接
		Connection conn = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Tcategorysecond> a = new ArrayList<Tcategorysecond>();

		try {

			ps = conn.prepareStatement("SELECT  * FROM tgoods t where id=?");
			ps.setInt(1, id);

			rs = ps.executeQuery();
			while (rs.next()) {

				Tgoods p = new Tgoods();
				p.setGoodsname(rs.getString("goodsname"));
				p.setCatesecid(rs.getInt("catesecid"));
				p.setSpic(rs.getString("spic"));
				p.setPrice(rs.getInt("price"));
				p.setIstop(rs.getInt("istop"));
				p.setSucount(rs.getInt("sucount"));

				p.setId(rs.getInt("id"));

				p.setModifytime(rs.getDate("modifytime"));
				p.setModifyuser(rs.getInt("modifyuser"));

				return p;

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			//JdbcUtil.CloseAll(conn, ps, rs);
		}

		return null;
	}

	@Override
	public List<Tcategory> queryAllcategory() {
		// 打开连接
		Connection conn = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Tcategory> c = new ArrayList<Tcategory>();

		try {
			ps = conn.prepareStatement("select * from tcategory");
			rs = ps.executeQuery();
			while (rs.next()) {
				Tcategory t = new Tcategory();
				t.setCatename(rs.getString("catename"));
				t.setCreattime(rs.getDate("createtime"));
				t.setCreatuser(rs.getInt("creatuser"));
				t.setId(rs.getInt("id"));
				t.setModifytime(rs.getDate("modifytime"));
				t.setModifyuser(rs.getInt("modifyuser"));
				c.add(t);

			}
			return c;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} finally {

			//JdbcUtil.CloseAll(conn, ps, rs);

		}
	}

	@Override
	public List<Tcategorysecond> chaxunSmallBig(int csid) {
		// 打开连接
		Connection con = getConnection();
		PreparedStatement pss = null;
		ResultSet rs = null;
		List<Tcategorysecond> st = new ArrayList<Tcategorysecond>();

		try {
			String sql = "select * from Tcategorysecond where id=?";
			pss = con.prepareStatement(sql);
			pss.setInt(1, csid);
			rs = pss.executeQuery();
			while (rs.next()) {

				Tcategorysecond p = new Tcategorysecond();

				p.setCatesname(rs.getString("catesname"));
				p.setCreattime(rs.getDate("creattime"));
				p.setCreatuser(rs.getInt("creatuser"));

				p.setId(rs.getInt("id"));
				p.setPid(rs.getInt("pid"));
				p.setModifytime(rs.getDate("modifytime"));
				p.setModifyuser(rs.getInt("modifyuser"));

				st.add(p);

			}
			return st;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			//JdbcUtil.CloseAll(con, pss, rs);

		}
		return null;
	}

	@Override
	public void updateTgoods(Tgoods tg) {
		String sql = "update tgoods set goodsname=?,Price=?,catesecid=?,Sucount=?,";
		if (tg.getSpic() != null) {
			sql += "spic=?,";
		}
		sql += "gdescribe=?,Modifyuser=?,creatuser=?,istop=1,modifytime=sysdate,creattime=sysdate where id=?";

		// 打开连接
		Connection con = getConnection();
		PreparedStatement pss = null;

		try {

			pss = con.prepareStatement(sql);
			int i = 1;
			pss.setString(i++, tg.getGoodsname());
			pss.setDouble(i++, tg.getPrice());
			pss.setInt(i++, tg.getCatesecid());
			pss.setInt(i++, tg.getSucount());
			if (tg.getSpic() != null) {
				pss.setString(i++, tg.getSpic());
			}
			pss.setString(i++, tg.getGdescribe());
			pss.setInt(i++, tg.getModifyuser());
			pss.setInt(i++, tg.getCreatuser());
			pss.setInt(i++, tg.getId());

			pss.execute();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			//JdbcUtil.CloseAll(con, pss, null);

		}

	}

	@Override
	public void deleteTgoods(int id) {
		PreparedStatement pss = null;
		// 打开连接
		Connection con = getConnection();
		try {
			pss = con.prepareStatement("delete from tgoods where id=?");
			pss.setInt(1, id);
			pss.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			//JdbcUtil.CloseAll(null, pss, null);

		}

	}

}
