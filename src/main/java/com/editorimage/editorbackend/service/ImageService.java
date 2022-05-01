package com.editorimage.editorbackend.service;

import com.editorimage.editorbackend.dto.ImageDTO;

import java.util.List;

public interface ImageService {
    public List<ImageDTO> getImage() throws Exception;
}
