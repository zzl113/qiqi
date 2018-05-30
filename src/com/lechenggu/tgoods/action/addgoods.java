package com.lechenggu.tgoods.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;
import com.lechenggu.tgoods.entity.Tgoods;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
<<<<<<< HEAD
@Scope("prototype")
@Controller("addAction")
=======

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class addgoods extends ActionSupport {
	private Tgoods tg;

	public Tgoods getTg() {
		return tg;
	}

	public void setTg(Tgoods tg) {
		this.tg = tg;
	}

	private List<Tcategory> cate;
	private List<Tcategorysecond> scate;

	public List<Tcategorysecond> getScate() {
		return scate;
	}

	public void setScate(List<Tcategorysecond> scate) {
		this.scate = scate;
	}

	private int bigId;

	public int getBigId() {
		return bigId;
	}

	public void setBigId(int bigId) {
		this.bigId = bigId;
	}

	public List<Tcategory> getCate() {
		return cate;
	}

	public void setCate(List<Tcategory> cate) {
		this.cate = cate;
	}

<<<<<<< HEAD
	private IcategoryBiz ct ;

	public IcategoryBiz getCt() {
		return ct;
	}

	public void setCt(IcategoryBiz ct) {
		this.ct = ct;
	}

	public IgoodsBiz getGb() {
		return gb;
	}

	public void setGb(IgoodsBiz gb) {
		this.gb = gb;
	}
@Autowired
	private IgoodsBiz gb;
=======
	private IcategoryBiz ct = new CateBizImpl();

	private IgoodsBiz gb = new IgoodsBizImpl();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

	@Override
	public String execute() throws Exception {
		cate = ct.queryAllCa();

		return super.execute();
	}

	public String quScaate() {

		scate = gb.querySmallBig(bigId);

		return "chenggong";

	}

	private File tpois;

	public File getTpois() {
		return tpois;
	}

	public void setTpois(File tpois) {
		this.tpois = tpois;
	}

	private String tpoisFileName;// 接收原始文件名

	public String getTpoisFileName() {
		return tpoisFileName;
	}

	public void setTpoisFileName(String tpoisFileName) {
		this.tpoisFileName = tpoisFileName;
	}

	public String getTpoisContentType() {
		return tpoisContentType;
	}

	public void setTpoisContentType(String tpoisContentType) {
		this.tpoisContentType = tpoisContentType;
	}

	private String tpoisContentType;// 接收内容类型

	public String addTgoods() {

		// 得到绝对的目标路径targetFolder
		String targetFolder = ServletActionContext.getServletContext()
				.getRealPath("/data");
		// 移动到自定义的目录下targetFolder
		boolean isSuccess = tpois.renameTo(new File(targetFolder + "/"
				+ tpoisFileName));
		if (!isSuccess) {// 如果移动文件失败 ，拷贝，复制 文件到目标文件名
			FileInputStream fins = null;
			FileOutputStream fout = null;
			try {

				// 1,使用输入流 读取源文件
				fins = new FileInputStream(tpois);
				// 设置上传文件的最大大小限制
				byte[] buffer = new byte[8192];
				// 将文件内容读入到buffer，len是读到的字节数
				int len = fins.read(buffer);
				// 打开目标文件输出流
				fout = new FileOutputStream(new File(targetFolder + "/"
						+ tpoisFileName));
				while (len > 0) {
					// 如果读取到了数据将buffer中的有效字节，写入输出流
					fout.write(buffer, 0, len);// 将buffer中从第0个字节开始到len个字节吸入输出流
					// 循环读取
					len = fins.read(buffer);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (fins != null) {
						// 关闭输入流
						fins.close();
					}

				} catch (Exception e2) {
					e2.printStackTrace();
				}

				try {
					if (fout != null) {
						// 关闭输出流
						fout.close();
					}

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}

		}
		Tuser user = (Tuser) ActionContext.getContext().getSession()
				.get("user");
		tg.setCreatuser(user.getId());
		tg.setModifyuser(user.getId());
		tg.setSpic("data" + "/" + tpoisFileName);
		int t = gb.addTgoods(tg);

		if (t > 0) {

			return "keyi";
		} else {
			return "hehe";
		}

	}

}
