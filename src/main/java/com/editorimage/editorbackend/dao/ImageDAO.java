package com.editorimage.editorbackend.dao;

import com.editorimage.editorbackend.dto.ImageDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ImageDAO {
    public List<ImageDTO> getImage() throws Exception;
}
