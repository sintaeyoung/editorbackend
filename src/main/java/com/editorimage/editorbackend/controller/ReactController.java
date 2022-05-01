package com.editorimage.editorbackend.controller;


import com.editorimage.editorbackend.dto.ImageDTO;
import com.editorimage.editorbackend.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReactController {

        @Autowired
        ImageService imageservice;

        @GetMapping("/imageEdit")
        public ResponseEntity<List<ImageDTO>> imageEdit(){
                ResponseEntity<List<ImageDTO>> res= null;
                try{
                        List<ImageDTO> idt=imageservice.getImage();
                        res=new ResponseEntity<List<ImageDTO>>(idt, HttpStatus.OK);
                }catch(Exception e){
                        e.printStackTrace();
                        res=new ResponseEntity<List<ImageDTO>>(HttpStatus.BAD_REQUEST);
                }
                return res;
        }
}
