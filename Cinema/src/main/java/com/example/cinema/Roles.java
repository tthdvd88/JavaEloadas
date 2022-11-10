package com.example.cinema;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(nullable = false, unique = true)
    private String Name;
    @ManyToMany(mappedBy = "roles")
    private List<Users> users;
}
