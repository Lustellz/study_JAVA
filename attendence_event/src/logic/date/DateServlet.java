package logic.date;

import java.util.Date;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DateServlet extends HttpServlet {
	
	public boolean validity = false;
	
	public String result = (validity) ? "성공":"실패" ;
	
@Override
		public void init() throws ServletException{
			System.out.println("init"+new Date());
	}
	
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
		ServletException, IOException{
			System.out.println("doGet " + validity);
	}

@Override
public void destroy(){

	System.out.println("destroy "+ result);
}
}
