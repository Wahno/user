package com.hao0129.cloud.user.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author WANGHAO 2019-07-22
 */
@Data
public class User implements Serializable {

    @JSONField(name = "ID")
    protected String id;          //用户ID
    @JSONField(name = "NAME")
    protected String name;        //姓名
    @JSONField(name = "SEX")
    protected String sex;         //性别
    @JSONField(name = "PHONE")
    protected String phone;       //手机号
    @JSONField(name = "QQ")
    protected String qq;          //qq号
    @JSONField(name = "EMAIL")
    protected String email;       //邮箱

    public User(){

    }

    public User(UserBuilder userBuilder){
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.sex = userBuilder.sex;
        this.phone = userBuilder.phone;
        this.qq = userBuilder.qq;
        this.email = userBuilder.email;
    }

    public static class UserBuilder {
        private String id;
        private String name;
        private String sex;
        private String phone;
        private String qq;
        private String email;

        public UserBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder qq(String qq) {
            this.qq = qq;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
