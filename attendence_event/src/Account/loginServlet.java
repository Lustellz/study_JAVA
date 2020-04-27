package Account;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Account/login")
public class loginServlet extends HttpServlet{
	
	boolean validity = false;
	String status = (validity)?"ȸ��":"��ȸ��";
	
	@Override
	public void init() {
		System.out.println("init login");
}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("doget"+validity);
		doHandle(request,response);
	}	
	
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException{
		System.out.println("doPost " + validity);
		doHandle(req,resp);
}

private void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	req.setCharacterEncoding("utf-8");
	resp.setContentType("text/html;charset=utf-8");
	PrintWriter out = resp.getWriter();
	String id = req.getParameter("user_id");
	String pw = req.getParameter("user_pw");
	String address = req.getParameter("user_address");
	
	String data = "<html>";
	data += "<body>";
	data+= "����� alert ������ �������ΰ�? <- yes!!!!";
	data += "�ּ�: "+ address;
	data += "</body>";
	data+="</html>";
	out.print(data);
	System.out.println("id");
	System.out.println("password");
	
	
}

@Override
public void destroy(){

System.out.println("destroy "+ status);
}
	
}
