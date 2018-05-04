package com.bol.test.assignment.image;

public class Image {

    private String name;
    private Format format;
    private Long size;

    public Image(String name, Format format, Long size) {
        this.name = name;
        this.format = format;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Format getFormat() {
        return format;
    }

    public Long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                ", format=" + format +
                ", size=" + size +
                '}';
    }
}