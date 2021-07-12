package com.epam.shape.reader;

import com.epam.shape.exception.ShapeException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public List<String> readFromFile(String filepath) throws ShapeException {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(filepath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ShapeException("File not found", e);
        }
        return lines;
    }

}
