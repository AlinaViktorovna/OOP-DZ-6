package service;

import java.io.*;
import model.FamilyTree;
import model.Person;

public class FileOperationsImpl<T extends Person> implements FileOperations<T> {
    @Override
    public void saveToFile(FamilyTree<T> familyTree, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(familyTree);
        }
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public FamilyTree<T> loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (FamilyTree<T>) ois.readObject();
        }
    }
}