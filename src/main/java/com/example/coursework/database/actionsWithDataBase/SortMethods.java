package com.example.coursework.database.actions;

import static com.example.coursework.database.connector.DataBaseConnector.databaseLink;

import com.example.coursework.database.toys_data.BasicToy;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SortMethods {

  public static void getItemsToSQL(PreparedStatement pst, String sqlStatement, ObservableList<BasicToy> toys) throws Exception{
      pst = databaseLink.prepareStatement(sqlStatement);
      ResultSet rs = pst.executeQuery();

        while (rs.next())
        {
          BasicToy st = new BasicToy();
          st.setId(rs.getInt("id_toy"));
          st.setName(rs.getString("name_toy"));
          st.setType(rs.getString("type_toy"));
          st.setAge(rs.getString("age_toy"));
          st.setSize(rs.getString("size_toy"));
          st.setCost(rs.getInt("cost_toy"));
          toys.add(st);
        }
  }

  public static void setItemsToTable(ObservableList<BasicToy> toys,
      TableColumn<BasicToy, Number> idColumn,
      TableView<BasicToy> toysTable, TableColumn<BasicToy, String> nameColumn,
      TableColumn<BasicToy, String> typeColumn, TableColumn<BasicToy, String> ageColumn,
      TableColumn<BasicToy, String> sizeColumn, TableColumn<BasicToy, Number> costColumn) {

    toysTable.setItems(toys);
    idColumn.setCellValueFactory(f -> f.getValue().idProperty());
    nameColumn.setCellValueFactory(f -> f.getValue().nameProperty());
    typeColumn.setCellValueFactory(f -> f.getValue().typeProperty());
    ageColumn.setCellValueFactory(f -> f.getValue().ageProperty());
    sizeColumn.setCellValueFactory(f -> f.getValue().sizeProperty());
    costColumn.setCellValueFactory(f -> f.getValue().costProperty());

  }

  public static void SortTable(){

  }

}
