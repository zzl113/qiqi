package com.lechenggu.tgoods.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

 




<<<<<<< HEAD


import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
=======
import org.apache.struts2.ServletActionContext;
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;
import com.lechenggu.tgoods.entity.Tgoods;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

 

 
<<<<<<< HEAD
@Scope("prototype")
@Controller("upAction")
=======

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class updategoods extends ActionSupport {
private Tgoods gd;
private List<Tcategory> tg;
 private List<Tcategorysecond> cats;
 private int cigId;
 public int getCigId() {
	return cigId;
}
public void setCigId(int cigId) {
	this.cigId = cigId;
}
private String tpoisFileName;
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
public File getTpois() {
	return tpois;
}
public void setTpois(File tpois) {
	this.tpois = tpois;
}
private String tpoisContentType;
 private File tpois;
 
public List<Tcategorysecond> getCats() {
	return cats;
}
public void setCats(List<Tcategorysecond> cats) {
	this.cats = cats;
}
public List<Tcategory> getTg() {
	return tg;
}
public void setTg(List<Tcategory> tg) {
	this.tg = tg;
}
public Tgoods getGd() {
	return gd;
}
public void setGd(Tgoods gd) {
	this.gd = gd;
}
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
//private List<Tcategorysecond> scate;
<<<<<<< HEAD
@Autowired
private IgoodsBiz god;

 public IgoodsBiz getGod() {
	return god;
}
public void setGod(IgoodsBiz god) {
	this.god = god;
}
@Override
=======

private IgoodsBiz god=new IgoodsBizImpl();

 @Override
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	public String execute() throws Exception {
		 gd=god.queryGoods(id);
		tg=god.queryAllcategory();
		cats=god.chaxunSmallBig(gd.getCatesecid());
		cigId=cats.get(0).getPid();
		return super.execute();
	}
 
 
 
 private List<Tcategorysecond> scate; 
 public List<Tcategorysecond> getScate() {
	return scate;
}
public void setScate(List<Tcategorysecond> scate) {
	this.scate = scate;
}
public int getBigId() {
	return bigId;
}
public void setBigId(int bigId) {
	this.bigId = bigId;
}
private int bigId;
 
public String quScaate() {

	scate = god.querySmallBig(bigId);

	return "chenggong";

}

public String updateTgoods(){
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
			gd.setCreatuser(user.getId());
			gd.setModifyuser(user.getId());
			gd.setSpic("data" + "/" + tpoisFileName);
	
	       god.updateTgoods(gd);
	
	
	
	return "hehe";
	
}
	 
}
