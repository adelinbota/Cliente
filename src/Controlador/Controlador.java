/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw-B
 */
public class Controlador {
    
        public static void encriptar(ArrayList<Cliente> vDatos){
        String datos = "clientes.dat";
        File f = new File(datos);
        
            if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
                try (FileOutputStream fo = new FileOutputStream(f);
                     ObjectOutputStream escribir = new ObjectOutputStream(fo)){
                    
                    escribir.writeObject(vDatos);
                } catch (Exception e) {
                }
        }
        }
        
        public static ArrayList<Cliente> desencriptar(){
           ArrayList<Cliente> vDatos = new ArrayList();
            String datos = "clientes.dat";
            File f = new File(datos);
            if (!f.exists()) {
               try {
                   f.createNewFile();
               } catch (IOException ex) {
                   Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
            try (FileInputStream fo = new FileInputStream(f);
                     ObjectInputStream leer = new ObjectInputStream(fo)){
                    
                    vDatos = (ArrayList<Cliente>) leer.readObject();
                } catch (Exception e) {
                }
            
            return VDatos;
        }
}
