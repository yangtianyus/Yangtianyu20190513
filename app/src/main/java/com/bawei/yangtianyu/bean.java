package com.bawei.yangtianyu;

public class bean {
      private  int type;
      private  String title;
      private  String desc;
      private  String image;
      private  String Images;



    public bean(int type, String title, String desc, String image, String image1) {
        this.type = type;
        this.title = title;
        this.desc = desc;
        this.image = image;
        Images = image1;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "bean{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", image='" + image + '\'' +
                ", Image='" + Images + '\'' +
                '}';
    }
}
