/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vermeg.convertisseur.rest;

/**
 *
 * @author Ramzi
 */
import com.vermeg.convertisseur.service.ConvService;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
/* The result will be exposed to the url localhost:7000/convert/toJson/ , 
the content of query must includea  multipartfile file!
*/
@Controller
@RequestMapping("/convert")
public class ConvertController {
  private static final Logger LOG = Logger.getLogger(ConvertController.class);
    
    @Autowired
    ConvService convService;
    @RequestMapping(value = "/toJson/" ,method = RequestMethod.POST,produces = "application/json")
     public @ResponseBody String convertXslx(@RequestParam("file") MultipartFile file,@RequestParam("name")String name) throws InvalidFormatException, IOException {         
        // send it back to the client
       // convService.load(id);

 
       // httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return convService.convert(file,name).toString();
    }
        @RequestMapping(value = "/estoJson/" ,method = RequestMethod.POST,produces = "application/json")
     public @ResponseBody String convertXslx(@RequestParam("file") String file,@RequestParam("name")String name) throws InvalidFormatException, IOException {         
        // send it back to the client
       // convService.load(id);

 
       // httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return convService.convert(file,name).toString();
    }
     @RequestMapping(value = "/getSheets/" ,method = RequestMethod.POST,produces = "application/json")
     public @ResponseBody List<String> getSheets(@RequestParam("file") MultipartFile file) throws InvalidFormatException, IOException {         
        // send it back to the client
       // convService.load(id);

 
       // httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return convService.getSheets(file);
    }
     

}