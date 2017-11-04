
package com.example.chauhan.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Class")
    @Expose
    private String _class;
    @SerializedName("Phone_No")
    @Expose
    private String phoneNo;

    public Result(String a, String b, String c) {
        this.name=a;
        this._class=b;
        this.phoneNo=c;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
