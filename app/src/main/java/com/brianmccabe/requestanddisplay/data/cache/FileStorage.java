package com.brianmccabe.requestanddisplay.data.cache;

import android.content.Context;

import com.brianmccabe.requestanddisplay.model.Cars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public class FileStorage {
  String filename = "CarResponse";
  FileOutputStream fileOutputStream;
  Context context;

  public FileStorage(Context context) {
    this.context = context;
  }

  public void StoreFile(Cars cars) {
    try {
      fileOutputStream = context.openFileOutput(filename, Context.MODE_PRIVATE);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(cars);
      objectOutputStream.close();
      fileOutputStream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Cars retrieveLatest() {
    try {
      FileInputStream fileInputStream = context.openFileInput(filename);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      Cars cars = (Cars) objectInputStream.readObject();
      objectInputStream.close();
      fileInputStream.close();
      return cars;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }

}
