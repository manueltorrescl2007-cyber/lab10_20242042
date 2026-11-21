package org.example.lab10.DAO;
import org.example.lab10.Dtos.CursoDTO;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoTabla extends DaoBase{
    public ArrayList<CursoDTO> listar() throws SQLException{
        ArrayList<CursoDTO> cursos = new ArrayList<CursoDTO>();
        String sql = "SELECT  id_curso,codigo,nombre , creditos ,"
                + "ORDER BY id_curso";
        try (Connection c = getConection();
             PreparedStatement p = c.prepareStatement(sql);
             ResultSet r = p.executeQuery()) {
            while (r.next()) {
                CursoDTO ct = new CursoDTO();
                ct.setId_curso(r.getInt("id_curso"));
                ct.setCodigo(r.getInt("codigo"));
                ct.setNombre(r.getString("nombre"));
                ct.setCreditos(r.getInt("creditos"));
                cursos.add(ct);
            }
        }
        return cursos;
    }
}
