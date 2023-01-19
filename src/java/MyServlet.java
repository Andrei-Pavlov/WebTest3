/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.Author;
import entity.Books;
import entity.Reader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pupil
 */
@WebServlet(urlPatterns = {"/MyServlet","/page2","/bookspage","/reader"})
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if("/page2".equals(request.getServletPath())){
            request.setAttribute("inf", "Эта информация передана из жава в жсп страницу");
            request.getRequestDispatcher("/WEB-INF/page2.jsp").forward(request,response);
        }
        if("/bookspage".equals(request.getServletPath())){
            Author author = new Author();
            author.setFirstname("Tolstoi ");
            author.setLastname("Lev");
            List<Author> authors = new ArrayList<>();
            authors.add(author);
            Books book = new Books();
            book.setName("Война и мир");
            book.setAuthors(authors);
            book.setPublishedYear(2010);
            book.setQuantity(3);
            book.setCount(3);
            List<Books> books = new ArrayList<>();
            books.add(book);
            author.setBooks(books);
            request.setAttribute("books", book);
//            request.setAttribute("author", author.getFirstname()+author.getLastname());
            request.getRequestDispatcher("/bookspage.jsp").forward(request,response);
        }
        if ("/reader".equals(request.getServletPath())){
            Reader reader = new Reader();
            reader.setFirstname("Stefan");
            reader.setLastname("Robalko");
            request.setAttribute("reader", reader);
            request.getRequestDispatcher("/reader.jsp").forward(request,response);
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
