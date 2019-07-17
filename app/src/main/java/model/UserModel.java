package model;

public class UserModel {


    String nameTv1;
    String nameTv2;

    public String getNameTv1() {
        return nameTv1;
    }

    public void setNameTv1(String nameTv1) {
        this.nameTv1 = nameTv1;
    }

    public String getNameTv2() {
        return nameTv2;
    }

    public void setNameTv2(String nameTv2) {
        this.nameTv2 = nameTv2;
    }


    @Override
    public String toString() {
        return "UserModel{" +
                "nameTv1='" + nameTv1 + '\'' +
                ", nameTv2='" + nameTv2 + '\'' +
                '}';
    }


}
