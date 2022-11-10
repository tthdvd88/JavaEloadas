package com.example.cinema;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String UserName;
    private String Email;
    private String Password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    private String Name;
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name="users_roles",
            joinColumns = {@JoinColumn(name="USERS_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name="ROLES_ID", referencedColumnName = "ID")}
    )
    private List<Roles> roles;
}
