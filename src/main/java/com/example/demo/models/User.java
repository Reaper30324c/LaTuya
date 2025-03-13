package com.example.demo.models;
import com.example.demo.helper.enums.UserEnum;
import jakarta.persistence.*;

@Entity
@Table (name="userTable")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "name", length = 100, unique = true, nullable = false)
    private String name;
    @Column(name = "email", length = 150, unique = true, nullable = false)
    private String email;
    @Column(length = 250, nullable = false)
    private String password;
    @Column(length = 20)
    private String phone;
    @Column(nullable = false)
    private UserEnum usertype;

    public User() {
    }
    public User(Integer id, String name, String email, String password, String phone, UserEnum usertype) {
        this.idUser = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.usertype = usertype;
    }

    public Integer getId() {
        return idUser;
    }

    public void setId(Integer id) {
        this.idUser = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserEnum getUsertype() {
        return usertype;
    }

    public void setUsertype(UserEnum usertype) {
        this.usertype = usertype;
    }
}
