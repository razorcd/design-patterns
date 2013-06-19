package com.snippets.designpatterns.structural.facade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Facade class to deal with files and folders.
 * Hides implementation.
 */
public class FileFacade {

    public byte[] readFile(Path filePath) throws RuntimeException {
        try {
            return Files.readAllBytes(filePath);
        } catch (IOException ex) {
            throw new RuntimeException("IO error during reading file '" +
                    filePath + "'. " + ex.getMessage());
        }
    }

    public void createFile(Path filePath, byte[] bytes) throws RuntimeException {
        try {
            Files.write(filePath, bytes);
        } catch (IOException ex) {
            throw new RuntimeException("IO error during creation of file '" + filePath + "'. " + ex.getMessage());
        }
    }

    public void overwriteFile(Path filePath, byte[] bytes) {
        try {
            Path backupPath = filePath.getParent().resolve("file" + UUID.randomUUID() + ".backup");
            Files.move(filePath, backupPath);
            Files.write(filePath, bytes);
            Files.delete(backupPath);
        } catch (IOException ex) {
            throw new RuntimeException("IO error during creation of file '" + filePath + "'. " + ex.getMessage());
        }
    }

    public void createDirectory(Path path) throws RuntimeException {
        try {
            Files.createDirectory(path);
        } catch (IOException ex) {
            throw new RuntimeException("IO error during creation of folder '" + path + "'.");
        }
    }

    public void createDirectoryIfDoesNotExist(Path path) throws RuntimeException {
        try {
            if (!path.toFile().exists()) Files.createDirectory(path);
        } catch(IOException ex) {
            throw new RuntimeException("IO exception during main source folder creation."); // TODO: create custom Exceptions
        }
    }

    public List<String> getAllDirectories(Path path) {
        try (Stream<Path> paths = Files.list(path)) {
            return paths.filter(p -> p.toFile().isDirectory())
                    .map(p -> p.getFileName().toString())
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            throw new RuntimeException("IO exception during listing all directories. " + ex.getMessage());
        }
    }

    public boolean fileExists(Path path) {
        return path.toFile().exists();

    }
}
