package com.example.coursework.database.user_registration;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BasicToy {
  private final IntegerProperty id;
  private final StringProperty name;
  private final StringProperty type;
  private final StringProperty age;
  private final StringProperty size;
  private final IntegerProperty cost;

  public BasicToy() {
    id = new SimpleIntegerProperty(this, "id");
    name = new SimpleStringProperty(this, "Name");
    type = new SimpleStringProperty(this, "Type");
    age = new SimpleStringProperty(this, "Age");
    size  = new SimpleStringProperty(this, "Size");
    cost = new SimpleIntegerProperty(this, "Cost");
  }

  public int getId() {
    return id.get();
  }

  public IntegerProperty idProperty() {
    return id;
  }

  public void setId(int id) {
    this.id.set(id);
  }

  public String getName() {
    return name.get();
  }

  public StringProperty nameProperty() {
    return name;
  }

  public void setName(String name) {
    this.name.set(name);
  }

  public String getType() {
    return type.get();
  }

  public StringProperty typeProperty() {
    return type;
  }

  public void setType(String type) {
    this.type.set(type);
  }

  public String getAge() {
    return age.get();
  }

  public StringProperty ageProperty() {
    return age;
  }

  public void setAge(String age) {
    this.age.set(age);
  }

  public String getSize() {
    return size.get();
  }

  public StringProperty sizeProperty() {
    return size;
  }

  public void setSize(String size) {
    this.size.set(size);
  }

  public int getCost() {
    return cost.get();
  }

  public IntegerProperty costProperty() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost.set(cost);
  }
}
