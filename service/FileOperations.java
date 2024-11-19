package service;

import java.io.IOException;
import model.FamilyTree;
import model.Person;

public interface FileOperations<T extends Person> {
    void saveToFile(FamilyTree<T> familyTree, String fileName) throws IOException;
    FamilyTree<T> loadFromFile(String fileName) throws IOException,ClassNotFoundException;
}

