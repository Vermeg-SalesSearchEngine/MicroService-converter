/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vermeg.convertisseur.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.commons.codec.binary.Base64;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Ramzi
 */
public interface ConvService {
    public File load(String id);

    /**
     *
     * @param filethrows
     * @return
     */
    public JSONObject convert(MultipartFile file,String name)throws FileNotFoundException, InvalidFormatException, IOException; 
    public List<String> getSheets(MultipartFile file)throws FileNotFoundException, InvalidFormatException, IOException;
    public JSONObject convert(String file,String name)throws FileNotFoundException, InvalidFormatException, IOException;
}
