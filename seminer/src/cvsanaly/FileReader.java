package cvsanaly;

import java.util.ArrayList;

import seminer.File;

public interface FileReader{
   ArrayList<File> parseFile(int repositoryId, String projectName);
}