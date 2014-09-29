package tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *Sep 27, 2013  Nanjing,njupt,China
 */
public class ZTreeDemoAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3318989776253565435L;
    
	private int treeNodeId;//
	private String treeNodeName;
	/**
	 * 
	 * @return
	 */
	public String getNodesDataById(){
		
		System.out.println("treeNodeId = "+treeNodeId);
		System.out.println("treeNodeName="+treeNodeName);
		String iconPath = ",icon:\"zTree/css/zTreeStyle/img/diy/3.png\"";
		String icon2Path = ",icon:\"zTree/css/zTreeStyle/img/diy/2.png\"";
		String icon9Path = ",icon:\"zTree/css/zTreeStyle/img/diy/9.png\"";
		String lookIconPath = ",icon:\"zTree/css/zTreeStyle/img/diy/8.png\"";
		String nodesJson = "";
		if (treeNodeId == 1) {
			nodesJson = "["+ 
		    "{id:11, pId:"+treeNodeId+", name: \"罗子发\",isParent:false"+iconPath+"}," +
            "{id:12, pId:"+treeNodeId+", name: \"欧阳健生\",isParent:false"+iconPath+"},"+
            "{id:13, pId:"+treeNodeId+", name: \"洪磊\",isParent:false"+iconPath+"}," +
            "{id:14, pId:"+treeNodeId+", name: \"叶锦伟\",isParent:false"+iconPath+"},"+
            "{id:15, pId:"+treeNodeId+", name: \"张晓轩\",isParent:false"+iconPath+"},"+
            "{id:16, pId:"+treeNodeId+", name: \"王修祥\",isParent:false"+iconPath+"},"+
            "]";
			System.out.println(nodesJson);
		}else if(treeNodeId == 2) {
			nodesJson = "["+ 
			"{id:21, pId:"+treeNodeId+", name: \"贾永慧\",isParent:false"+iconPath+"}," +
		    "{id:12, pId:"+treeNodeId+", name: \"裴胜春\",isParent:false"+iconPath+"},"+
		    "{id:13, pId:"+treeNodeId+", name: \"孔庆岩\",isParent:false"+iconPath+"}," +
		    "{id:14, pId:"+treeNodeId+", name: \"李松\",isParent:false"+iconPath+"},"+
		    "{id:14, pId:"+treeNodeId+", name: \"孙雷\",isParent:false"+iconPath+"},"+
		    "{id:14, pId:"+treeNodeId+", name: \"侯捷\",isParent:false"+iconPath+"},"+
		    "]";
		}else if (treeNodeId == 3) {
			nodesJson = "["+ 
			"{id:11, pId:"+treeNodeId+", name: \"史文明\",isParent:false"+iconPath+"}," +
		    "{id:12, pId:"+treeNodeId+", name: \"王晓新\",isParent:false"+iconPath+"},"+
		    "{id:13, pId:"+treeNodeId+", name: \"陈明\",isParent:false"+iconPath+"}," +
		    "{id:14, pId:"+treeNodeId+", name: \"王帅\",isParent:false"+iconPath+"},"+
		    "]";
		}else{
			nodesJson = "[]";
		}
		getPrintWriter().write(nodesJson);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public static HttpServletResponse getResponse() {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		return response;
	}
	
	public PrintWriter getPrintWriter() {
		PrintWriter pw = null;
		try {
			pw = getResponse().getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pw;
	}

	public int getTreeNodeId() {
		return treeNodeId;
	}

	public void setTreeNodeId(int treeNodeId) {
		this.treeNodeId = treeNodeId;
	}
	
	public String getTreeNodeName() {
		return treeNodeName;
	}
	
	public void setTreeNodeName(String treeNodeName) {
		this.treeNodeName = treeNodeName;
	}
	
}