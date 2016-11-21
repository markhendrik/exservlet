package exservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().print("Hello!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String input = Util.asString(req.getInputStream());

//        Person person = new ObjectMapper().readValue(input, Person.class);
        System.out.println(input);

       /* person.setName("Thoomas");
        person.setId(2L);

        resp.setContentType("application/json");

        new ObjectMapper().writeValue(resp.getOutputStream(), person);*/
    }
}
