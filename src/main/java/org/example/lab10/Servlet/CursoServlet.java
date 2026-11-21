package org.example.lab10.Servlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import org.example.lab10.Dtos.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;

public class CursoServlet {
    @WebServlet(urlPatterns = {"/eventos", "/tickets", "/reservas"})
    public class LabServlet extends HttpServlet {
        private final CursoDTO id_curso = new CursoDTO();
        private final CursoDTO nombre = new CursoDTO();
        private final CursoDTO codigo = new CursoDTO();
        private final CursoDTO nombre = new CursoDTO();
        private final CursoDTO credito = new CursoDTO();
        private final CursoDTO id_docente = new CursoDTO();









}


