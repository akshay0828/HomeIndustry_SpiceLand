package com.spiceland.login.entity;


import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
   @Id
   @Column(name = "role_id")
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer id;
    
   @Column(unique=true)
   private String name;
   
   public Integer getId() {
       return id;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void setId(Integer id) {
	this.id = id;
}

@Override
public String toString() {
	return "Role [id=" + id + ", name=" + name + "]";
}

public Role(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Role() {
	super();
	// TODO Auto-generated constructor stub
}
    
   
}