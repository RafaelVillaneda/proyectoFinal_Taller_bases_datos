/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
/**
 *
 * @author Rafael Villaneda
 */

import java.sql.*;
import java.util.*;
import javax.swing.table.*;

// Las filas y columnas del objeto ResultSet se cuentan desde 1 y las filas
// y columnas del objeto JTable se cuentan desde 0. Al procesar filas
// o columnas del objeto ResultSet para usarlas en un objeto JTable, es
// necesario sumar 1 al n�mero de fila o columnas para manipular la
// columna apropiada del objeto ResultSet (es decir, la columna 0 del objeto JTable
// es la columna 1 del objeto ResultSet y la fila 0 del objeto JTable es la fila 1 del objeto ResultSet).
public class ResultSetTableModel extends AbstractTableModel {
   private Connection conexion;
   private Statement instruccion;
   private ResultSet conjuntoResultados;
   private ResultSetMetaData metaDatos;
   private int numeroDeFilas;

   // mantener el registro del estado de la conexi�n a la base de datos
   private boolean conectadoALaBaseDeDatos = false;

   // inicializar conjuntoResultados y obtener su objeto de meta datos;
   // determinar el n�mero de filas
   public ResultSetTableModel( String controlador, String url, String consulta ) throws SQLException, ClassNotFoundException
   {
      // cargar clase de controlador de base de datos
      Class.forName( controlador );

      // conectarse a la base de datos
      conexion = DriverManager.getConnection( url,"root","%Th3-r341-w1z4rd%" );

      // crear objeto Statement para consultar la base de datos
      instruccion = conexion.createStatement(
         ResultSet.TYPE_SCROLL_INSENSITIVE,
         ResultSet.CONCUR_READ_ONLY );

      // actualizar estado de conexi�n a la base de datos
      conectadoALaBaseDeDatos = true;

      // establecer consulta y ejecutarla
      establecerConsulta( consulta );
   }

   // obtener la clase que representa al tipo de columna
   public Class getColumnClass( int columna ) throws IllegalStateException
   {
      // asegurar que la conexi�n a la base de datos est� disponible
      if ( !conectadoALaBaseDeDatos )
         throw new IllegalStateException( "No hay conexion a la base de datos" );

      // determinar la clase de Java de columna
      try {
         String nombreClase = metaDatos.getColumnClassName( columna + 1 );

         // devolver objeto Class que representa a nombreClase
         return Class.forName( nombreClase );
      }

      // atrapar excepciones SQLException y ClassNotFoundException
      catch ( Exception excepcion ) {
         excepcion.printStackTrace();
      }

      // si ocurren problemas arriba, suponer que es tipo Object
      return Object.class;
   }

   // obtener el n�mero de columnas en el objeto ResultSet
   public int getColumnCount() throws IllegalStateException
   {
      // asegurar que la conexi�n a la base de datos est� disponible
      if ( !conectadoALaBaseDeDatos )
         throw new IllegalStateException( "No hay conexion a la base de datos" );

      // determinar el n�mero de columnas
      try {
         return metaDatos.getColumnCount();
      }

      // atrapar excepciones SQLException e imprimir mensaje de error
      catch ( SQLException excepcionSQL ) {
         excepcionSQL.printStackTrace();
      }

      // si ocurren problemas arriba, devolver 0 para el n�mero de columnas
      return 0;
   }

   // obtener el nombre de una columna espec�fica en el objeto ResultSet
   public String getColumnName( int columna ) throws IllegalStateException
   {
      // asegurar que la conexi�n a la base de datos est� disponible
      if ( !conectadoALaBaseDeDatos )
         throw new IllegalStateException( "No hay conexion a la base de datos" );

      // determinar el nombre de la columna
      try {
         return metaDatos.getColumnName( columna + 1 );
      }

      // atrapar excepciones SQLException e imprimir mensaje de error
      catch ( SQLException excepcionSQL ) {
         excepcionSQL.printStackTrace();
      }

      // si hay problemas, devolver cadena vac�a para el nombre de la columna
      return "";
   }

   // devolver el n�mero de filas en el objeto ResultSet
   public int getRowCount() throws IllegalStateException
   {
      // asegurar que la conexi�n a la base de datos est� disponible
      if ( !conectadoALaBaseDeDatos )
         throw new IllegalStateException( "No hay conexion a la base de datos" );

      return numeroDeFilas;
   }

   // obtener el valor en una fila y columna espec�ficas
   public Object getValueAt( int fila, int columna )
      throws IllegalStateException
   {
      // asegurar que la conexi�n a la base de datos est� disponible
      if ( !conectadoALaBaseDeDatos )
         throw new IllegalStateException( "No hay conexion a la base de datos" );

      // obtener un valor en una fila y columna espec�ficas del objeto ResultSet
      try {
         conjuntoResultados.absolute( fila + 1 );

         return conjuntoResultados.getObject( columna + 1 );
      }

      // atrapar excepciones SQLExceptions e imprimir mensaje de error
      catch ( SQLException excepcionSQL ) {
         excepcionSQL.printStackTrace();
      }

      // si hay problemas, devolver objeto cadena vac�a
      return "";
   }

   // establecer nueva cadena de consulta para la base de datos
   public void establecerConsulta( String consulta )
      throws SQLException, IllegalStateException
   {
      // asegurar que la conexi�n a la base de datos est� disponible
      if ( !conectadoALaBaseDeDatos )
         throw new IllegalStateException( "No hay conexion a la base de datos" );

      // especificar consulta y ejecutarla
      conjuntoResultados = instruccion.executeQuery( consulta );

      // obtener meta datos para el objeto ResultSet
      metaDatos = conjuntoResultados.getMetaData();

      // determinar el n�mero de filas en el objeto ResultSet
      conjuntoResultados.last();                   // mover a la �ltima fila
      numeroDeFilas = conjuntoResultados.getRow();  // obtener n�mero de fila

      // notificar al objeto JTable que el modelo ha cambiado
      fireTableStructureChanged();
   }

   // cerrar objetos Statement y Connection
   public void desconectarDeLaBaseDeDatos()
   {
      // cerrar objetos Statement y Connection
      try {
         instruccion.close();
         conexion.close();
      }

      // atrapar excepciones SQLException e imprimir mensaje de error
      catch ( SQLException excepcionSQL ) {
         excepcionSQL.printStackTrace();
      }

      // actualizar estado de conexi�n a la base de datos
      finally {
         conectadoALaBaseDeDatos = false;
      }
   }

}  // fin de la clase ResultSetTableModel




/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
