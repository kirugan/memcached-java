/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author Кирилл
 */
public class Settings {
    private static Settings instance;
    
    private Map<String, Integer> config;
    
    private Settings() throws FileNotFoundException{
        String configPath = Paths.get(".").toAbsolutePath().normalize().toString() + "\\conf\\basic.yml";
        
        Yaml yaml = new Yaml();
        config = (Map<String, Integer>) yaml.load(new FileInputStream(configPath));
    }
    
    public static Settings getInstance() throws FileNotFoundException{
        if(instance == null){
            instance = new Settings();
        }
        
        return instance;
    }
    
    public int getPort(){
        return config.get("port");
    }
}
