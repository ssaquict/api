/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author SistemasU
 */
public class api_cliente {
    public String get(){
        String salida="";
        
        try{
            URL url = new URL("https://localhost:5001/api/clientes");
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("GET");
            c_api.setRequestProperty("Accept", "application/json");
            if(c_api.getResponseCode()==200){
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida = lectura.readLine();
            
            }else{
                
                System.out.println("No de puede conectar a la api" + c_api.getResponseCode());
                //salida="";
            }
            c_api.disconnect();
            
        }catch(IOException ex){
            System.out.println("Error api:" + ex.getMessage());
        }
        return salida;
    }
}
