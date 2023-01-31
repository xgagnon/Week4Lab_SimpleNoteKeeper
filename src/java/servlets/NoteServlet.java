/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xavier
 */
public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // to read files
        String path = getServletContext().getRealPath("/WEB-INF/note.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        //Find string in txt file
        String title = br.readLine();
        String contents = br.readLine();
        
        //Set attributes on jsp
        request.setAttribute("title",title);
        request.setAttribute("contents",contents);
        
        String edit = request.getParameter("edit");
        
        if (edit == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request,response);
        }
        else {
           getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request,response); 
        }
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        // to write to a file
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String title = request.getParameter("titleIn");
        String contents = request.getParameter("contentsIn");
        
        //Write new contents to txt file
        pw.println(title);
        pw.println(contents);
                
        pw.close();
        
        //Set attributes on jsp
        request.setAttribute("title",title);
        request.setAttribute("contents",contents);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request,response);
    }
            
}
