package database;

import java.sql.*;
import java.util.*;
import logic.Plane;

/**
 *
 * @author 802249
 */
public class Planebase extends Plane {
    
    
    public static void add_plane(Connection conn, Plane pl) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "INSERT INTO PLANE (TANK_VOLUME,MODEL) VALUES ( "+ pl.get_tanklvolume() +", '"+ pl.get_planemodel() +"');";
        stmt.execute(req);
        
    }
    
    public static void fill_planelist(Connection conn) throws SQLException
    {
        Plane pl = new Plane(1,"model1",500);
        add_plane(conn,pl);
        pl = new Plane(1,"model2",1000);
        add_plane(conn,pl);
        pl = new Plane(1,"model3",2000);
        add_plane(conn,pl);
        pl = new Plane(1,"model4",1500);
        add_plane(conn,pl);
    }
    
    public static Plane get_plane(Connection conn, String model) throws SQLException
    {
        ResultSet rs;
        Statement stmt = conn.createStatement();
        
        String req = "SELECT * FROM PLANE WHERE MODEL ='" + model+ "'";
        
        rs = stmt.executeQuery(req);
        rs.next();
        Plane pl = new Plane(rs.getInt("ID"),rs.getString("MODEL"),rs.getInt("TANK_VOLUME"));
        
        return pl;      
    }
    
    public static Plane get_plane_by_id(Connection conn, int id) throws SQLException
    {
        ResultSet rs;
        Statement stmt = conn.createStatement();
        
        String req = "SELECT * FROM PLANE WHERE ID ='" + id+ "'";
        
        rs = stmt.executeQuery(req);
        rs.next();
        Plane pl = new Plane(rs.getInt("ID"),rs.getString("MODEL"),rs.getInt("TANK_VOLUME"));
        
        return pl;   
    }
    
    public static void clear_planes_table(Connection conn) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "DELETE FROM PLANE;";
        stmt.execute(req);
        req = "ALTER SEQUENCE GEN_PLANE_ID RESTART WITH 0";
        stmt.execute(req);
    }
    
    /*
    private final String preparedSave = "INSERT INTO Plane (ID, PLANEMODEL, TANKVOLUME)" + "VALUES (?, ?, ?)" + "ON DUPLICATE KEY UPDATE ID=?, PLANEMODEL=?, TANKVOLUME=?";
    
    public void save() {
        try {
            PreparedStatement prepared = MySqlUtil.extractConnection(this).prepareStatement(preparedSave, Statement.RETURN_GENERATED_KEYS);
            prepared.setInt(1, get_planeid());
            prepared.setString(2, get_planemodel());
            prepared.setInt(3, get_tanklvolume());
            
            prepared.execute();
            ResultSet rs = prepared.getGeneratedKeys();
            if (rs.next())
                set_id(rs.getInt(1));
        } catch (SQLException ex) {
            throw new IllegalStateException("Can not save new plane.", ex);
        }
    }
    
    public void load(ResultSet resultSet) {
        try {
            this.set_id(resultSet.getInt("ID"));
            this.set_planemodel(resultSet.getString("PLANEMODEL"));
            this.set_tankvolume(resultSet.getInt("TANKVOLUME"));
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Can not load new plane.", ex);
        }
    }
    */
}
