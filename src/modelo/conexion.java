/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Anthony Giron
 */
public class conexion {
    /*nombre del servidor = localhost
    puerto = 3306
    Usuario = root
    Contraseña = Vilebrequin1
    Driver conecxion = com.mysql.cj.jbdc.Drive
    urlConexion (cadena conexion) :
    tipo conextor(jbdc),mysql,nombres del servidor, puerto, base de datos
    */
    
    private final String puerto = "3306";
    private final String bd = "db_empresas";
    private final String urlConexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,bd);
    private final String usuario = "usr_empresa";
    private final String contra = "Empres@123";
    private final String jdbc = "com.mysql.cj.jdbc.Driver";
    public Connection conexionBD; 
    public void abrir_conexion(){
        try{
            Class.forName(jdbc);
            conexionBD=DriverManager.getConnection(urlConexion,usuario,contra);
            System.out.println("Conexion exitosa" );
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Algo salio mal :( " + ex.getMessage());
        }
    }
    public void cerrar_conexion(){
    try{
        conexionBD.close();
        }
        catch (SQLException ex){
            System.out.println("Algo salio mal :( "+ ex.getMessage());
       
    }
}
}
