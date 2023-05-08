package com.example.springdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoEntity {
	
@Id
private int Object_Id;
private String Name;
private String Satellites;
private String Atmosphere;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getObject_Id() {
	return Object_Id;
}
public void setObject_Id(int object_Id) {
	Object_Id = object_Id;
}
public String getSatellites() {
	return Satellites;
}
public void setSatellites(String satellites) {
	Satellites = satellites;
}
public String getAtmosphere() {
	return Atmosphere;
}
public void setAtmosphere(String atmosphere) {
	Atmosphere = atmosphere;
}



}
