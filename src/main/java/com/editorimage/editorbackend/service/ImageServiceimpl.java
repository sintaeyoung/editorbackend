package com.editorimage.editorbackend.service;

import com.editorimage.editorbackend.dao.ImageDAO;
import com.editorimage.editorbackend.dto.ImageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceimpl implements ImageService{


    @Autowired
    ImageDAO imagedao;

    @Override
    public List<ImageDTO> getImage() throws Exception {
        return imagedao.getImage();
    }
}
