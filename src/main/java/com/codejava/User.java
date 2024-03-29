/*
 * package com.codejava;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.ManyToMany; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "users") public class User {
 * 
 * @Id
 * 
 * @Column(name = "user_id")
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;
 * 
 * @Column(length = 24, nullable=false) private String username;
 * 
 * @Column(length=16,nullable=false) private String password;
 * 
 * @ManyToMany(mappedBy="users") private List<Group> groups=new
 * ArrayList<Group>();
 * 
 * public User() { }
 * 
 * public User(String username, String password) { super(); this.username =
 * username; this.password = password; }
 * 
 * public Integer getId() { return id; }
 * 
 * public void setId(Integer id) { this.id = id; }
 * 
 * public String getUsername() { return username; }
 * 
 * public void setUsername(String username) { this.username = username; }
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * public void addGroup(Group group) { this.groups.add(group); } }
 */