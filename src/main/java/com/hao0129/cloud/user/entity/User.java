package com.hao0129.cloud.user.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WANGHAO 2019-07-22
 */
@Data
public class User implements Serializable {

    protected String id;          //用户ID
    protected String name;        //姓名
    protected String sex;         //性别
    protected String phone;       //手机号
    protected String qq;          //qq号
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
