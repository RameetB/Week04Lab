package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 814992
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String file;
        String edit = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        title = br.readLine();
        while((file = br.readLine()) != null)
        {
        content = file;
        }
        Note note = new Note(title, content);
        request.setAttribute("note", note);

        if (edit == null || !edit.equals("")) {

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        Note note = new Note(title, content);
        request.setAttribute("note", note);

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        pw.println(title);
        
        pw.println(content);
        
        pw.flush();
        pw.close();

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

    }

}
