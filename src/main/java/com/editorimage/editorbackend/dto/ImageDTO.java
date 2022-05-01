package com.editorimage.editorbackend.dto;


public class ImageDTO {
    String imageName;
    int imageNumber;
    public ImageDTO(){}

    public ImageDTO(String imageName, int imageNumber) {
        this.imageName = imageName;
        this.imageNumber = imageNumber;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }
}
