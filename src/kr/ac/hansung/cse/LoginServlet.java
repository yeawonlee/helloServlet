package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet") // 아래 LoginServlet 클래스의 URL을 매핑시켜줌
// HttpServlet으로부터 상속을 받기 때문에 서블릿의 기능을 수행하게 됨
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    // 사용자가 POST 메서드를 보내왔을 경우에 처리를 하기 위해서 doPost 메서드 구현
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*	Tomcat은 HttpServletRequest의 객체 request, HttpServletResponse의 객체 response를 각각 만들어서
			HttpServletRequest의 주소값을 request에, HttpServletResponse의 주소 값을 response에 넣어줌		*/
		
		// Read from data
		String username = request.getParameter("username"); // 입력한 username
		String password = request.getParameter("password"); // 입력한 password를 받아옴
		
		// Process: access to database, (그거에 따라서) perform(처리) business logic
		
		// Build HTML code
		PrintWriter out = response.getWriter();
		
		// html 코드를 실제로 만들어주는 거죠
		String htmlResponse = "<html>";
		htmlResponse += "<h2> Your username is " + username + "<br/>";
		htmlResponse += "<h2> Your password is " + password + "<br/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse); // out에다가 println해서 String(htmlResponse)을 쓰게 되면, 해당되는 html 웹 페이지가 만들어서 클라이언트에게 전달됨?
	}
}
